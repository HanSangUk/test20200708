package java0720;

import java.util.*;

public class NaverService {
	Scanner scan = new Scanner(System.in);

//1. �ű� ��� �޼ҵ�
	void enter(NaverMemberDTO naver) {
		System.out.print("���̵� : ");
		String id = scan.nextLine(); 
		System.out.print("��й�ȣ : ");
		String pw = scan.nextLine();
		System.out.print("�̸� : ");
		String name = scan.nextLine();
		naver.setId(id);
		naver.setPw(pw);
		naver.setName(name);
	}

//2. ȸ�� ���̵� ��� �޼ҵ�
	void all(List<NaverMemberDTO> naverList) {
		for (int i = 0; i < naverList.size(); i++) {
			System.out.println(naverList.get(i).getId());
		}

	}

//3. ȸ����ü ���� ��� �޼ҵ�
	void each(List<NaverMemberDTO> naverList) {
		for (int i = 0; i < naverList.size(); i++) {
			System.out.println((i + 1) + "��° ȸ��");
			System.out.print("���̵� : ");
			System.out.println(naverList.get(i).getId());
			System.out.print("��й�ȣ : ");
			System.out.println(naverList.get(i).getPw());
			System.out.print("�̸� : ");
			System.out.println(naverList.get(i).getName());
			System.out.println("-----------------------");
		}
	}
// �ؽ�Ʈ �޼ҵ�.
	void text(NaverMemberDTO naver) {
		System.out.println("------------------------------------------------");
		System.out.println("1.�űԵ�� | 2.ȸ�� ���̵� ��� | 3. ȸ�� ��ü ����  ��� | 4. ����");
		System.out.println("------------------------------------------------");
		System.out.print("���� > ");
	}
}
