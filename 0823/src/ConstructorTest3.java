class Constructor3 {

	public int a = 3;
	public int b = 5;
	public int c = 7;

	public Constructor3(int a, int b) {
		this.a = a;
		this.b = b;
	}
}

public class ConstructorTest3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor3 ct2 = new Constructor3(2, 4);
		
		System.out.println("��ü���� a" + ct2.a);
		System.out.println("��ü���� b" + ct2.b);
		System.out.println("��ü���� c" + ct2.c);
	}

}
