package java0716_2;

public class StudentDTO {
	private String name;
	private String add;
	private String phone;

	// public, private : ����������
	/*
	 * get, set �޼ҵ� ��� ���� : �ʵ忡 ���� ������ �ƴ� �޼ҵ带 ���� ���� �����Ͽ� �ʵ尪 ���� �� ���� get �޼ҵ� : �ܺο���
	 * �ʵ尪�� ������ �� �� set �޼ҵ� : �ܺο��� �ʵ尪�� ������ ��
	 */
	// name �ʵ忡 ���� get, set �޼ҵ� ����

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
