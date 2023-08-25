package practice;

/*
 * 주석과 결과를 작성하세요.
 */
class Shape2 {
	private int x;
	private int y;

	public Shape2(int x, int y) { // 생성자. int 2개를 매개변수로 가짐 
		System.out.println("Shape");
		this.x = x; //x에 매개변수 값 넣음
		this.y = y; //y에 매개변수 값 넣음 
	}
}

class Rectangle2 extends Shape2 {
	private int width;
	private int height;

	public Rectangle2(int x, int y, int width, int height) { // 생성자. int 4개를 매개변수로 가짐
		super(x, y); // 상위 메소드 호출 
		System.out.println("Rectangle");
		this.width = width;
		this.height = height;
	}
}

class ColorRectangle extends Rectangle2 {
	private String color;

	public ColorRectangle(int x, int y, int width, int height, String color) {
		super(x, y, width, height); // 상위 메소드 호출 
		System.out.println("ColorRectangle");
		this.color = color;
	}
}

public class ShapeTest2 {
	public static void main(String[] args) {
		ColorRectangle obj = new ColorRectangle(10, 10, 20, 20, "red");
	}
}

/*
 * 결과
 * shape   rectangle   colorrectangle
 * 
 * 
 */
