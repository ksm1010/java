package practice;

class A {
	public int aa = 1; //
}

class B extends A { // B가 A를 상속받음
	private int bb = 2; // 멤버변수. 해당 클래스 내에서만 접근 가능

	public int bb() { //매소드. 모두 접근 가능
		// 
		return bb; //이 메소드를 이용하여 외부에서 접근 불가한 bb멤버변수 사용가능
	}
}

class C extends B { // C가 B를 상속받음
	int cc = 3; // 멤버변수. 한정자 없음. 같은 패키지 내에서만 접근 가능
}

public class InheritanceTest1 {
	public static void main(String[] args) {
		C objc = new C();
		System.out.println("objc객체의 객체 속성 변수 aa의 값은 " + objc.aa);
		//System.out.println("objc객체의 객체 속성 변수 bb의 값은 " + objc.bb);
		//private 접근 불가
		
		//메소드로 잡근하면 가능
		System.out.println("objc객체의 객체 속성 변수 bb의 값은 " + objc.bb());

		System.out.println("objc객체의 객체 속성 변수 cc의 값은 " + objc.cc);
	}
}
