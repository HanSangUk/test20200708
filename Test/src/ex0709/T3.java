package ex0709;

public class T3 {

	public static void main(String[] args) {
		// ������ �迭���� ����
		// �迭 �����ϸ鼭 �ʱⰪ ����
		int[] number1 = {1,7,3,8};
		System.out.println(number1[0]);
		System.out.println(number1[1]);
		System.out.println(number1[2]);
		System.out.println(number1[3]);
		// String Ÿ�� �迭�� �����Ͽ� ���� �ٿ� ���� 4���� �̸��� �����ϰ� ���
		String[] str = {"�ѻ��","�߿���","�Ǵܱ�","������"};
		//                0       1       2       3 
		str[0] = "��";
		System.out.println(str[3]);
		System.out.println(str[1]);
		System.out.println(str[2]);
		System.out.println(str[0]);
		// �迭�� ũ�� �� Ȱ���ϱ�
		System.out.println(str.length);
		// for���� �̿��Ͽ� �迭�� ����� �� ��� ����ϱ�
		for(int i=0;i<=str.length ;i++) {
			System.out.println(str[0]);
		}
	

	}

}
