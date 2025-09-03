package java8.sort;

public class Shop {

	private String category;
	
	private String name;
	
	private double price;

	public Shop(String category, String name, double price) {
		super();
		this.category = category;
		this.name = name;
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Shop [category=" + category + ", name=" + name + ", price=" + price + "]";
	}
	
	

}
