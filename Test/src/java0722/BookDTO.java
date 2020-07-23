package java0722;

public class BookDTO {

	private String bookname; // å�̸�
	private String author; // �۰�
	private int booknumber; // å �ѹ�
	private boolean loans = true; // ���⿩��
	private String loansname; // ������� ���?

	public BookDTO() {
		
	}
	
	
	@Override
	public String toString() {
		return "BookDTO [bookname=" + bookname + ", author=" + author + ", booknumber=" + booknumber + ", loans="
				+ loans + ", loansname=" + loansname + "]";
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getBooknumber() {
		return booknumber;
	}

	public void setBooknumber(int booknumber) {
		this.booknumber = booknumber;
	}

	public boolean isLoans() {
		return loans;
	}

	public void setLoans(boolean loans) {
		this.loans = loans;
	}

	public String getLoansname() {
		return loansname;
	}

	public void setLoansname(String loansname) {
		this.loansname = loansname;
	}

}
