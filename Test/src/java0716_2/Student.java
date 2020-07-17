package java0716_2;

public class Student {
	// DTO(Date Transfer Object) : 데이터를 담아서 전달하기 위한 클래스
	String name;
	String add;
	String phone;

	public Student(String name, String add, String phone) {
		super();
		this.name = name;
		this.add = add;
		this.phone = phone;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", add=" + add + ", phone=" + phone + "]";
	}

}
