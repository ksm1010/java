
//���� ���̸� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
//���� Ư���� ��Ÿ���� Ŭ������ �����Ͻÿ�.
//Ŭ���� ���� PI�� �̿��Ͽ� ���� ���̸� ���ϴ� ���α׷��� �ϼ��Ͻÿ�.
import java.util.Scanner;

public class Circle {
	final static double pi = 3.14;

	// �� ���� ��� �޼ҵ�
	public double AreaResult(double radius) {
		double Area = radius * radius * pi;
		return Area;
	}

	public static void main(String[] args) {
		
		Circle ob1 = new Circle();
		
		//������ �Է¹ޱ�
		Scanner keyboard = new Scanner(System.in);
		System.out.println(" ������ �Է� : ");
		double radius = keyboard.nextDouble();
		
		double Result = ob1.AreaResult(radius);
		
		//���� ���
		System.out.println(" ���� : " + Result);
	}

}
