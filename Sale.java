package edgarItzak.libraryCRUD;

public class Sale {
	int idSale;
	int idBook;
	int cuantity;
	float price;
	String saleDate;
	
	public Sale(int idSale, int idBook, int cuantity, float price, String saleDate) {
		super();
		this.idSale = idSale;
		this.idBook = idBook;
		this.cuantity = cuantity;
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

	public int getCuantity() {
		return cuantity;
	}

	public void setCuantity(int cuantity) {
		this.cuantity = cuantity;
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
