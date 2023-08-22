/* 2개의 정수를 입력 받아 합을 출력하시오.
① 두 수 사이의 합계를 계산한다.
② 두 수 사이의 홀수의 합계를 계산한다.
③ 두 수 사이의 짝수의 합계를 계산한다.
2개의 값으로 각 합을 계산하여 돌려주는 
클래스와 메소드를 생성하시오. */

//0822 오후 05:20 미완성
import java.util.Scanner;

public class Result {

	public int R1(int a, int b) { // 두 수 사이의 합
		int r1 = 0;
		for (int i = a; i <= b; i++) {
			r1 += i;
		}
		return r1;
	}

	public int R2(int a, int b) { // 두 수 사이 홀수의 합
		int r2 = 0;
		for (int i = a; i <= b; i++) {
			if (i % 2 != 0) {
				r2 += i;
			}
		}
		return r2;
	}

	public int R3(int a, int b) { // 두 수 사이 짝수의 합
		int r3 = 0;
		for (int i = a; i <= b; i++) {
			if (i % 2 == 0) {
				r3 += i;
			}
		}
		return r3;
	}

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		// class result 호출
		Result ob1 = new Result();

		// 값 입력받기
		System.out.println(" 두 개의 값 입력 : ");
		int num1 = keyboard.nextInt();
		int num2 = keyboard.nextInt();
		
		//두 수 사이의 합, 두 수 사이 홀수의 합, 두 수 사이 짝수의 합
		//각각 저장
		int hap1 = ob1.R1(num1, num2);
		int hap2 = ob1.R2(num1, num2);
		int hap3 = ob1.R3(num1, num2);
		
		//두 수 사이의 합 출력
		System.out.println("두 수 사이의 합 :" + hap1);
		//두 수 사이 홀수의 합 출력
		System.out.println("두 수 사이 홀수의 합 :" + hap2);
		//두 수 사이 짝수의 합 출력
		System.out.println("두 수 사이 짝수의 합 :" + hap3);

	}
}
