package edgarItzak.libraryCRUD;

public class Book {
	
	private int id;
	private String title;
	private String author;
	private String publicationDate;
	private String category;
	private int stock;
	private float price;
	
	public Book(int id,String title, String author, String publicationDate, String category, int stock, float price) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.publicationDate = publicationDate;
		this.category = category;
		this.stock = stock;
		this.price = price;
	}
	

	public boolean sellBook(int cuantity) {
		if (this.stock>=cuantity) {
			this.stock = this.stock-cuantity;
			return true;
		} else {
			return false;
		}
	}
	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublicationDate() {
		return publicationDate;
	}

	public void setPublicationDate(String publicationDate) {
		this.publicationDate = publicationDate;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	
}