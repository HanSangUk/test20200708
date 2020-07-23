package java0722;

import java.util.*;

public class BookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		NameDTO name = null;
		BookDTO book = null;
		BookService bookser = new BookService();
		List<NameDTO> nameList = new ArrayList<NameDTO>();
		nameList.add(0, null);
		List<BookDTO> bookList = new ArrayList<BookDTO>();
		bookList.add(0, null);
		boolean boo = true;
		while (boo) {
			bookser.text(name);
			int num = scan.nextInt();
			switch (num) {
			case 1:
				name = new NameDTO();
				name = bookser.enter(name);
				nameList.add(name);
				break;
			case 2:
				book = new BookDTO();
				book = bookser.enterbook(book);
				bookList.add(book);
				break;
			case 3:
				bookList = bookser.ang(bookList, nameList);
				break;
			case 4:
				bookList = bookser.bookin(bookList, nameList);
				break;
			case 5:
				bookser.bookin(bookList);
				// false = 대출
				// true = 안빌린거
				break;
			case 6:
				System.out.println("프로그램 종료");
				boo = false;
				break;
			}
		}
		scan.close();
	}

}
