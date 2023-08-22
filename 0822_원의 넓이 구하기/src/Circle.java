
//원의 넓이를 구하는 프로그램을 작성하시오.
//원의 특성을 나타내는 클래스를 정의하시오.
//클래스 변수 PI를 이용하여 원의 넓이를 구하는 프로그램을 완성하시오.
import java.util.Scanner;

public class Circle {
	final static double pi = 3.14;

	// 원 넓이 계산 메소드
	public double AreaResult(double radius) {
		double Area = radius * radius * pi;
		return Area;
	}

	public static void main(String[] args) {
		
		Circle ob1 = new Circle();
		
		//반지름 입력받기
		Scanner keyboard = new Scanner(System.in);
		System.out.println(" 반지름 입력 : ");
		double radius = keyboard.nextDouble();
		
		double Result = ob1.AreaResult(radius);
		
		//넓이 출력
		System.out.println(" 넓이 : " + Result);
	}

}
