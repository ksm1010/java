class Continent {

	public String st1; // ���
	public String st2; // ����
	public double db1; // ����
	public double db2; // ����
	public String st3; // ����

	public Continent(String st1) {
		this.st1 = st1;
	}

	public void show(String st) { // �����ε�
		System.out.println(st);
	}

}

class Country extends Continent { // ���
	public Country(String st1, String st2, double db1, double db2) {
		super(st1);
		this.st2 = st2;
		this.db1 = db1;
		this.db2 = db2;

	}

	public void show(String st, String st2, double db1, double db2) {
		// �����ε�

		System.out.println(st + st2 + db1 + db2);
	}

}

class City extends Country { // ���

	public City(String st1, String st2, double db1, double db2, String st3) {
		super(st1, st2, db1, db2);
	}

	public void show(String st, String st2, double db1, double db2, String st3) {
		// �����ε�

		this.st3 = st3;
		st3 = " ����"; // �������̵�
		System.out.println(st + st2 + db1 + db2 + st3);
	}

}

public class CityMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		City Ct1 = new City("�ƽþ� ", "���ѹα�", 1.0, 2.0, " �λ�");

		Ct1.show("�ƽþ� ", "���ѹα� ", 1.0, 2.0, " �λ�");
		Ct1.show("�ƽþ� ", "���ѹα� ", 1.0, 2.0);
		Ct1.show("�ƽþ�");

		// System.out.println(Ct1());

	}

}