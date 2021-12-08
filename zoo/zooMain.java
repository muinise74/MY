package zoo;

public class zooMain {

	public static void main(String[] args) {
		
		Animal ani = new Animal();
		System.out.println(ani.claw);
		System.out.println(ani.tailSize);
		System.out.println(ani.teeth);
		System.out.println(ani.species);
		System.out.println(ani.habitat);
		System.out.println(ani.pattern);
		System.out.println(ani.tail);
		
		Dog dog = new Dog();
		dog.pattern = "stripe";
		Animal ani2 = dog;
		System.out.println(ani2.pattern);
		ani2.pattern = "star";
		System.out.println(dog.pattern);
	}

}
