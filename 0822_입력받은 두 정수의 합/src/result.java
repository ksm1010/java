import java.util.Scanner;

public class result {

	public int r(int a, int b) {
		// �� ���ϱ�
		int result = a + b;
		return result;
	}

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		result ob1 = new result(); // �ν��Ͻ� ����
		
		// �� �Է¹ޱ�
		System.out.println(" �� ���� �� �Է� : " );
		int num1 = keyboard.nextInt();
		int num2 = keyboard.nextInt();

		
		int hap = ob1.r(num1, num2);
		System.out.println(" �� : " + hap); //�� ���
		


	}

}
