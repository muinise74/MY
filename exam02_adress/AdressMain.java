package exam02_adress;

import java.util.ArrayList;
import java.util.Scanner;

public class AdressMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// ��ȭ��ȣ�� ����
		ArrayList<Adress> phoneBook = new ArrayList<Adress>();
		// ��ȭ��ȣ�� ���
		int startEnd = 0;
		while (startEnd != 5) {
			System.out.print("�޴� : [1] �߰� [2] ��ü��ȸ [3] ���� [4] �˻� [5] ���� ");
			startEnd = sc.nextInt();
			switch (startEnd) {
			case 1:
				// �߰�
				System.out.println("�߰��� ���� �Է� �����");
				System.out.print("�̸� : ");
				String name = sc.next();
				System.out.print("���� : ");
				int age = sc.nextInt();
				System.out.print("��ȭ��ȣ : ");
				String phoneNumber = sc.next();

				Adress pn = new Adress(name, age, phoneNumber);
				phoneBook.add(pn);
				break;
			case 2:
				// ��ü ��ȸ
				System.out.println("����� ��ü ��� �����");
				if (phoneBook.size() != 0) {
					for (int i = 0; i < phoneBook.size(); i++) {
						System.out.print(i + 1 + ". ");
						phoneBook.get(i).show();
					}
				} else {
					System.out.println("��ϵ� ����ó�� �����ϴ�.");
				}
				
				break;
			case 3:
				// ����
				System.out.print("������ �� �Է� : ");
				int remove = sc.nextInt();
				phoneBook.remove(remove - 1);
				break;
			case 4:
				// �˻� - �̸�����..
				System.out.print("ã�� ����� �̸� �Է� : ");
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
					System.out.println("ã�� ����� �����ϴ�.");
				}
				
				break;
			case 5:
				// ����
				System.out.println("���α׷� ����");
				break;
			}
		}
		sc.close();
	}

}
