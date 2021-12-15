import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Scanner와 StoreController 객체는 건들지 말 것
		Scanner sc = new Scanner(System.in);
		StoreController controller = new StoreController();
		// ------------------------------------------------

		while (true) {
			System.out.print("[1]음식점보기 [2]미용실보기 [3]상세보기 [4]평점보기 [5]종료 >> ");
			int choice = sc.nextInt();
			if (choice == 1) {
				System.out.println("====음식점보기====");
				ArrayList<Store> rList = controller.getList("음식점");
				for (int i = 0; i < rList.size(); i++) {
					System.out.println(rList.get(i).name + "평점 : " + rList.get(i).grade());
				}
			} else if (choice == 2) {
				System.out.println("====미용실보기====");
				ArrayList<Store> hList = controller.getList("미용실");
				for (int i = 0; i < hList.size(); i++) {
					System.out.println(hList.get(i).name + "평점 : " + hList.get(i).grade());
				}
			} else if (choice == 3) {
				System.out.println("====상세정보====");
				System.out.print("식당 입력 : ");
				String searchStore = sc.next();
				ArrayList<Store> name = controller.getStore(searchStore);
				System.out.println("가게명 : " + name.get(0).name);
				for (int i = 10; i <= 100; i += 10) {
					System.out.printf("%3d ", i);
				}
				System.out.println();
				for (int i = 10; i <= name.get(0).grade(); i += 10) {
					System.out.print("  * ");
				}
				System.out.println();
				System.out.println("평점 : " + name.get(0).grade());

			} else if (choice == 4) {
				System.out.println("====평점보기====");
				ArrayList<Store> rList = controller.getList("음식점");
				ArrayList<Store> hList = controller.getList("미용실");
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
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("정확한 숫자를 입력해주세요.");
			}
		}
		sc.close();
	}

}
