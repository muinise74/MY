package kart;

public class MyKart implements Kart {
	
	int myPosition = position;
	int speed = 0;

	@Override
	public void accel(int num) {
		// 10 전진
		speed = num;
		myPosition += speed; 
	}

	@Override
	public void back(int num) {
		// 10 후진
		speed = -num;
		myPosition += speed;
	}

	@Override
	public void booster(int power) {
		// 현재 속도를 두배로 한 후 전진 또는 후진 
		speed *= power;
		myPosition += speed;
	}
	
	public void show() {
		System.out.println(myPosition);
	}
	

}
