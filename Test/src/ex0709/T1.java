package ex0709;

import java.util.Scanner;

public class T1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = 0, i = 0, num = 0, sum = 0;
		boolean boo = true;
		do {
			System.out.println("-------------------------------");
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("-------------------------------");
			System.out.print("����>");
			n = scan.nextInt();
			if (n == 1) {
				System.out.print("���ݾ� > ");
				i = scan.nextInt();
				num = num + i;
				System.out.println("���� �ܾ���" + num + "�Դϴ�.");
			} else if (n == 2) {
				System.out.print("��ݾ� > ");
				sum = scan.nextInt();
				if (sum > num) {
					System.out.println("�ܰ� �����մϴ�");
					System.out.println("���� �ܾ��� " + num + "�Դϴ�.");
				} else {
					num = num - sum;
					System.out.println("��ݾ� >" + sum);
					System.out.println("���ó���� �Ǿ����ϴ�.");
					System.out.println("�����ܾ��� " + num + "�Դϴ�.");
				}
			} else if (n == 3) {
				System.out.println("���� �ܾ���" + num + "�Դϴ�.");
			} else {
				boo = false;
			}
		} while (boo);
		System.out.println("���α׷��� ����Ǿ����ϴ�.");
		scan.close();

	}

}
