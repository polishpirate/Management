public class Boots extends Product {
	int size;
	boolean isNaturalSkin;
	
	public Boots(int size, boolean isNaturalSkin, String productName, int price, int weight, String color, int productCount) {
		super(productName, price, weight, color, productCount);
		this.size = size;
		this.isNaturalSkin = isNaturalSkin;
	}

	

	public int getSize() {
		return size;
	}

	public boolean isNaturalSkin(){
		return isNaturalSkin;
	}

	@Override
	public String toString()
	{
		// TODO: Implement this method
		return super.toString() + "Boots{" + 
										"size='" +size+ '\'' +
										", isNaturalSkin=" +isNaturalSkin+
										'}';
	}
}

