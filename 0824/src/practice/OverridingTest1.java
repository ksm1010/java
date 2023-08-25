package practice;

class OT1a {
	public void show(String str) { // 매개변수가 1개인 메소드
		System.out.println("상위 클래스의 메소드 show(String str)수행  : " + str);
	}
}

class OT1b extends OT1a { // OT1a를 상속
	public void show() { // 매개변수가 없음. 이름만 같으므로 오버라이딩 아닌 단순 상속
		System.out.println("하위 클래스의 메소드 show() 수행");
	}
}

public class OverridingTest1 {
	public static void main(String args[]) {
		OT1b otb = new OT1b();
		otb.show("처음 시작하는 자바"); //매개변수가 있는 메소드 호출. 상위 호출
		otb.show(); //매개변수가 없는 메소드 호출. 하위 호출
	}
}
