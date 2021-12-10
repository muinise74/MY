import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class MemberDAO {
	
	Scanner sc = new Scanner(System.in);
	// �α��� ���
	public void login(String id, String pw) {
	
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		
		try {
			// JDBC
			// 0. JDBC�� ����ϴ� PROJECT�� ����̹� �ֱ�....
			// 1. ����̹� �ε� - ���� ����ϴ� DBMS�� ����̹� �ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 2. Connection ���� - ID,PW,DB�ּ� ��
			String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "hr";
			String db_pw = "hr";
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
			
			// 3. SQL�� �ۼ� �� ����
			String sql = "SELECT * FROM bigmember WHERE ID = ? AND PW = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1,id);
			psmt.setString(2,pw);
			rs = psmt.executeQuery();
			if (rs.next()) {
				System.out.println("�α��� ����");
				System.out.println(rs.getString("nickName")+"�� ȯ���մϴ�.");
			} else {
				System.out.println("�α��� ����");
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// Java�� Database������ ���� ����
			try {
				if (rs != null) {
					rs.close();
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
	}
	
	public void join(String id, String pw, String nickName) {
		Connection conn = null;
		PreparedStatement psmt = null;
		
		try {
			// JDBC
			// 0. JDBC�� ����ϴ� PROJECT�� ����̹� �ֱ�....
			// 1. ����̹� �ε� - ���� ����ϴ� DBMS�� ����̹� �ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 2. Connection ���� - ID,PW,DB�ּ� ��
			String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "hr";
			String db_pw = "hr";
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
			
			// 3. SQL�� �ۼ� �� ����
			String sql = "Insert into bigmember values(?,?,?)";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1,id);
			psmt.setString(2,pw);
			psmt.setString(3,nickName);
			int cnt = psmt.executeUpdate();
			if (cnt > 0) {
				System.out.println("�α��� ����");
			} else {
				System.out.println("�α��� ����");
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// Java�� Database������ ���� ����
			try {
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
	}
	
	public void update(String id) {
		Connection conn = null;
		PreparedStatement psmt = null;
		PreparedStatement psmt2 = null;
		ResultSet rs = null;
		
		try {
			// JDBC
			// 0. JDBC�� ����ϴ� PROJECT�� ����̹� �ֱ�....
			// 1. ����̹� �ε� - ���� ����ϴ� DBMS�� ����̹� �ε�
			String pw;
			String nickName;
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 2. Connection ���� - ID,PW,DB�ּ� ��
			String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "hr";
			String db_pw = "hr";
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
			
			String sql = "SELECT * FROM bigmember WHERE ID = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1,id);
			rs = psmt.executeQuery();
			
			if (rs.next()) {
				pw = rs.getString("pw");
				nickName = rs.getString("nickName");
				System.out.println("��й�ȣ �Ǵ� �г����� �����Ͻðڽ��ϱ�?");
				System.out.print("[1. ��й�ȣ ���� 2. �г��� ���� 3. �Ѵ� ����] ");
				int num = sc.nextInt();
				if (num == 1) {
					System.out.print("������ ��й�ȣ �Է� : ");
					pw = sc.next();
				} else if(num==2) {
					System.out.println("������ �г��� �Է� : ");
					nickName = sc.next();
				} else if(num==3) {
					System.out.print("������ ��й�ȣ �Է� : ");
					pw = sc.next();
					System.out.print("������ �г��� �Է� : ");
					nickName = sc.next();
				} 
				
				// 3. SQL�� �ۼ� �� ����
				int cnt = 0;
				if (num <= 3) {
					sql = "Update bigmember SET PW = ?, NICKNAME = ? Where ID = ?";
					psmt2 = conn.prepareStatement(sql);
					psmt2.setString(1,pw);
					System.out.println(pw);
					psmt2.setString(2,nickName);
					psmt2.setString(3,id);
					System.out.println(nickName);
					cnt = psmt2.executeUpdate();
				}
				if (cnt > 0) {
					System.out.println("���� ����");
				} else {
					System.out.println("���� ����");
				}
				
			} else {
				System.out.println("�ٽ� �������ּ���...");
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// Java�� Database������ ���� ����
			try {
				if(rs != null) {
					rs.close();
				}
				if (psmt2 != null) {
					psmt2.close();
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
	}

	public void describe() {
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		
		try {
			// JDBC
			// 0. JDBC�� ����ϴ� PROJECT�� ����̹� �ֱ�....
			// 1. ����̹� �ε� - ���� ����ϴ� DBMS�� ����̹� �ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 2. Connection ���� - ID,PW,DB�ּ� ��
			String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "hr";
			String db_pw = "hr";
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
			
			// 3. SQL�� �ۼ� �� ����
			String sql = "SELECT * FROM bigmember";
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while (rs.next()) {
				System.out.println("ID : " + rs.getString("id") +" NickName : "+rs.getString("nickName"));
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// Java�� Database������ ���� ����
			try {
				if (rs != null) {
					rs.close();
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
	}
	
	public void secession(String id, String pw) {
		Connection conn = null;
		PreparedStatement psmt = null;
		PreparedStatement psmt2 = null;
		ResultSet rs = null;
		
		try {
			// JDBC
			// 0. JDBC�� ����ϴ� PROJECT�� ����̹� �ֱ�....
			// 1. ����̹� �ε� - ���� ����ϴ� DBMS�� ����̹� �ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 2. Connection ���� - ID,PW,DB�ּ� ��
			String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "hr";
			String db_pw = "hr";
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
			
			// 3. SQL�� �ۼ� �� ����
			String sql = "DELETE FROM bigmember WHERE ID = ? AND PW = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1,id);
			psmt.setString(2,pw);
			rs = psmt.executeQuery();
			
			sql = "SELECT * FROM bigmember WHERE ID = ?";
			psmt2 = conn.prepareStatement(sql);
			psmt2.setString(1,id);
			rs = psmt2.executeQuery();
			if (rs.next()) {
				System.out.println("Ż�� ����");
			} else {
				System.out.println("Ż�� ����");
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// Java�� Database������ ���� ����
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
	}
}
