package practice;

class OT2a {
	public void show(String str) {
		System.out.println("상위 클래스의 메소드 show() 수행 : " + str);
	}
}

class OT2b extends OT2a {
	//매소드 이름, 매개변수 타입, 매개변수 수 같음
	//오버라이딩 > 상위 클래스 메소드 재정의하는것
	public void show(String s) {
		System.out.println("하위 클래스의 메소드 show() 수행 : " + s);
	}
}

public class OverridingTest2 {
	public static void main(String args[]) {
		OT2b otb = new OT2b(); // 상위 메소드 사용불가
		otb.show("쉽다 자바프로그래밍!!!");
	}
}
