public class MTest {

	// 오류 public static method1(int n, m) {

	public static void method1(int n, int m) {
		n += m;
		// 오류2 xMethod(3, 4);
		//Mtest ob1 = new Mtest();
		ob1.xMethod(3);
	}

	public int xMethod(int n) {
		if (n > 0)
			return 1;
		else if (n == 0)
			return 0;
		else
			return -1;
	}
}
