package exam02_adress;

import java.util.ArrayList;
import java.util.Scanner;

public class AdressMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 전화번호부 생성
		ArrayList<Adress> phoneBook = new ArrayList<Adress>();
		// 전화번호부 기능
		int startEnd = 0;
		while (startEnd != 5) {
			System.out.print("메뉴 : [1] 추가 [2] 전체조회 [3] 제거 [4] 검색 [5] 종료 ");
			startEnd = sc.nextInt();
			switch (startEnd) {
			case 1:
				// 추가
				System.out.println("추가할 정보 입력 ↓↓↓↓");
				System.out.print("이름 : ");
				String name = sc.next();
				System.out.print("나이 : ");
				int age = sc.nextInt();
				System.out.print("전화번호 : ");
				String phoneNumber = sc.next();

				Adress pn = new Adress(name, age, phoneNumber);
				phoneBook.add(pn);
				break;
			case 2:
				// 전체 조회
				System.out.println("↓↓↓↓ 전체 목록 ↓↓↓↓");
				if (phoneBook.size() != 0) {
					for (int i = 0; i < phoneBook.size(); i++) {
						System.out.print(i + 1 + ". ");
						phoneBook.get(i).show();
					}
				} else {
					System.out.println("등록된 연락처가 없습니다.");
				}
				
				break;
			case 3:
				// 제거
				System.out.print("삭제할 행 입력 : ");
				int remove = sc.nextInt();
				phoneBook.remove(remove - 1);
				break;
			case 4:
				// 검색 - 이름으로..
				System.out.print("찾는 사람의 이름 입력 : ");
				String search = sc.next();
				boolean isCheck = false;
				for (int i = 0; i < phoneBook.size(); i++) {
					if (phoneBook.get(i).getName().equals(search)) {
						System.out.print(i + 1 + ". ");
						phoneBook.get(i).show();
					}
					isCheck = isCheck || phoneBook.get(i).getName().equals(search);
				}
				if (isCheck) {
				} else {
					System.out.println("찾는 사람이 없습니다.");
				}
				
				break;
			case 5:
				// 종료
				System.out.println("프로그램 종료");
				break;
			}
		}
		sc.close();
	}

}
