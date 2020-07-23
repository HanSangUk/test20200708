package java0722;

import java.util.*;

public class BookService {
	Scanner scan = new Scanner(System.in);

	public void text(NameDTO name) {
		System.out.println("-----------------------------------------------------------------");
		System.out.println("1. 회원등록 | 2.도서등록 | 3. 도서대출 | 4. 도서반납 | 5. 도서목록 | 6. 종료");
		System.out.println("-----------------------------------------------------------------");
		System.out.print("선택 > ");
	}

	public NameDTO enter(NameDTO name) {
		System.out.print("회원 이름 : ");
		String name1 = scan.next();
		System.out.print("전화번호 : ");
		String num = scan.next();
		name.setName(name1);
		name.setNumber(num);
		return name;
	}

	public BookDTO enterbook(BookDTO book) {
		System.out.print("책 이름 : ");
		String name = scan.next();
		System.out.print("작가 이름 : ");
		String author = scan.next();
		System.out.print("책 번호 : ");
		int number = scan.nextInt();
		book.setBookname(name);
		book.setAuthor(author);
		book.setBooknumber(number);
		return book;
	}

	public void bookin(List<BookDTO> bookList) {
		for (int i = 1; i < bookList.size(); i++) {
			System.out.println(bookList.get(i).toString());
		}
	}

	public List<BookDTO> ang(List<BookDTO> bookList, List<NameDTO> nameList) {
		System.out.print("고객이름 : ");
		String num = scan.next();
		for (int i = 1; i < nameList.size(); i++) {
			if (num.equals(nameList.get(i).getName())) {
				System.out.print("빌릴책 번호 : ");
				int sum = scan.nextInt();
				for (int j = 1; j < bookList.size(); j++) {
					if (sum == bookList.get(j).getBooknumber()) {
						boolean boo = false;
						bookList.get(j).setLoans(boo);
						bookList.get(j).setLoansname(nameList.get(i).getName());
					} 
				}
			}

		}

		return bookList;
	}

	public List<BookDTO> bookin(List<BookDTO> bookList, List<NameDTO> nameList) {
		System.out.print("고객이름 : ");
		String num = scan.next();
		for (int i = 1; i < nameList.size(); i++) {
			if (num.equals(nameList.get(i).getName())) {
				System.out.print("반납할 책 번호 : ");
				int sum = scan.nextInt();
				boolean boo = false;
				for (int j = 1; j < bookList.size(); j++) {
					if (sum == bookList.get(j).getBooknumber() && boo == bookList.get(j).isLoans()) {
						boo = true;
						bookList.get(j).setLoans(boo);
						bookList.get(j).setLoansname(null);
					} 
				}
			}
		}
		return bookList;
	}
}