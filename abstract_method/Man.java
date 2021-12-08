package abstract_method;

public class Man extends Person{
	// 추상 메소드가 있는 추상 클래스를 상속 받는다면 추상 메소드를 구현 必
	@Override
	public void breath() {
		System.out.println("Breathing");
	}
	@Override
	public void eat() {
		System.out.println("Eating");
	}
	@Override
	public void think() {
		System.out.println("Thinking");
	}

}
