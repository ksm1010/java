class Continent {

	public String st1;
	public String st2;
	public double db1;
	public double db2;
	public String st3;

	public Continent(String st1) {
		this.st1 = st1;
	}

	public void show(String st) {
		System.out.println(st);
	}

}

class Country extends Continent { // 상속
	public Country(String st1, String st2, double db1, double db2) {
		super(st1);
		this.st2 = st2;
		this.db1 = db1;
		this.db2 = db2;

	}

	public void show2(String st, String st2, double db1, double db2) {
		System.out.println(st + st2 + db1 + db2);
	}

}

class City extends Country { // 상속

	public City(String st1, String st2, double db1, double db2, String st3) {
		super(st1, st2, db1, db2);
		st3 = "서울"; // 오버라이딩
		this.st3 = st3;
	}

	public void show2(String st, String st2, double db1, double db2, String st3) {
		System.out.println(st + st2 + db1 + db2 + st3);
	}

}

public class CityMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * City Ct0 = new City("아시아", "대한민국", 1.0, 2.0, "부산"); City CT1 = new
		 * City("아시아", "대한민국", 1.0, 2.0, "부산"); City Ct2 = new City("아시아", "대한민국", 1.0,
		 * 2.0); City Ct3 = new City("아시아");
		 */

		City Ct1 = new City("아시아", "대한민국", 1.0, 2.0, "부산");

		System.out.println(Ct1("아시아", "대한민국", 1.0, 2.0, "부산"));

	}

}
