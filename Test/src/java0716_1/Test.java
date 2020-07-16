package java0716_1;

import java.util.Scanner;

public class Test {
	Scanner scan = new Scanner(System.in);
//필드 생성
	double x, y;
	int sum;
	boolean boo = true;
//기본생성자 생성
	Test() {
	}
//텍스트 메소드
	void text() {
		System.out.println("--------------------------------------");
		System.out.println("1.덧셈 | 2.뺄셈 | 3.곱셈 | 4.나눗셈 | 5.종료");
		System.out.println("--------------------------------------");
		System.out.print("번호 > ");
	}
//더하기 메소드
	double add(double x, double y) {
		double add = (x + y);
		return add;
	}
//빼기 메소드
	double Sub(double x, double y) {
		double Sub = (x - y);
		return Sub;
	}
//곱하기 메소드
	double Mul(double x, double y) {
		double Mul = (x * y);
		return Mul;
	}
//나누기 메소드
	double div(double x, double y) {
		double div = (x / y);
		return div;
	}
//반복 조건 메소드(텍스트 + 사칙연산 메소드)
	void num() {
		while (boo) {
			text();
			sum = scan.nextInt();
			if (sum == 5) {
				System.out.println("프로그램 종료");
				boo = false;
			} else {
				System.out.print("숫자 입력 : ");
				x = scan.nextDouble();
				System.out.print("숫자 입력 : ");
				y = scan.nextDouble();
				if (sum == 1) {
					System.out.println("결과 : " + add(x, y));
				} else if (sum == 2) {
					System.out.println("결과 : " + Sub(x, y));
				} else if (sum == 3) {
					System.out.println("결과 : " + Mul(x, y));
				} else if (sum == 4) {
					System.out.println("결과 : " + div(x, y));
				} else {
					System.out.println("오류");
				}
			}
		}
	}
}
