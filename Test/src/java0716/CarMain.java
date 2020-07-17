package java0716;

import java.util.Scanner;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Car car = new Car();
		// car 라는 새로운 객체를 생성.
		System.out.print("가스를 주입하세요 : ");
		int gas = scan.nextInt();
		car.setGas(gas);
		// car의 setGas메소드에 5를 전달 > gas 필드에 값 저장
		boolean gasState = car.isLeftGas();
		// bool타입의 gasState에 car.isLeftGas 메소드값을 줌(true or false)
		System.out.println(car.gas);
		// 현재 gas 값 출력.
		if (gasState) {
			System.out.println("출발");
			car.run();
			// run 메소드에 있는 while 반복문을 호출?
		}
		scan.close();
		
	}

}
