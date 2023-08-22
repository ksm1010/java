import java.util.Scanner;

public class result {

	public int r(int a, int b) {
		// 합 구하기
		int result = a + b;
		return result;
	}

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		result ob1 = new result(); // 인스턴스 생성
		
		// 값 입력받기
		System.out.println(" 두 개의 값 입력 : " );
		int num1 = keyboard.nextInt();
		int num2 = keyboard.nextInt();

		
		int hap = ob1.r(num1, num2);
		System.out.println(" 합 : " + hap); //합 출력
		


	}

}
