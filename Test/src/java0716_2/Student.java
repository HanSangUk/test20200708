package java0716_2;

public class Student {
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
