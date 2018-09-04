public class Cloth extends Product {
	private String size;
	private String material;

	public Cloth(String size, String material, String productName, int price, int weight, String color, int productCount) {
		super(productName, price, weight, color, productCount);
		this.size = size;
		this.material = material;
	}


	public String getSize()
	{
		return size;
	}


	public String getMaterial()
	{
		return material;
	}

	@Override
	public String toString()
	{
		// TODO: Implement this method
		return super.toString() + "Cloth {" +
								"size= "+size+ '\''+
								", material= "+material+
								'}';
								
		
	}

	
	
}

