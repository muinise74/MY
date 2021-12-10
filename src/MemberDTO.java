
public class MemberDTO {
	// db를 표현하기위한 사용자 임의의 vo class
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
