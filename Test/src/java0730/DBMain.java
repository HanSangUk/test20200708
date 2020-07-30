package java0730;

import java.util.Scanner;

public class DBMain {

	private static final String CustomerDTO = null;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		int selectNum = 0;
		TestDAO tDAO = new TestDAO();
		CustomerDTO customer = null;
		DBService dbService = new DBService();
		while (run) {
			System.out.println("-------------------------------------------");
			System.out.println("0.DB 접속  | 1.전체조회 | 2. 고객등록 | 3. ");
			System.out.println("-------------------------------------------");
			selectNum = scan.nextInt();
			switch (selectNum) {
			case 0:
				tDAO.dbConnection();
				break;
			case 1:
				tDAO.selectAll();
				break;
			case 2:
				System.out.print("이름 : ");
				String name = scan.next();
				System.out.print("주소 : ");
				String address = scan.next();
				System.out.print("전화번호 : ");
				String phone = scan.next();
				customer = new CustomerDTO();
				customer.setName(name);
				customer.setAddress(address);
				customer.setPhone(phone);
				tDAO.insertCustomer(customer);
			}
		}
		scan.close();
	}
}
