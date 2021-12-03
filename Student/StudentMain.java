package Student;

public class StudentMain {

	public static void main(String[] args) {
		
		
		Student student1 = new Student("È«±æµ¿","20150675",22,0,0,0);
		student1.updateScore(50,89,77);
		Student student2 = new Student("±è¿µÈñ","20090541",29,0,0,0);
		student2.updateScore(90,25,30);
		Student student3 = new Student("ÀÌ¸§¾øÀ½","ÇĞ¹ø¾øÀ½",0,0,0,0);
		
		student1.show();
		student2.show();
		student3.show();
	}

}
