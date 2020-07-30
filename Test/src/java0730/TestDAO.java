package java0730;

import java.sql.*;

//DAO(Data Access Object) = 데이터베이스(DB) 접속 및 쿼리문 전송을 위한 클래스
public class TestDAO {
	Connection con = null;
	// 쿼리문 실행을 위해 사용되는 클래스
	PreparedStatement pstmt = null;
	// 쿼리문 실행결과 저장용으로 사용되는 클래스
	ResultSet rs = null; // 3개(C,P,R)는 DB와 연결할 때 기본으로 가져와야함

//---------------------------------------------------------------------------------	
	
	public void dbConnection() {
		// static 메소드는 클래스이름으로 직접 접근 가능
		// sqlDB 실행? , 자바와 DB를 연결해주는 메소드?
		con = DBConnection.makeConnection();
		// 커넥션 클래스의 메소드 호출
	}

	// CUSTOMER 테이블 전체 조회 메소드
	public void selectAll() {
		// 실행할 쿼리문을 변수로 선언
		String sql = "SELECT * FROM CUSTOMER";
		try {
			// Connection 클래스에서 제공하는
			// prepareStatement 메소드를 활용하여 쿼리문 전송할 준비
			pstmt = con.prepareStatement(sql);
			// 쿼리문 실행하여 실행 결과를 rs에 저장
			// 실행(f9 누른거)
			rs = pstmt.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getInt("CUSTID"));
				System.out.println(rs.getString("NAME"));
				System.out.println(rs.getString("ADDRESS"));
				System.out.println(rs.getString("PHONE"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void insertCustomer(CustomerDTO customer) {
		String sql = "INSERT INTO CUSTOMER(CUSTID, NAME, ADDRESS, PHONE)" + "VALUES(SEQ_CUSTID.NEXTVAL,?,?,?)";
		// 시퀀스 사용스 시퀀스 이름.NEXTVAL 사용
		// ? = 입력할 값을 준다는 의미
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, customer.getName());
			// () 숫자는 ? 의 순서
			pstmt.setString(2, customer.getAddress());
			pstmt.setString(3, customer.getPhone());
			// ↑ 까지는 자바에서만 저장되고
			// ↓ 를 써야 디비로 넘어가서 저장이된다
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
