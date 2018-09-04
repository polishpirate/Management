public class Product {
	private String id;
	private String productName;
	private int price;
	private int weight;
	private String color;
	private int productCount;
	

	public Product(String productName, int price, int weight, String color, int productCount) {
		this.productName = productName;
		this.price = price;
		this.weight = weight;
		this.color = color;
		this.productCount = productCount;
		
	}

	

	public String getId() {
		return id;
	}


	public String getProductName() {
		return productName;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	
	public int getWeight(){
		return weight;
	}


	public String getColor()
	{
		return color;
	}

	public void setProductCount(int productCount)
	{
		this.productCount = productCount;
	}

	public int getProductCount()
	{
		return productCount;
	}
	
	}
