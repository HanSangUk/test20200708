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
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-------------------------------");
			System.out.print("선택>");
			n = scan.nextInt();
			if (n == 1) {
				System.out.print("예금액 > ");
				i = scan.nextInt();
				num = num + i;
				System.out.println("현재 잔액은" + num + "입니다.");
			} else if (n == 2) {
				System.out.print("출금액 > ");
				sum = scan.nextInt();
				if (sum > num) {
					System.out.println("잔고가 부족합니다");
					System.out.println("현재 잔액은 " + num + "입니다.");
				} else {
					num = num - sum;
					System.out.println("출금액 >" + sum);
					System.out.println("출금처리가 되었습니다.");
					System.out.println("현재잔액은 " + num + "입니다.");
				}
			} else if (n == 3) {
				System.out.println("현재 잔액은" + num + "입니다.");
			} else {
				boo = false;
			}
		} while (boo);
		System.out.println("프로그램이 종료되었습니다.");
		scan.close();

	}

}
