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
		// �Ұ���, ���� ������ ���� ������ �Ͻ����ΰ��̱� ������ ���� ������� �ʴ´�.
		
	}

}
