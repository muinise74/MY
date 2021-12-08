package abstract_method;

public class PersonMain {
	
	public static void main(String[] args) {
		
		Man man1 = new Man();
		man1.breath();
		man1.eat();
		man1.think();
		
		Woman woman1 = new Woman();
		woman1.breath();
		woman1.eat();
		woman1.think();
		
		// Person person = new Person();
		// 불가능, 만들어서 샤용할 수는 있지만 일시적인것이기 떄문에 거의 사용하지 않는다.
		
	}

}
