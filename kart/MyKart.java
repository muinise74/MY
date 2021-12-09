package kart;

public class MyKart implements Kart {
	
	int myPosition = position;
	int speed = 0;

	@Override
	public void accel(int num) {
		// 10 ����
		speed = num;
		myPosition += speed; 
	}

	@Override
	public void back(int num) {
		// 10 ����
		speed = -num;
		myPosition += speed;
	}

	@Override
	public void booster(int power) {
		// ���� �ӵ��� �ι�� �� �� ���� �Ǵ� ���� 
		speed *= power;
		myPosition += speed;
	}
	
	public void show() {
		System.out.println(myPosition);
	}
	

}
