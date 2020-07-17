package java0716_2;

import java.util.Date;
import java.util.Scanner;

public class Application {
	Scanner scan = new Scanner(System.in);

	public void enter(StudentDTO stu1) {
		System.out.println("Application 클래스의 enter 메소드");
		System.out.println(stu1.getName() + " 님 입실완료 ");
		System.out.println("현재시간 : " + new Date());
	}

	public void view(StudentDTO stu1) {
		System.out.println("정보확인 메뉴 실행");
		System.out.println(stu1.toString());
	}

	public void modify(StudentDTO stu1) {
		System.out.println("정보 수정");
		int sum = 0;
		System.out.println("1. 이름수정 | 2. 주소수정 | 3. 번호수정");
		System.out.print("선택 > ");
		sum = scan.nextInt();
		if (sum == 1) {
			String add;
			System.out.print("변경할 내용 > ");
			add = scan.next();
			stu1.setName(add);
		} else if (sum == 2) {
			String add;
			System.out.print("변경할 내용 > ");
			add = scan.next();
			stu1.setAdd(add);
		} else if (sum == 3) {
			String add;
			System.out.print("변경할 내용 > ");
			add = scan.next();
			stu1.setPhone(add);
		}
	}

}
