package java0716;

import java.util.Scanner;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Car car = new Car();
		// car ��� ���ο� ��ü�� ����.
		System.out.print("������ �����ϼ��� : ");
		int gas = scan.nextInt();
		car.setGas(gas);
		// car�� setGas�޼ҵ忡 5�� ���� > gas �ʵ忡 �� ����
		boolean gasState = car.isLeftGas();
		// boolŸ���� gasState�� car.isLeftGas �޼ҵ尪�� ��(true or false)
		System.out.println(car.gas);
		// ���� gas �� ���.
		if (gasState) {
			System.out.println("���");
			car.run();
			// run �޼ҵ忡 �ִ� while �ݺ����� ȣ��?
		}
		scan.close();
		
	}

}
