package abstract_method;

public class Woman extends Person {

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
