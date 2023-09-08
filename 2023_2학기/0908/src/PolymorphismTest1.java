/*
* ���� : ���� 11.4
* ���� ���α׷��� �� ���� Ŭ������ ��� ���迡 �����鼭 �ϳ��� �Ӽ��� �ϳ��� 
 �޼ҵ带 ������ �ִ�.
 ��ü ���� ����� ������(polymorphism)�� �����ϴ� ��
*/
class Am {
	int count = 1; // �Ӽ�

	void callme() { // �޼ҵ�
		System.out.println("Am�� callme() ����, count �� : " + count);
	}
}

class Bm extends Am {
	int count = 2; // �Ӽ� count=2, count=1(��ӵ� ���� Ŭ������ �Ӽ��� ��������.)

	void callme() { // �޼ҵ� �������̵�
		System.out.println("Bm�� callme() ����, count �� : " + count);
	}
}

class Cm extends Am {
	int count = 3; // �Ӽ� count=3, count=1(��ӵ� ���� Ŭ������ �Ӽ��� ��������.)

	void callme() { // �޼ҵ� �������̵�
		System.out.println("Cm�� callme() ����, count �� : " + count);
	}
}

class PolymorphismTest1 {
	public static void main(String args[]) {
		Am r = new Am();
		r.callme(); 
		// Am�� callme() �޼ҵ� ȣ���.
		// System.out.println("r.count �� : " + r.count);
		// Am�� count�� 1 ���
		
		r = new Bm(); // ����ȯ. ���� Ŭ������ ��ü ������ ���� Ŭ���� ��ü ����
		r.callme(); // ���� Ŭ���� Bm�� callme()�޼ҵ� ȣ��
		System.out.println("r.count �� : " + r.count); // Am�� count�� 1 ���
		
		/*
		 * ����ȯ�� ��� �޼ҵ�� �������̵��� ����� ������ �� �ִ�. 
		 * ��, ���� Ŭ������ �޼ҵ忡 ���� �����ϴ�. 
		 * ����ȯ�� ��� �Ӽ�(����)�� �������̵� ���� �ʴ´�. 
		 * ���� ���� Ŭ������ �Ӽ��� �����Ѵ�.
		 */
		
		r = new Cm(); // ����ȯ. ���� Ŭ������ ��ü ������ ���� Ŭ���� ��ü ����
		r.callme(); // ���� Ŭ���� Cm�� callme()�޼ҵ� ȣ��
		System.out.println("r.count �� : " + r.count); // Am�� count�� 1 ���
	}
}
