package sec03.exam02;

public class Exam06_4 {
	public static void main(String[] args) {
		Exam06_4 mt = new Exam06_4();
		Exam06_4_Class.method1();
		/* Exam06_4_Class�� method1() ȣ�� */

	}
}

class Exam06_4_Class {
	int a; // �������� a
	
	public static void method1() {
		System.out.println("method1 ���� ����");
		Exam06_4_Class e = new Exam06_4_Class();
		for (int i = 0; i < 5; i++) {
			
			
			
			e.method2();
			
			/* method2 ȣ�� */
		}
		System.out.println("method1 ���� ����");
	}
	
	public void method2() {
		this.a ++;
		System.out.println(a);
		/* �������� a�� ���� 1�� ���� */
		/* �������� a�� �� ��� */
	}
}