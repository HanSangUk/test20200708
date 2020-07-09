package ex0709;

public class T3 {

	public static void main(String[] args) {
		// 정수형 배열변수 선언
		// 배열 선언하면서 초기값 지정
		int[] number1 = {1,7,3,8};
		System.out.println(number1[0]);
		System.out.println(number1[1]);
		System.out.println(number1[2]);
		System.out.println(number1[3]);
		// String 타입 배열을 선언하여 같은 줄에 앉은 4명의 이름을 저장하고 출력
		String[] str = {"한상욱","추영제","권단군","김경수형"};
		//                0       1       2       3 
		str[0] = "앙";
		System.out.println(str[3]);
		System.out.println(str[1]);
		System.out.println(str[2]);
		System.out.println(str[0]);
		// 배열의 크기 값 활용하기
		System.out.println(str.length);
		// for문을 이용하여 배열에 저장된 값 모두 출력하기
		for(int i=0;i<=str.length ;i++) {
			System.out.println(str[0]);
		}
	

	}

}
