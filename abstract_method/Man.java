package abstract_method;

public class Man extends Person{
	// �߻� �޼ҵ尡 �ִ� �߻� Ŭ������ ��� �޴´ٸ� �߻� �޼ҵ带 ���� ��
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
