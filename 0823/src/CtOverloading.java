class Ct {

	public Ct() {
		System.out.println("�Ű����� ����");
	}

	public Ct(int a) {
		System.out.println("�Ű����� int a");
	}

	public Ct(double a) {
		System.out.println("�Ű����� double a");
	}

	public Ct(int a, double b) {
		System.out.println("�Ű����� int a, double b");
	}

}

public class CtOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ct cto = new Ct();
		
		cto = new Ct(4);
		cto = new Ct(4, 4.15);
		cto = new Ct(6.0);
		cto = new Ct(3, 7);
	}

}