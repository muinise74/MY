import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// 1. �α��� 2. ȸ������ 3. ȸ����Ϻ��� 4. ȸ���������� 5. ȸ��Ż�� 6. ����
		Scanner sc = new Scanner(System.in);
		MemberDAO memberDAO = new MemberDAO();
		System.out.println("=====ȸ�� ���� �ý���=====");
		
		while (true) {
			System.out.print("[1. �α��� 2. ȸ������ 3. ȸ����Ϻ��� 4. ȸ���������� 5. ȸ��Ż�� 6. ����] ");
			int choice = sc.nextInt();
			
			if (choice == 1) {
				System.out.println("====Log-In====");
				System.out.print("ID �Է� : ");
				String id = sc.next();
				System.out.print("PassWord �Է� : ");
				String pw = sc.next();
				memberDAO.login(id,pw);
			} else if (choice == 2) {
				System.out.println("====ȸ������====");
				System.out.print("ID �Է� : ");
				String id = sc.next();
				System.out.print("PassWord �Է� : ");
				String pw = sc.next();
				System.out.print("�г��� �Է� : ");
				String nickName = sc.next();
				memberDAO.join(id,pw,nickName);
			} else if (choice == 3) {
				System.out.println("====ȸ�� ���====");
				memberDAO.describe();
			} else if (choice == 4) {
				System.out.println("====ȸ�� ���� ����====");
				System.out.print("ID �Է� : ");
				String id = sc.next();
				memberDAO.update(id);
			} else if (choice == 5) {
				System.out.println("====ȸ�� Ż��====");
				System.out.print("ID �Է� : ");
				String id = sc.next();
				System.out.print("PassWord �Է� : ");
				String pw = sc.next();
				memberDAO.secession(id, pw);
			} else if (choice == 6) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			} else {
				System.out.println("�޴��� �ִ� ���� �ٽ� �Է��� �ּ���!!!!");
			}
		}
		sc.close();
	}

}
