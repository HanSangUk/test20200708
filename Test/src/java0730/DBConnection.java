package java0730;

import java.sql.*;

public class DBConnection {
	public static Connection makeConnection() {
		// static = �׻� ���ӵǾ��ִ�?
		// Connection Ÿ���� ���� con ����
		Connection con = null;
		String user = "TEST200729"; // ������ DB ����
		String password = "1234"; // ������ ������ ���
		String url = "jdbc:oracle:thin:@localhost:1521:xe"; // ����Ŭ �ּҰ�(������?)
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url, user, password);
			System.out.println("DB ���� ����");
		} catch (ClassNotFoundException e) {
			System.out.println("DB ����̹� �ε� ���� " + e.toString());
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("DB ���� ���� " + e.toString());
			e.printStackTrace();
		}
		return con;
	}
}
