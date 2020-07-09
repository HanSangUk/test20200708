package ex0709;

import java.util.Scanner;

public class T2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("º° : ");
		n = scan.nextInt();
		for(int i = 1; i<=n ;i++) {
			for(int k = 1; k<i; k++) {
				System.out.print(" ");
			}
			for(int j = i*2; j<=n*2; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 1; i < n; i++) {
			for(int j = i+1; j<n; j++) {
				System.out.print(" ");
			} 
			for(int k = 1; k<=i*2+1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		scan.close();

	}

}
