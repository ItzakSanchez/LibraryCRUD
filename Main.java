package edgarItzak.libraryCRUD;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Book> booksList = new ArrayList<Book>();
		List<Sale> salesList = new ArrayList<Sale>();

	}
	
	public List<Book> searchBookByTitle(List<Book> bookList, String title) {
		List<Book> booksByTitle = new ArrayList<Book>();
		bookList.forEach(n -> {
			if(n.getTitle().toLowerCase().contains(title.toLowerCase())) {
				booksByTitle.add(n);
			}
		});
		return booksByTitle;
	}
}
