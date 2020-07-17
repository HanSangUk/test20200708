package java0716_2;

import java.util.*;

public class ArrayList_Ex {

	public static void main(String[] args) {
		/*
		 * ArrayList, Set, Map
		 */
		// number ��� �̸��� ArrayList ����
		List<Integer> numbers = new ArrayList<Integer>();
		// <> : generic
		// Ÿ�Ժ�ȯ�� ���� �ʰ� �ش� Ÿ���� ����� �� �ְ� ����
		List<String> strs = new ArrayList<String>();
		// ��ǥ�ϴ� Ŭ������ �̸��� �����
		numbers.add(10);
		int num = 100;
		numbers.add(num);
		numbers.add(num + 150);
		numbers.add(1, 15);
		numbers.add(1, 99);
		numbers.remove(2);
		// ���
		System.out.println(numbers.get(0));
		System.out.println(numbers.get(1));
		System.out.println(numbers.get(2));
		// ArrayList ũ�� ���
		System.out.println(numbers.size());
		for (int i = 0; i < numbers.size(); i++) {
			System.out.println("�ε��� " + i + " : " + numbers.get(i));
		}
		strs.add("��������");
		List<StudentDTO> stuList = new ArrayList<StudentDTO>();
		StudentDTO stu = new StudentDTO();
		stu.setName("ȸ��1");
		stu.setAdd("��õ������");
		stu.setPhone("010-5555-5555");
		
		
		stuList.add(stu);
		System.out.println(stuList.get(0).getName());
		
		
		
	}
}		
