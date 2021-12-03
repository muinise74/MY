package exam02_adress;

public class Adress {
	
	private String name;
	private int age;
	private String phoneNumber;
	// Adress 생성자
	public Adress(String name, int age, String phoneNumber) {
		this.name = name;
		this.age = age;
		this.phoneNumber = phoneNumber;
	}
	// 이름 호출
	public String getName() {
		return name;
	}
	// 나이 호출
	public int getAge() {
		return age;
	}
	// 전화번호 호출
	public String getPhoneNumber() {
		return phoneNumber;
	}
	// 이름 변경
	public void setName(String name) {
		this.name = name;
	}
	// 나이 변경
	public void setAge(int age) {
		this.age = age;
	}
	// 전화번호 변경
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	// 전체 호출 
	public void show() {
		System.out.printf("[ 이름 : %s, 나이 : %d세, 전화번호 : %s ]\n",name,age,phoneNumber);
	}
}
