class Constructor {

	public int a = 3;
	public int b = 5;
	public int c = 7;

	public Constructor(int a, int b) {
		a = a;
		b = b;
	}
}

class ConstructorTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor ct = new Constructor(2, 4);
		
		System.out.println("��ü���� a" + ct.a);
		System.out.println("��ü���� b" + ct.b);
		System.out.println("��ü���� c" + ct.c);
	}

}
