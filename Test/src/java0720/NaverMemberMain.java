package java0720;

import java.util.*;

public class NaverMemberMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		NaverMemberDTO naver = null;
		NaverService ser = new NaverService();
		List<NaverMemberDTO> naverList = new ArrayList<NaverMemberDTO>();
		boolean boo = true;
		while (boo) {
			ser.text(naver);
			int sum = scan.nextInt();
			switch (sum) {
			case 1:
				naver = new NaverMemberDTO();
				ser.enter(naver);
				naverList.add(naver);
				break;
			case 2:
				ser.all(naverList);
				break;
			case 3:
				ser.each(naverList);
				break;
			case 4:
				System.out.println("프로그램 종료");
				boo = false;
			}
		}
		scan.close();
	}
}
