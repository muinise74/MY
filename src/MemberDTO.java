
public class MemberDTO {
	// db�� ǥ���ϱ����� ����� ������ vo class
	// vo -> value object
	String id;
	String pw;
	String nickName;
	
	public MemberDTO(String id, String pw, String nickName) {
		super();
		this.id = id;
		this.pw = pw;
		this.nickName = nickName;
	}
}
