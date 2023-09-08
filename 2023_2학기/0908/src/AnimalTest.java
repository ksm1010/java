/*
 *  작성일 : 2023년 9월 8일
 *  작성자 : 컴소부 202095015 김성미 
 *  설명 : 추상클래스 - 동물의 울음소리를 출력하자
 */

//추상클래스 : 동물

abstract class myAnimal {
	// 추상 메소드 : 동물의 소리를 반환하는 메소드
	// 추상 메소드는 선언만 함. 중괄호 사용하지 않고, 세미콜론으로 종료.
	abstract String sound();

	// 일반 메소드 : 동물의 기본 정보 출력하는 메소드
	void displayInfo() {
		System.out.println("동물의 울음소리 입니다.");
	}
}

// 고양이 클래스 - 추상 클래스를 상속.
class myCat extends myAnimal {

	@Override
	String sound() {
		//재정의
		return "야옹";
	}

	@Override
	void displayInfo() {
		System.out.println("고양이 울음소리 입니다.");
	}

}

public class AnimalTest  {

	public static void main(String[] args) {
		myAnimal cat = new myCat();
		
		cat.displayInfo();
		System.out.println(cat.sound());
	}

}
