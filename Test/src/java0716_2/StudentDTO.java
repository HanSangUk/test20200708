package java0716_2;

public class StudentDTO {
	private String name;
	private String add;
	private String phone;

	// public, private : 접근제한자
	/*
	 * get, set 메소드 사용 이유 : 필드에 직접 접근이 아닌 메소드를 통한 간접 접근하여 필드값 지정 및 수정 get 메소드 : 외부에서
	 * 필드값을 쓰고자 할 때 set 메소드 : 외부에서 필드값을 지정할 때
	 */
	// name 필드에 대한 get, set 메소드 선언

	@Override
	public String toString() {
		return "StudentDTO [name=" + name + ", add=" + add + ", phone=" + phone + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public StudentDTO(String name, String add, String phone) {
		super();
		this.name = name;
		this.add = add;
		this.phone = phone;
	}

	StudentDTO() {

	}

}
