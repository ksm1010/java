/* 2���� ������ �Է� �޾� ���� ����Ͻÿ�.
�� �� �� ������ �հ踦 ����Ѵ�.
�� �� �� ������ Ȧ���� �հ踦 ����Ѵ�.
�� �� �� ������ ¦���� �հ踦 ����Ѵ�.
2���� ������ �� ���� ����Ͽ� �����ִ� 
Ŭ������ �޼ҵ带 �����Ͻÿ�. */

//0822 ���� 05:20 �̿ϼ�
import java.util.Scanner;

public class Result {

	public int R1(int a, int b) { // �� �� ������ ��
		int r1 = 0;
		for (int i = a; i <= b; i++) {
			r1 += i;
		}
		return r1;
	}

	public int R2(int a, int b) { // �� �� ���� Ȧ���� ��
		int r2 = 0;
		for (int i = a; i <= b; i++) {
			if (i % 2 != 0) {
				r2 += i;
			}
		}
		return r2;
	}

	public int R3(int a, int b) { // �� �� ���� ¦���� ��
		int r3 = 0;
		for (int i = a; i <= b; i++) {
			if (i % 2 == 0) {
				r3 += i;
			}
		}
		return r3;
	}

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		// class result ȣ��
		Result ob1 = new Result();

		// �� �Է¹ޱ�
		System.out.println(" �� ���� �� �Է� : ");
		int num1 = keyboard.nextInt();
		int num2 = keyboard.nextInt();
		
		//�� �� ������ ��, �� �� ���� Ȧ���� ��, �� �� ���� ¦���� ��
		//���� ����
		int hap1 = ob1.R1(num1, num2);
		int hap2 = ob1.R2(num1, num2);
		int hap3 = ob1.R3(num1, num2);
		
		//�� �� ������ �� ���
		System.out.println("�� �� ������ �� :" + hap1);
		//�� �� ���� Ȧ���� �� ���
		System.out.println("�� �� ���� Ȧ���� �� :" + hap2);
		//�� �� ���� ¦���� �� ���
		System.out.println("�� �� ���� ¦���� �� :" + hap3);

	}
}
