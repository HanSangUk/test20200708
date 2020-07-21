package java0720_1;

public class BoardDTO {
	String id;
	String pw;
	String text;

	@Override
	public String toString() {
		return "BoardDTO [id=" + id + ", pw=" + pw + ", text=" + text + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public BoardDTO() {
		
	}

}
