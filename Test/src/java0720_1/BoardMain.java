package java0720_1;

import java.util.*;

public class BoardMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<BoardDTO> boardList = new ArrayList<BoardDTO>();
		boardList.add(0, null);
		BoardService ang = new BoardService();
		BoardDTO enter = null;
		boolean boo = true;
		while (boo) {
			ang.text2(enter);
			int sum = scan.nextInt();
			switch (sum) {
			case 1:
				enter = new BoardDTO();
				ang.to(enter);
				boardList.add(enter);
				break;
			case 2:
				ang.next(boardList);
				break;
			case 3:
				ang.change(boardList);
				break;
			case 4:
				ang.delete(boardList);
				break;
			case 5:
				ang.out(boardList);
				break;
			case 6:
				System.out.println("프로그램 종료");
				boo = false;
				break;
			}
		}
		for(int i = 1; i < boardList.size(); i++) {
			System.out.println(boardList.get(i));
		}
		scan.close();
	}
}
