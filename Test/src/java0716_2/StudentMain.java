package java0716_2;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		boolean boo = true;
		String name = "";
		String add = "";
		String phone = "";

		Application app = new Application();
		
		StudentDTO stu1 = null;
		stu1 = new StudentDTO();

		while (boo) {
			System.out.println("----------------------------------------------------------------------------");
			System.out.println("1.�űԵ�� | 2.�⼮üũ | 3. ������ Ȯ�� | 4. ���� ����| 5.���� | 6. DTOŬ���� �̿��� ��ü");
			System.out.println("----------------------------------------------------------------------------");
			System.out.print("���� > ");
			int selectNo = scan.nextInt();
			switch (selectNo) {
			case 1:
				;
				System.out.print("�̸� : ");
				name = scan.next();
				System.out.print("�ּ� : ");
				add = scan.next();
				System.out.print("��ȭ��ȣ : ");
				phone = scan.next();
				stu1.setName(name);
				stu1.setAdd(add);
				stu1.setPhone(phone);
				break;
			case 2:
				app.enter(stu1);
				break;
			case 3:
				// �� ���� Ȯ��(��ü�� ��� ��� �ʵ尪 ���)
				app.view(stu1);
				break;
			case 4:
				// ��������
				// �ּҸ� ����Ư���÷� �ٲٰ� ��� �ʵ尪 ���
				app.modify(stu1);
				break;
			case 6:
				// DTO Ŭ������ �̿��� ��ü ����
				stu1 = new StudentDTO();
			}
		}
		scan.close();
	}
}
