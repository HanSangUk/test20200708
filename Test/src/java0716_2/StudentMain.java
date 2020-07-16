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
			System.out.println("1.신규등록 | 2.출석체크 | 3. | 4. | 5.종료");
			System.out.println("--------------------------------------");
			System.out.print("선택 > ");
			int selectNo = scan.nextInt();
			switch(selectNo) {
			case 1:
				System.out.print("이름 : ");
				name = scan.next();
				System.out.print("주소 : ");
				add = scan.next();
				System.out.print("전화번호 : ");
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
