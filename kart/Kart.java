package kart;

public interface Kart {
	// ������
	int position = 0;
	// ����
	public abstract void accel(int num);
	// ����
	public abstract void back(int num);
	// �ν���
	public abstract void booster(int power);

}
