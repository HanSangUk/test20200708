package java0720_1;

import java.util.*;

public class BoardService {
	Scanner scan = new Scanner(System.in);
// �ؽ�Ʈ �޼ҵ�
	public void text2(BoardDTO enter) {
		System.out.println("----------------------------------------------------------------");
		System.out.println("1. �۾��� | 2.��ü �� ��� | 3. �� ���� | 4. �ۻ��� | 5. ��ü �� ���� | 6. ����");
		System.out.println("----------------------------------------------------------------");
		System.out.print("���� > ");
	}
//�۾��� �޼ҵ�
	public void to(BoardDTO enter) {
		System.out.println(" - �۾��� - ");
		System.out.print("> ");
		String text = scan.next();
		System.out.print("��� ��ȣ ���� : ");
		String pw = scan.next();
		enter.setPw(pw);
		enter.setText(text);
	}
//��ü �� ��� �޼ҵ�
	public void next(List<BoardDTO> boardList) {
		for (int i = 1; i < boardList.size(); i++) {
			System.out.println(i + "��° �� : " + boardList.get(i).getText());
		}
	}
//�� ���� �޼ҵ�
	public void change(List<BoardDTO> boardList) {
		System.out.print("�� ���� > ");
		int n = scan.nextInt();
		System.out.print("��й�ȣ �Է� : ");
		String pw = scan.next();
		System.out.print("�Է� > ");
		if (pw.equals(boardList.get(n).getPw())) {
			String text = scan.next();
			boardList.get(n).setText(text);
		} else {
			System.out.println("����");
		}

	}
//���� �� ���� �޼ҵ�
	public void delete(List<BoardDTO> boardList) {
		System.out.print("���� �� �� ���� : ");
		int n = scan.nextInt();
		System.out.print("��й�ȣ �Է� : ");
		String pw = scan.next();
		if (pw.equals(boardList.get(n).getPw())) {
			boardList.remove(n);
		} else {
			System.out.println("����");
		}
		System.out.println("���� �� ���� �Ϸ�");
	}
// ��ü �� ���� �޼ҵ�
	public void out(List<BoardDTO> boardList) {
		System.out.println("�� ��ü�� �����߽��ϴ�.");
		boardList.clear();
	}

}
