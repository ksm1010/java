/*
 *  작성일 : 2023년 9월 8일
 *  작성자 : 컴소부 202095015 김성미 
 *  설명 : 추상클래스 - 동물의 울음소리를 출력하자
 */

//추상클래스 : 동물

abstract class myAnimal2 {
	// 추상 메소드 : 동물의 소리를 반환하는 메소드
	// 추상 메소드는 선언만 함. 중괄호 사용하지 않고, 세미콜론으로 종료.
	abstract String sound2();

	// 일반 메소드 : 동물의 기본 정보 출력하는 메소드
	static void displayInfo2() {
		System.out.println("동물의 울음소리 입니다.");
	}
}

// 고양이 클래스 - 추상 클래스를 상속.
class myCat2 extends myAnimal2 {

	@Override
	String sound2() {
		// 재정의
		return "야옹";
	}

	// 정적 메소드(static)는 오버라이딩 할 수 없다.
	// @Override
	static void displayInfo2() {
		System.out.println("고양이 울음소리 입니다.");
	}

}

public class AnimalTest2 {

	public static void main(String[] args) {
		myAnimal2 cat2 = new myCat2();

		cat2.displayInfo2();
		System.out.println(cat2.sound2());
	}

}
