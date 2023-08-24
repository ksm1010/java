class Ct2 {

	public Ct2() {
		System.out.println("매개변수 없음");
	}

	public Ct2(int a) {
		System.out.println("매개변수 int a");
	}

	public Ct2(double a) {
		System.out.println("매개변수 double a");
	}

	public Ct2(int a, double b) {
		System.out.println("매개변수 int a, double b");
	}

}

public class CtOverloading2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ct2 cto2 = new Ct2();

		cto2 = new Ct2(4);
		cto2 = new Ct2(4, 4.15);
		cto2 = new Ct2(6.0);
		//cto2 = new Ct2(3.8, 5.4);
	}

}
