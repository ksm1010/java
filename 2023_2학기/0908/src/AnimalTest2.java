/*
 *  �ۼ��� : 2023�� 9�� 8��
 *  �ۼ��� : �ļҺ� 202095015 �輺�� 
 *  ���� : �߻�Ŭ���� - ������ �����Ҹ��� �������
 */

//�߻�Ŭ���� : ����

abstract class myAnimal2 {
	// �߻� �޼ҵ� : ������ �Ҹ��� ��ȯ�ϴ� �޼ҵ�
	// �߻� �޼ҵ�� ���� ��. �߰�ȣ ������� �ʰ�, �����ݷ����� ����.
	abstract String sound2();

	// �Ϲ� �޼ҵ� : ������ �⺻ ���� ����ϴ� �޼ҵ�
	static void displayInfo2() {
		System.out.println("������ �����Ҹ� �Դϴ�.");
	}
}

// ����� Ŭ���� - �߻� Ŭ������ ���.
class myCat2 extends myAnimal2 {

	@Override
	String sound2() {
		// ������
		return "�߿�";
	}

	// ���� �޼ҵ�(static)�� �������̵� �� �� ����.
	// @Override
	static void displayInfo2() {
		System.out.println("����� �����Ҹ� �Դϴ�.");
	}

}

public class AnimalTest2 {

	public static void main(String[] args) {
		myAnimal2 cat2 = new myCat2();

		cat2.displayInfo2();
		System.out.println(cat2.sound2());
	}

}
