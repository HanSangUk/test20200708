package java0716_1;

import java.util.Scanner;

public class Test {
	Scanner scan = new Scanner(System.in);
//�ʵ� ����
	double x, y;
	int sum;
	boolean boo = true;
//�⺻������ ����
	Test() {
	}
//�ؽ�Ʈ �޼ҵ�
	void text() {
		System.out.println("--------------------------------------");
		System.out.println("1.���� | 2.���� | 3.���� | 4.������ | 5.����");
		System.out.println("--------------------------------------");
		System.out.print("��ȣ > ");
	}
//���ϱ� �޼ҵ�
	double add(double x, double y) {
		double add = (x + y);
		return add;
	}
//���� �޼ҵ�
	double Sub(double x, double y) {
		double Sub = (x - y);
		return Sub;
	}
//���ϱ� �޼ҵ�
	double Mul(double x, double y) {
		double Mul = (x * y);
		return Mul;
	}
//������ �޼ҵ�
	double div(double x, double y) {
		double div = (x / y);
		return div;
	}
//�ݺ� ���� �޼ҵ�(�ؽ�Ʈ + ��Ģ���� �޼ҵ�)
	void num() {
		while (boo) {
			text();
			sum = scan.nextInt();
			if (sum == 5) {
				System.out.println("���α׷� ����");
				boo = false;
			} else {
				System.out.print("���� �Է� : ");
				x = scan.nextDouble();
				System.out.print("���� �Է� : ");
				y = scan.nextDouble();
				if (sum == 1) {
					System.out.println("��� : " + add(x, y));
				} else if (sum == 2) {
					System.out.println("��� : " + Sub(x, y));
				} else if (sum == 3) {
					System.out.println("��� : " + Mul(x, y));
				} else if (sum == 4) {
					System.out.println("��� : " + div(x, y));
				} else {
					System.out.println("����");
				}
			}
		}
	}
}
