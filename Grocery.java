
public class Grocery implements StockInterface{

	Product product;
	private int price;
	private int amount;
	

	
	
	
	public Grocery(Product product, int price, int amount) {
		super();
		this.product = product;
		this.price = price;
		this.amount = amount;
		
		//Warning, sale price (4) is lower than product cost (18)     
		if(price < product.getCost()) {
			System.out.println("Warning, sale price is lower than product cost");  
		
		}
		
			System.out.println("Now selling " + product + ", selling at " + price + "$ with " + amount + " left");
		
		
	}
	



	
	public Product getProduct() {
		return product;
	}





	public void setProduct(Product product) {
		this.product = product;
	}





	public int getPrice() {
		return price;
	}





	public void setPrice(int price) {
		this.price = price;
	}





	public int getAmount() {
		return amount;
	}





	public void setAmount(int amount) {
		this.amount = amount;
	}





	public String toString() {
		return  product + ", selling at " + price + "$ with " + amount + " left";
	}




	@Override
	public void setStockAmount(int newAmount) {
		// TODO Auto-generated method stub
		this.amount=newAmount;
		
	}

	@Override
	public void setStockPrice(int newPrice) {
		// TODO Auto-generated method stub
		this.price=newPrice;
	}

	@Override
	public int getStockAmount() {
		// TODO Auto-generated method stub
		return this.amount;
	}

	@Override
	public int getStockPrice() {
		// TODO Auto-generated method stub
		return this.price;
	}

}
