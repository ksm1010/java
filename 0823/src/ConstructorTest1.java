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
		
		System.out.println("°´Ã¼º¯¼ö a" + ct.a);
		System.out.println("°´Ã¼º¯¼ö b" + ct.b);
		System.out.println("°´Ã¼º¯¼ö c" + ct.c);
	}

}
