class Parent {
	public static final String SS = "º’»ÔπŒ";

	public static String sout() {
		return "≈‰∆Æ≥—";
	}

	public String nout() {
		return "¿◊±€∑£µÂ";
	}
}

public class Child extends Parent {
	public static final String SS = "¿Ã∞≠¿Œ";

	public static String sout() {
		return "πﬂ∑ªΩ√æ∆";
	}

	public String nout() {
		return "Ω∫∆‰¿Œ";
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
