import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// 1. 로그인 2. 회원가입 3. 회원목록보기 4. 회원정보수정 5. 회원탈퇴 6. 종료
		Scanner sc = new Scanner(System.in);
		MemberDAO memberDAO = new MemberDAO();
		System.out.println("=====회원 관리 시스템=====");
		
		while (true) {
			System.out.print("[1. 로그인 2. 회원가입 3. 회원목록보기 4. 회원정보수정 5. 회원탈퇴 6. 종료] ");
			int choice = sc.nextInt();
			
			if (choice == 1) {
				System.out.println("====Log-In====");
				System.out.print("ID 입력 : ");
				String id = sc.next();
				System.out.print("PassWord 입력 : ");
				String pw = sc.next();
				memberDAO.login(id,pw);
			} else if (choice == 2) {
				System.out.println("====회원가입====");
				System.out.print("ID 입력 : ");
				String id = sc.next();
				System.out.print("PassWord 입력 : ");
				String pw = sc.next();
				System.out.print("닉네임 입력 : ");
				String nickName = sc.next();
				memberDAO.join(id,pw,nickName);
			} else if (choice == 3) {
				System.out.println("====회원 목록====");
				memberDAO.describe();
			} else if (choice == 4) {
				System.out.println("====회원 정보 수정====");
				System.out.print("ID 입력 : ");
				String id = sc.next();
				memberDAO.update(id);
			} else if (choice == 5) {
				System.out.println("====회원 탈퇴====");
				System.out.print("ID 입력 : ");
				String id = sc.next();
				System.out.print("PassWord 입력 : ");
				String pw = sc.next();
				memberDAO.secession(id, pw);
			} else if (choice == 6) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("메뉴에 있는 수로 다시 입력해 주세요!!!!");
			}
		}
		sc.close();
	}

}
