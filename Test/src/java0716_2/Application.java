package java0716_2;

import java.util.Date;

public class Application {

	public void enter(Student stu) {
		System.out.println("Application 클래스의 enter 메소드");
		System.out.println(stu.name + " 님 입실완료 ");
		System.out.println("현재시간 : " + new Date());
	}

}
