package Student;

public class StudentMain {

	public static void main(String[] args) {
		
		
		Student student1 = new Student("ȫ�浿","20150675",22,0,0,0);
		student1.updateScore(50,89,77);
		Student student2 = new Student("�迵��","20090541",29,0,0,0);
		student2.updateScore(90,25,30);
		Student student3 = new Student("�̸�����","�й�����",0,0,0,0);
		
		student1.show();
		student2.show();
		student3.show();
	}

}
