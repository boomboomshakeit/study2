package inherEx;

class OSystem {
	void run() { //운영체제 실행 메소드
		System.out.println("운영체제를 시작합니다.");
	}
}

class LinuxEx extends OSystem {

	@Override
	void run() {
		System.out.println("Linux 운영체제를 시작합니다.");
	}
	
}

class AppleEx extends OSystem {
	@Override
	void run() {
		System.out.println("Apple 운영체제를 시작합니다.");
	}
}

class Microsoft extends OSystem {
	@Override
	void run() {
		System.out.println("Microsoft 운영체제를 시작합니다.");
	}
}

class OsStart {
	//부모(os)는 자식(linux, apple, ms) 다 포함(담을) 수 있다.
	void start(OSystem os) { //매개변수로 부모를 넣어줌
		os.run();
	}
}

public class PolyEx {

	public static void main(String[] args) {
		/*
		LinuxEx linux = new LinuxEx();
		linux.run();
		System.out.println("-----------------------");
		
		AppleEx apple = new AppleEx();
		apple.run();
		System.out.println("-----------------------");

		Microsoft micro = new Microsoft();
		micro.run();
		*/
		
		OsStart boot = new OsStart(); //부모를 자식에다 담는 것
		boot.start(new LinuxEx());
		boot.start(new AppleEx());
		boot.start(new Microsoft());
		
		
		
		
	}

}
