import java.util.ArrayList;

public class StoreController {

	// �Ʒ��� ������ �ذ��Ͻÿ�
	private ArrayList<Store> list = new ArrayList<Store>();

	// StoreController�����ڴ� ���� ���� �� ��
	public StoreController() {
		Restaurant r1 = new Restaurant("�ؼ��Ĵ�", "������", 80, 70, 60, 90);
		Restaurant r2 = new Restaurant("�����̳�", "������", 100, 100, 71, 100);
		Restaurant r3 = new Restaurant("�ջ����", "������", 90, 90, 90, 34);
		Salon s1 = new Salon("�ڽ�ö", "�̿��", 100, 100, 67.99);
		Salon s2 = new Salon("�̰���", "�̿��", 100, 100, 70.99);
		Salon s3 = new Salon("����", "�̿��", 87, 87, 87);
		list.add(r1);
		list.add(r2);
		list.add(r3);
		list.add(s1);
		list.add(s2);
		list.add(s3);
	}

	// ��� �Ĵ��� ��������� �����ִ� getList �޼ҵ带 �����Ͻÿ�
	public ArrayList<Store> getList(String a) {
		ArrayList<Store> arr = new ArrayList<Store>();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).event.equals(a)) {
				arr.add(list.get(i));
			}
		}
		return arr;
	}

	// �ش� �Ĵ��� ������ �����ִ� getStore �޼ҵ带 �����Ͻÿ�
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
