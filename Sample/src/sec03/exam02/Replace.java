package sec03.exam02;

public class Replace {
	public static void main(String[] args) {
		String str1 = "�ڹ� ���α׷���";
		String str2 = null;
		String str3 = null;
		

		str2 = str1.replace("�ڹ�", "Java"); // str1�� ���� �״�� ����
		System.out.println(str2);
		str3 = str1.replace("���α׷���", "programing");
        System.out.println(str3);
        str2 = str3.substring(0,2);
        System.out.println(str2);
        
	}
}