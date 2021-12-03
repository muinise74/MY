package Student;

public class Student {
	
	String name;
	String number;
	int age;
	int scoreJava;
	int scoreWeb;
	int scoreAndroid;
	
	public Student(String name, String number, int age, int scoreJava, int scoreWeb, int scoreAndroid) {
		
		this.name = name;
		this.number = number;
		this.age = age;
		this.scoreJava = scoreJava;
		this.scoreWeb = scoreWeb;
		this.scoreAndroid = scoreAndroid;
	}
	
	public void updateScore(int scoreJava, int scoreWeb, int scoreAndroid) {
		
		this.scoreJava = scoreJava;
		this.scoreWeb = scoreWeb;
		this.scoreAndroid = scoreAndroid;
	}
	
	public void updateAge(int age) {
		this.age = age;
	}
	
	public void show() {
		System.out.printf("������������������������������������������������������������������������������������������������������\n");
		System.out.printf("�� %s�� �ȳ��ϼ���.\n",name);
		System.out.printf("�� [�й� : %s, ���� : %d]\n",number,age);
		System.out.printf("�� %s�� Java������ %d�� �Դϴ�.\n",name,scoreJava);
		System.out.printf("�� %s�� Web������ %d�� �Դϴ�.\n",name,scoreWeb);
		System.out.printf("�� %s�� Android������ %d�� �Դϴ�.\n",name,scoreAndroid);
		System.out.printf("������������������������������������������������������������������������������������������������������\n");
	}
}
