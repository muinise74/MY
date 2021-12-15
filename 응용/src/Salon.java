// Salon 클래스의 필드와 생성자는 수정할 필요 없음
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
