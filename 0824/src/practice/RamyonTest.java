package practice;

import java.util.Scanner;

//�⺻ ��� Ŭ����
class Ramyon {
	String ramyon = "���"; // Ŭ���� �Ӽ�, ��ü ����
	String water = "��";
	String onion = "��";
	String garlic = "����";

	void boilwater() { // ���� ���̴� �޼ҵ� ����
		System.out.println(water + "�� ���δ�");
	}

	void cooking() {     // �丮�� �ϼ��ϴ� �޼ҵ�
		System.out.println(ramyon + "�� " + onion + "�� " + garlic + "�� �ְ� ���� �丮�ϼ�. ���ְ� �弼��!!!");	
	}
}

//����� Ŭ����
class RiceRamyon extends Ramyon { // �⺻ ��� Ŭ������ ���� ���(�Ӽ��� ���) ����.
	String topp = "��"; // ��ü ����

	void topping() { // �� ������ �߰��ϴ� �޼ҵ�
		System.out.println(topp + "�� �ִ´�");
	}
}

//ġ�� ��� Ŭ����
class CheeseRamyon extends Ramyon { // �⺻ ��� Ŭ�����κ��� ��� ����.
	String topp = "ġ��"; // ��ü ����

	void topping() { // ġ�� �߰��ϴ� �޼ҵ�.
		System.out.println("����~! �����߳�.." + topp + "�� ��鿡 �÷��� ���ְ� �Ծ��~");
	}
}

//���� ��� Ŭ���� 

public class RamyonTest {
	public static void main(String args[]) {
		int s;
		do {
			System.out.print("����� ���� �丮�� �Է��ϼ���. (1:�Ϲݶ��,2:�����,3:ġ����,4:���ζ��,99:����) : ");
			Scanner stdin = new Scanner(System.in);
                                    	s = stdin.nextInt();
                            			
                            			if (s == 1) {
                            				Ramyon r = new Ramyon();
                            				r.boilwater();
                            				r.cooking();
                            			} else if (s == 2) {
                            				RiceRamyon rr = new RiceRamyon();
                            				rr.boilwater();  // ���� Ŭ�������� ��ӵ� ��� ���.
                            				rr.topping();    // ����� Ŭ������ ���� �޼ҵ� ȣ��.
                            				rr.cooking();    // ���� Ŭ�������� ��ӵ� ��� ���.
                            			} else if (s == 3) {
                            				CheeseRamyon cr = new CheeseRamyon();
                            				cr.boilwater();  // ���� Ŭ�������� ��ӵ� ��� ���.		
                            				cr.cooking();    // ���� Ŭ�������� ��ӵ� ��� ���.
                            				cr.topping();    // ġ�� Ŭ������ ���� �޼ҵ� ȣ��.
                            			}
                            		} while ( s != 99);
                            		System.out.print("�����մϴ�");	
                            	}
}
