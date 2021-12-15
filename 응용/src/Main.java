import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Scanner�� StoreController ��ü�� �ǵ��� �� ��
		Scanner sc = new Scanner(System.in);
		StoreController controller = new StoreController();
		// ------------------------------------------------

		while (true) {
			System.out.print("[1]���������� [2]�̿�Ǻ��� [3]�󼼺��� [4]�������� [5]���� >> ");
			int choice = sc.nextInt();
			if (choice == 1) {
				System.out.println("====����������====");
				ArrayList<Store> rList = controller.getList("������");
				for (int i = 0; i < rList.size(); i++) {
					System.out.println(rList.get(i).name + "���� : " + rList.get(i).grade());
				}
			} else if (choice == 2) {
				System.out.println("====�̿�Ǻ���====");
				ArrayList<Store> hList = controller.getList("�̿��");
				for (int i = 0; i < hList.size(); i++) {
					System.out.println(hList.get(i).name + "���� : " + hList.get(i).grade());
				}
			} else if (choice == 3) {
				System.out.println("====������====");
				System.out.print("�Ĵ� �Է� : ");
				String searchStore = sc.next();
				ArrayList<Store> name = controller.getStore(searchStore);
				System.out.println("���Ը� : " + name.get(0).name);
				for (int i = 10; i <= 100; i += 10) {
					System.out.printf("%3d ", i);
				}
				System.out.println();
				for (int i = 10; i <= name.get(0).grade(); i += 10) {
					System.out.print("  * ");
				}
				System.out.println();
				System.out.println("���� : " + name.get(0).grade());

			} else if (choice == 4) {
				System.out.println("====��������====");
				ArrayList<Store> rList = controller.getList("������");
				ArrayList<Store> hList = controller.getList("�̿��");
				for (int i = 100; i >= 0; i -= 10) {
					if (i > 0) {
						System.out.printf("%3d\t", i);
						for (int j = 0; j < 6; j++) {
							if (j < 3) {
								System.out.print(rList.get(j).grade() >= i ? "*\t" : " \t");
							} else {
								System.out.print(hList.get(j - 3).grade() >= i ? "*\t" : " \t");
							}
						}
					} else if (i == 0) {
						System.out.print("   \t");
						for (int j = 0; j < 6; j++) {
							if (j < 3) {
								System.out.print(rList.get(j).name+"\t");
							} else {
								System.out.print(hList.get(j - 3).name+"\t");
							}
						}
					}
					System.out.println("");
				}

			} else if (choice == 5) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			} else {
				System.out.println("��Ȯ�� ���ڸ� �Է����ּ���.");
			}
		}
		sc.close();
	}

}
