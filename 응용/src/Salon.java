// Salon Ŭ������ �ʵ�� �����ڴ� ������ �ʿ� ����
public class Salon extends Store {

	double technology;
	double kindness;

	public Salon(String name, String event, double price, double technology, double kindness) {
		this.name = name;
		this.event = event;
		this.price = price;
		this.technology = technology;
		this.kindness = kindness;
	}

	@Override
	public double grade() {
		double result = price + technology + kindness;
		result = result / 3 * 100;
		int a = (int) result;
		result = a / 100.0;
		return result;
	}

}
