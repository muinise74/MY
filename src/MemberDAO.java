import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class MemberDAO {

	Scanner sc = new Scanner(System.in);

	private Connection conn;
	private PreparedStatement psmt;
	private PreparedStatement psmt2;
	private ResultSet rs;
	// 드리이버 로딩 및 커넥션 개체를 가져오는 메소드
	private void getConnection() {
		try {
			// JDBC
			// 0. JDBC를 사용하는 PROJECT에 드라이버 넣기....
			// 1. 드라이버 로딩 - 내가 사용하는 DBMS의 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 2. Connection 연결 - ID,PW,DB주소 必
			String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "hr";
			String db_pw = "hr";
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	// Java와 Database사이의 연결 해제
	private void close() {
		try {
			if (rs != null) {
				rs.close();
			}
			if (psmt2 != null) {
				psmt.close();
			}
			if (psmt != null) {
				psmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	// 로그인 기능
	public void login(String id, String pw) {

		try {
			getConnection();
			// 3. SQL문 작성 및 실행
			String sql = "SELECT * FROM bigmember WHERE ID = ? AND PW = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, pw);
			rs = psmt.executeQuery();
			if (rs.next()) {
				System.out.println("로그인 성공");
				System.out.println(rs.getString("nickName") + "님 환영합니다.");
			} else {
				System.out.println("로그인 실패");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}
	}
	// 회원가입
	public void join(String id, String pw, String nickName) {

		try {
			getConnection();
			// 3. SQL문 작성 및 실행
			String sql = "Insert into bigmember values(?,?,?)";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, pw);
			psmt.setString(3, nickName);
			int cnt = psmt.executeUpdate();
			if (cnt > 0) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("로그인 실패");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}
	}
	// 회원정보 수정
	public void update(String id) {

		try {
			String pw;
			String nickName;

			getConnection();

			String sql = "SELECT * FROM bigmember WHERE ID = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			rs = psmt.executeQuery();

			if (rs.next()) {
				pw = rs.getString("pw");
				nickName = rs.getString("nickName");
				System.out.println("비밀번호 또는 닉네임을 변경하시겠습니까?");
				System.out.print("[1. 비밀번호 변경 2. 닉네임 변경 3. 둘다 변경] ");
				int num = sc.nextInt();
				if (num == 1) {
					System.out.print("변경할 비밀번호 입력 : ");
					pw = sc.next();
				} else if (num == 2) {
					System.out.println("변경할 닉네임 입력 : ");
					nickName = sc.next();
				} else if (num == 3) {
					System.out.print("변경할 비밀번호 입력 : ");
					pw = sc.next();
					System.out.print("변경할 닉네임 입력 : ");
					nickName = sc.next();
				}

				// 3. SQL문 작성 및 실행
				int cnt = 0;
				if (num <= 3) {
					sql = "Update bigmember SET PW = ?, NICKNAME = ? Where ID = ?";
					psmt2 = conn.prepareStatement(sql);
					psmt2.setString(1, pw);
					System.out.println(pw);
					psmt2.setString(2, nickName);
					psmt2.setString(3, id);
					System.out.println(nickName);
					cnt = psmt2.executeUpdate();
				}
				if (cnt > 0) {
					System.out.println("수정 성공");
				} else {
					System.out.println("수정 실패");
				}

			} else {
				System.out.println("다시 시작해주세요...");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}
	}
	// 회원 정보 열람
	public void describe() {

		try {
			getConnection();
			// 3. SQL문 작성 및 실행
			String sql = "SELECT * FROM bigmember";
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while (rs.next()) {
				System.out.println("ID : " + rs.getString("id") + " NickName : " + rs.getString("nickName"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}
	}
	// 회원 탈퇴
	public void secession(String id, String pw) {

		try {
			getConnection();
			// 3. SQL문 작성 및 실행
			String sql = "DELETE FROM bigmember WHERE ID = ? AND PW = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, pw);
			rs = psmt.executeQuery();

			sql = "SELECT * FROM bigmember WHERE ID = ?";
			psmt2 = conn.prepareStatement(sql);
			psmt2.setString(1, id);
			rs = psmt2.executeQuery();
			if (rs.next()) {
				System.out.println("탈퇴 실패");
			} else {
				System.out.println("탈퇴 성공");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}
	}
}
