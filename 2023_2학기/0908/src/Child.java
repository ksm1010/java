class Parent {
	public static final String SS = "�����";

	public static String sout() {
		return "��Ʈ��";
	}

	public String nout() {
		return "�ױ۷���";
	}
}

public class Child extends Parent {
	public static final String SS = "�̰���";

	public static String sout() {
		return "�߷��þ�";
	}

	public String nout() {
		return "������";
	}

	public static void main(String[] args) {
		Parent s = new Child();
		Child ct = new Child();
		
		System.out.println(s.SS);
		System.out.println(s.sout());
		System.out.println(s.nout());
		
		System.out.println(Child.SS);
		System.out.println(Child.sout());
		System.out.println(ct.nout());
	}

}
