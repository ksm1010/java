package practice;

class OT1a {
	public void show(String str) { // �Ű������� 1���� �޼ҵ�
		System.out.println("���� Ŭ������ �޼ҵ� show(String str)����  : " + str);
	}
}

class OT1b extends OT1a { // OT1a�� ���
	public void show() { // �Ű������� ����. �̸��� �����Ƿ� �������̵� �ƴ� �ܼ� ���
		System.out.println("���� Ŭ������ �޼ҵ� show() ����");
	}
}

public class OverridingTest1 {
	public static void main(String args[]) {
		OT1b otb = new OT1b();
		otb.show("ó�� �����ϴ� �ڹ�"); //�Ű������� �ִ� �޼ҵ� ȣ��. ���� ȣ��
		otb.show(); //�Ű������� ���� �޼ҵ� ȣ��. ���� ȣ��
	}
}
