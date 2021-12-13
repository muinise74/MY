
public class MemberDTO {
	// db를 표현하기위한 사용자 임의의 vo class
	// vo -> value object
	private String id;
	private String pw;
	private String nickName;
	
	public MemberDTO(String id, String pw, String nickName) {
		super();
		this.id = id;
		this.pw = pw;
		this.nickName = nickName;
	}

	public String getId() {
		return id;
	}

	public String getPw() {
		return pw;
	}

	public String getNickName() {
		return nickName;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	
	public void show() {
		System.out.printf("ID : %s PW :%s NickName : %s\n",id,pw,nickName);
	}
}
