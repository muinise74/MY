import java.util.ArrayList;

public class StoreController {

	// 아래의 오류를 해결하시오
	private ArrayList<Store> list = new ArrayList<Store>();

	// StoreController생성자는 수정 하지 말 것
	public StoreController() {
		Restaurant r1 = new Restaurant("해성식당", "음식점", 80, 70, 60, 90);
		Restaurant r2 = new Restaurant("정림이네", "음식점", 100, 100, 71, 100);
		Restaurant r3 = new Restaurant("왕뼈사랑", "음식점", 90, 90, 90, 34);
		Salon s1 = new Salon("박승철", "미용실", 100, 100, 67.99);
		Salon s2 = new Salon("이가자", "미용실", 100, 100, 70.99);
		Salon s3 = new Salon("리안", "미용실", 87, 87, 87);
		list.add(r1);
		list.add(r2);
		list.add(r3);
		list.add(s1);
		list.add(s2);
		list.add(s3);
	}

	// 모든 식당의 정보목록을 돌려주는 getList 메소드를 구현하시오
	public ArrayList<Store> getList(String a) {
		ArrayList<Store> arr = new ArrayList<Store>();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).event.equals(a)) {
				arr.add(list.get(i));
			}
		}
		return arr;
	}

	// 해당 식당의 정보를 돌려주는 getStore 메소드를 구현하시오
	public ArrayList<Store> getStore(String searchStore) {
		ArrayList<Store> arr = new ArrayList<Store>();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).name.equals(searchStore)) {
				arr.add(list.get(i));
			}
		}
		return arr;
	}
	
}
