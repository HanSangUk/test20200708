package java0716_2;

import java.util.Date;
import java.util.Scanner;

public class Application {
	Scanner scan = new Scanner(System.in);

	public void enter(StudentDTO stu1) {
		System.out.println("Application Ŭ������ enter �޼ҵ�");
		System.out.println(stu1.getName() + " �� �ԽǿϷ� ");
		System.out.println("����ð� : " + new Date());
	}

	public void view(StudentDTO stu1) {
		System.out.println("����Ȯ�� �޴� ����");
		System.out.println(stu1.toString());
	}

	public void modify(StudentDTO stu1) {
		System.out.println("���� ����");
		int sum = 0;
		System.out.println("1. �̸����� | 2. �ּҼ��� | 3. ��ȣ����");
		System.out.print("���� > ");
		sum = scan.nextInt();
		if (sum == 1) {
			String add;
			System.out.print("������ ���� > ");
			add = scan.next();
			stu1.setName(add);
		} else if (sum == 2) {
			String add;
			System.out.print("������ ���� > ");
			add = scan.next();
			stu1.setAdd(add);
		} else if (sum == 3) {
			String add;
			System.out.print("������ ���� > ");
			add = scan.next();
			stu1.setPhone(add);
		}
	}

}
