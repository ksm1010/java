package practice;

class A {
	public int aa = 1; //
}

class B extends A { // B�� A�� ��ӹ���
	private int bb = 2; // �������. �ش� Ŭ���� �������� ���� ����

	public int bb() { //�żҵ�. ��� ���� ����
		// 
		return bb; //�� �޼ҵ带 �̿��Ͽ� �ܺο��� ���� �Ұ��� bb������� ��밡��
	}
}

class C extends B { // C�� B�� ��ӹ���
	int cc = 3; // �������. ������ ����. ���� ��Ű�� �������� ���� ����
}

public class InheritanceTest1 {
	public static void main(String[] args) {
		C objc = new C();
		System.out.println("objc��ü�� ��ü �Ӽ� ���� aa�� ���� " + objc.aa);
		//System.out.println("objc��ü�� ��ü �Ӽ� ���� bb�� ���� " + objc.bb);
		//private ���� �Ұ�
		
		//�޼ҵ�� ����ϸ� ����
		System.out.println("objc��ü�� ��ü �Ӽ� ���� bb�� ���� " + objc.bb());

		System.out.println("objc��ü�� ��ü �Ӽ� ���� cc�� ���� " + objc.cc);
	}
}
