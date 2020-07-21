package java0720_1;

import java.util.*;

public class BoardService {
	Scanner scan = new Scanner(System.in);
// 텍스트 메소드
	public void text2(BoardDTO enter) {
		System.out.println("----------------------------------------------------------------");
		System.out.println("1. 글쓰기 | 2.전체 글 출력 | 3. 글 수정 | 4. 글삭제 | 5. 전체 글 삭제 | 6. 종료");
		System.out.println("----------------------------------------------------------------");
		System.out.print("선택 > ");
	}
//글쓰기 메소드
	public void to(BoardDTO enter) {
		System.out.println(" - 글쓰기 - ");
		System.out.print("> ");
		String text = scan.next();
		System.out.print("비밀 번호 설정 : ");
		String pw = scan.next();
		enter.setPw(pw);
		enter.setText(text);
	}
//전체 글 출력 메소드
	public void next(List<BoardDTO> boardList) {
		for (int i = 1; i < boardList.size(); i++) {
			System.out.println(i + "번째 글 : " + boardList.get(i).getText());
		}
	}
//글 수정 메소드
	public void change(List<BoardDTO> boardList) {
		System.out.print("글 선택 > ");
		int n = scan.nextInt();
		System.out.print("비밀번호 입력 : ");
		String pw = scan.next();
		System.out.print("입력 > ");
		if (pw.equals(boardList.get(n).getPw())) {
			String text = scan.next();
			boardList.get(n).setText(text);
		} else {
			System.out.println("오류");
		}

	}
//선택 글 삭제 메소드
	public void delete(List<BoardDTO> boardList) {
		System.out.print("삭제 할 글 선택 : ");
		int n = scan.nextInt();
		System.out.print("비밀번호 입력 : ");
		String pw = scan.next();
		if (pw.equals(boardList.get(n).getPw())) {
			boardList.remove(n);
		} else {
			System.out.println("오류");
		}
		System.out.println("선택 글 삭제 완료");
	}
// 전체 글 삭제 메소드
	public void out(List<BoardDTO> boardList) {
		System.out.println("글 전체를 삭제했습니다.");
		boardList.clear();
	}

}
