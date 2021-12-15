
// Restaurant 클래스의 필드와 생성자는 수정할 필요 없음
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
