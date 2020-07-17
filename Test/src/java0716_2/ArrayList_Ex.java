package java0716_2;

import java.util.*;

public class ArrayList_Ex {

	public static void main(String[] args) {
		/*
		 * ArrayList, Set, Map
		 */
		// number 라는 이름의 ArrayList 선언
		List<Integer> numbers = new ArrayList<Integer>();
		// <> : generic
		// 타입변환을 하지 않고도 해당 타입을 사용할 수 있게 해줌
		List<String> strs = new ArrayList<String>();
		// 대표하는 클래스의 이름을 써야함
		numbers.add(10);
		int num = 100;
		numbers.add(num);
		numbers.add(num + 150);
		numbers.add(1, 15);
		numbers.add(1, 99);
		numbers.remove(2);
		// 출력
		System.out.println(numbers.get(0));
		System.out.println(numbers.get(1));
		System.out.println(numbers.get(2));
		// ArrayList 크기 출력
		System.out.println(numbers.size());
		for (int i = 0; i < numbers.size(); i++) {
			System.out.println("인덱스 " + i + " : " + numbers.get(i));
		}
		strs.add("가가가가");
		List<StudentDTO> stuList = new ArrayList<StudentDTO>();
		StudentDTO stu = new StudentDTO();
		stu.setName("회원1");
		stu.setAdd("인천광역시");
		stu.setPhone("010-5555-5555");
		
		
		stuList.add(stu);
		System.out.println(stuList.get(0).getName());
		
		
		
	}
}		
