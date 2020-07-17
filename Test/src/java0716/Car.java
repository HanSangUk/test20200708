package java0716;

public class Car {
	int gas;
	
	// 생성자 선언
	void setGas(int gas) {
		this.gas = gas;
		// gas 필드에 Main에서 준 값을 저장.
	}
	
	boolean isLeftGas() {
		if(gas == 0) {
			System.out.println("gas가 없습니다.");
			return false;
		} else {
			System.out.println("gas가 있습니다.");
			return true;
		}
	}
	
	void run() {
		boolean run = true;
		while(run) {
			if(gas>0) {
				System.out.println("달립나다.(gas 잔량 : " + gas + ")");
				gas -= 1;
			} else {
				System.out.println("멈춥니다.(gas 잔량 : " + gas + ")");
				run = false;
			}
		}
	}

}
