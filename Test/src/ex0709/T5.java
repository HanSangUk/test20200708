package ex0709;

public class T5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = { 5, 7, 3, 1, 4 };
		int sum = 0, i = 0;
		for (i = 0; i < num.length; i++) {
			sum = num[i] + sum;
		}
		System.out.println("�Էµ� ���� ���� : " + sum);
		System.out.println("��� : " + (sum / num.length));

	}

}
