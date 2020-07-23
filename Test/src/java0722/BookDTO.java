package java0722;

public class BookDTO {

	private String bookname; // 책이름
	private String author; // 작가
	private int booknumber; // 책 넘버
	private boolean loans = true; // 대출여부
	private String loansname; // 대출받은 사람?

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
