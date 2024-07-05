package edgarItzak.libraryCRUD;
import java.util.*;
import java.time.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Book> bookList = new ArrayList<Book>();
		List<Sale> salesList = new ArrayList<Sale>();

	}
	//ADD BOOK
	public void addBook(List<Book> bookList, String title, String author, String publicationDate, String category, int stock, float price) {
		int maxId = 0;
		for(Book book:bookList) {
			if(book.getId()>maxId) {
				maxId = book.getId();
			}
		}
		Book newBook = new Book((maxId+1), title, author, publicationDate, category, stock, price);
		bookList.add(newBook);
	}
	//SEARCH BY TITLE
	public List<Book> searchBookByTitle(List<Book> bookList, String title) {
		List<Book> booksByTitle = new ArrayList<Book>();
		bookList.forEach(n -> {
			if(n.getTitle().toLowerCase().contains(title.toLowerCase())) {
				booksByTitle.add(n);
			}
		});
		return booksByTitle;
	}
	//SEARCH BY AUTHOR
	public List<Book> searchBookByAuthor(List<Book> bookList, String author) {
		List<Book> booksByAuthor = new ArrayList<Book>();
		bookList.forEach(n -> {
			if(n.getAuthor().toLowerCase().contains(author.toLowerCase())) {
				booksByAuthor.add(n);
			}
		});
		return booksByAuthor;
	}
	//SEARCH BY CATEGORY
	public List<Book> searchBookByCategory(List<Book> bookList, String category) {
		List<Book> booksByCategory = new ArrayList<Book>();
		bookList.forEach(n -> {
			if(n.getCategory().toLowerCase().contains(category.toLowerCase())) {
				booksByCategory.add(n);
			}
		});
		return booksByCategory;
	}
	
	//TOTAL SALES
		public float totalSales(List<Sale> saleList) {
			float totalSales = 0.0f;
			for(Sale sale: saleList) {
				totalSales = totalSales + (sale.getPrice()*sale.getCuantity());
			}
			return totalSales;
		}
		//SELL BOOK
		public boolean sellBook(List<Sale> saleList,Book bookToSell, int cuantity){
			boolean sold = bookToSell.sellBook(cuantity);
			if (sold) {
				Sale sale = new Sale(saleList.size()+1,bookToSell.getId(), cuantity, bookToSell.getPrice(),LocalDate.now().toString());
				saleList.add(sale);
			}
			return sold;
		}
	
	
	
}

