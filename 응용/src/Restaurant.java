
// Restaurant Ŭ������ �ʵ�� �����ڴ� ������ �ʿ� ����
public class Restaurant extends Store {

	double service;
	double flavor;
	double clean;

	public Restaurant(String name, String event, double price, double service, double flavor, double clean) {
		this.name = name;
		this.event = event;
		this.price = price;
		this.service = service;
		this.flavor = flavor;
		this.clean = clean;
	}

	@Override
	public double grade() {
		double result = price + service + flavor + clean;
		result = result/4*100;
		int a = (int)result;
		result = a/100.0;
		return result;
	}

}
