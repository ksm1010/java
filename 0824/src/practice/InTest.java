package practice;

class CC1 {
	int a = 100;
	static String b = "������ �ڹ�";
}

class CC2 extends CC1 {
	String b;
	String x = "���� �ڹ�";
}

public class InTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CC2 o = new CC2();
		System.out.println(o.x);
		System.out.println(o.b);
		System.out.println(o.a);
		System.out.println(CC1.b);

	}

}
