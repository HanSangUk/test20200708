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
			System.out.println("1.신규등록 | 2.출석체크 | 3. 내정보 확인 | 4. 정보 수정| 5.종료 | 6. DTO클래스 이용한 객체");
			System.out.println("----------------------------------------------------------------------------");
			System.out.print("선택 > ");
			int selectNo = scan.nextInt();
			switch (selectNo) {
			case 1:
				;
				System.out.print("이름 : ");
				name = scan.next();
				System.out.print("주소 : ");
				add = scan.next();
				System.out.print("전화번호 : ");
				phone = scan.next();
				stu1.setName(name);
				stu1.setAdd(add);
				stu1.setPhone(phone);
				break;
			case 2:
				app.enter(stu1);
				break;
			case 3:
				// 내 정보 확인(객체에 담긴 모든 필드값 출력)
				app.view(stu1);
				break;
			case 4:
				// 정보수정
				// 주소를 서울특별시로 바꾸고 모든 필드값 출력
				app.modify(stu1);
				break;
			case 6:
				// DTO 클래스를 이용한 객체 생성
				stu1 = new StudentDTO();
			}
		}
		scan.close();
	}
}
