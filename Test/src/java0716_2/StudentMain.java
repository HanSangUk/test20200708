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
		Student stu = null;
		
		while(boo) {
			System.out.println("--------------------------------------");
			System.out.println("1.�űԵ�� | 2.�⼮üũ | 3. | 4. | 5.����");
			System.out.println("--------------------------------------");
			System.out.print("���� > ");
			int selectNo = scan.nextInt();
			switch(selectNo) {
			case 1:
				System.out.print("�̸� : ");
				name = scan.next();
				System.out.print("�ּ� : ");
				add = scan.next();
				System.out.print("��ȭ��ȣ : ");
				phone = scan.next();
				stu = new Student(name, add, phone);
				break;
			case 2:
				app.enter(stu);
				break;
			case 3:
				break;
			case 4:
				break;
			
			}
			
		}
		scan.close();

	}

}
