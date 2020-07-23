package java0722;

import java.util.*;

public class BookService {
	Scanner scan = new Scanner(System.in);

	public void text(NameDTO name) {
		System.out.println("-----------------------------------------------------------------");
		System.out.println("1. ȸ����� | 2.������� | 3. �������� | 4. �����ݳ� | 5. ������� | 6. ����");
		System.out.println("-----------------------------------------------------------------");
		System.out.print("���� > ");
	}

	public NameDTO enter(NameDTO name) {
		System.out.print("ȸ�� �̸� : ");
		String name1 = scan.next();
		System.out.print("��ȭ��ȣ : ");
		String num = scan.next();
		name.setName(name1);
		name.setNumber(num);
		return name;
	}

	public BookDTO enterbook(BookDTO book) {
		System.out.print("å �̸� : ");
		String name = scan.next();
		System.out.print("�۰� �̸� : ");
		String author = scan.next();
		System.out.print("å ��ȣ : ");
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
		System.out.print("���̸� : ");
		String num = scan.next();
		for (int i = 1; i < nameList.size(); i++) {
			if (num.equals(nameList.get(i).getName())) {
				System.out.print("����å ��ȣ : ");
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
		System.out.print("���̸� : ");
		String num = scan.next();
		for (int i = 1; i < nameList.size(); i++) {
			if (num.equals(nameList.get(i).getName())) {
				System.out.print("�ݳ��� å ��ȣ : ");
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