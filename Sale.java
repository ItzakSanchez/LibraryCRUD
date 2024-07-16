package edgarItzak.libraryCRUD;

public class Sale {
	int idSale;
	int idBook;
	int quantity;
	float price;
	String saleDate;
	
	public Sale(int idSale, int idBook, int quantity, float price, String saleDate) {
		super();
		this.idSale = idSale;
		this.idBook = idBook;
		this.quantity = quantity;
		this.price = price;
		this.saleDate = saleDate;
	}
	
	
	public int getIdSale() {
		return idSale;
	}

	public void setIdSale(int idSale) {
		this.idSale = idSale;
	}

	public int getIdBook() {
		return idBook;
	}

	public void setIdBook(int idBook) {
		this.idBook = idBook;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setquantity(int quantity) {
		this.quantity = quantity;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getSaleDate() {
		return saleDate;
	}

	public void setSaleDate(String saleDate) {
		this.saleDate = saleDate;
	}


}
