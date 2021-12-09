package kart;

public interface Kart {
	// 시작접
	int position = 0;
	// 전진
	public abstract void accel(int num);
	// 후진
	public abstract void back(int num);
	// 부스터
	public abstract void booster(int power);

}
