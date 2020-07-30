package java0730;

import java.sql.*;

//DAO(Data Access Object) = �����ͺ��̽�(DB) ���� �� ������ ������ ���� Ŭ����
public class TestDAO {
	Connection con = null;
	// ������ ������ ���� ���Ǵ� Ŭ����
	PreparedStatement pstmt = null;
	// ������ ������ ��������� ���Ǵ� Ŭ����
	ResultSet rs = null; // 3��(C,P,R)�� DB�� ������ �� �⺻���� �����;���

//---------------------------------------------------------------------------------	
	
	public void dbConnection() {
		// static �޼ҵ�� Ŭ�����̸����� ���� ���� ����
		// sqlDB ����? , �ڹٿ� DB�� �������ִ� �޼ҵ�?
		con = DBConnection.makeConnection();
		// Ŀ�ؼ� Ŭ������ �޼ҵ� ȣ��
	}

	// CUSTOMER ���̺� ��ü ��ȸ �޼ҵ�
	public void selectAll() {
		// ������ �������� ������ ����
		String sql = "SELECT * FROM CUSTOMER";
		try {
			// Connection Ŭ�������� �����ϴ�
			// prepareStatement �޼ҵ带 Ȱ���Ͽ� ������ ������ �غ�
			pstmt = con.prepareStatement(sql);
			// ������ �����Ͽ� ���� ����� rs�� ����
			// ����(f9 ������)
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
		// ������ ��뽺 ������ �̸�.NEXTVAL ���
		// ? = �Է��� ���� �شٴ� �ǹ�
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, customer.getName());
			// () ���ڴ� ? �� ����
			pstmt.setString(2, customer.getAddress());
			pstmt.setString(3, customer.getPhone());
			// �� ������ �ڹٿ����� ����ǰ�
			// �� �� ��� ���� �Ѿ�� �����̵ȴ�
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
