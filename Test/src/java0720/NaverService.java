package java0720;

import java.util.*;

public class NaverService {
	Scanner scan = new Scanner(System.in);

//1. 신규 등록 메소드
	void enter(NaverMemberDTO naver) {
		System.out.print("아이디 : ");
		String id = scan.nextLine(); 
		System.out.print("비밀번호 : ");
		String pw = scan.nextLine();
		System.out.print("이름 : ");
		String name = scan.nextLine();
		naver.setId(id);
		naver.setPw(pw);
		naver.setName(name);
	}

//2. 회원 아이디 출력 메소드
	void all(List<NaverMemberDTO> naverList) {
		for (int i = 0; i < naverList.size(); i++) {
			System.out.println(naverList.get(i).getId());
		}

	}

//3. 회원전체 정보 출력 메소드
	void each(List<NaverMemberDTO> naverList) {
		for (int i = 0; i < naverList.size(); i++) {
			System.out.println((i + 1) + "번째 회원");
			System.out.print("아이디 : ");
			System.out.println(naverList.get(i).getId());
			System.out.print("비밀번호 : ");
			System.out.println(naverList.get(i).getPw());
			System.out.print("이름 : ");
			System.out.println(naverList.get(i).getName());
			System.out.println("-----------------------");
		}
	}
// 텍스트 메소드.
	void text(NaverMemberDTO naver) {
		System.out.println("------------------------------------------------");
		System.out.println("1.신규등록 | 2.회원 아이디 출력 | 3. 회원 전체 정보  출력 | 4. 종료");
		System.out.println("------------------------------------------------");
		System.out.print("선택 > ");
	}
}
