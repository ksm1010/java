package practice;

abstract class Ctest1 {
	public Ctest1() {
		System.out.print(1);
	}
}

class Ctest2 extends Ctest1 {
	public Ctest2() {
		System.out.print(2);
	}
}

class Ctest3 extends Ctest2 {
	public Ctest3() {
		System.out.print(3);
	}
}

public class ConsTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ctest3();
	}

}
