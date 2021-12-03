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
		System.out.printf("忙式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式\n");
		System.out.printf("弛 %s椒 寰喟ж撮蹂.\n",name);
		System.out.printf("弛 [з廓 : %s, 釭檜 : %d]\n",number,age);
		System.out.printf("弛 %s椒 Java薄熱朝 %d薄 殮棲棻.\n",name,scoreJava);
		System.out.printf("弛 %s椒 Web薄熱朝 %d薄 殮棲棻.\n",name,scoreWeb);
		System.out.printf("弛 %s椒 Android薄熱朝 %d薄 殮棲棻.\n",name,scoreAndroid);
		System.out.printf("戌式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式\n");
	}
}
