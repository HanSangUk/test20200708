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
			System.out.println("0.DB ����  | 1.��ü��ȸ | 2. ����� | 3. ");
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
				System.out.print("�̸� : ");
				String name = scan.next();
				System.out.print("�ּ� : ");
				String address = scan.next();
				System.out.print("��ȭ��ȣ : ");
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
