package java0716;

public class Car {
	int gas;
	
	// ������ ����
	void setGas(int gas) {
		this.gas = gas;
		// gas �ʵ忡 Main���� �� ���� ����.
	}
	
	boolean isLeftGas() {
		if(gas == 0) {
			System.out.println("gas�� �����ϴ�.");
			return false;
		} else {
			System.out.println("gas�� �ֽ��ϴ�.");
			return true;
		}
	}
	
	void run() {
		boolean run = true;
		while(run) {
			if(gas>0) {
				System.out.println("�޸�����.(gas �ܷ� : " + gas + ")");
				gas -= 1;
			} else {
				System.out.println("����ϴ�.(gas �ܷ� : " + gas + ")");
				run = false;
			}
		}
	}

}
