package exam02_adress;

public class Adress {
	
	private String name;
	private int age;
	private String phoneNumber;
	// Adress ������
	public Adress(String name, int age, String phoneNumber) {
		this.name = name;
		this.age = age;
		this.phoneNumber = phoneNumber;
	}
	// �̸� ȣ��
	public String getName() {
		return name;
	}
	// ���� ȣ��
	public int getAge() {
		return age;
	}
	// ��ȭ��ȣ ȣ��
	public String getPhoneNumber() {
		return phoneNumber;
	}
	// �̸� ����
	public void setName(String name) {
		this.name = name;
	}
	// ���� ����
	public void setAge(int age) {
		this.age = age;
	}
	// ��ȭ��ȣ ����
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	// ��ü ȣ�� 
	public void show() {
		System.out.printf("[ �̸� : %s, ���� : %d��, ��ȭ��ȣ : %s ]\n",name,age,phoneNumber);
	}
}
