
public class Product {


	private int productNo;
	private String name;
	private String type;
	private int cost;
	static int count=0;
	
	

public Product( String name, String type, int cost) {
		super();
		this.name = name;
		this.type = type;
		this.cost = cost;
		
		this.productNo=++count;
	}

  /*	public Product() {
		
			this.productNo=productNo;
			this.productNo=++count;	
		//productNo++;
			
		
	}*/


	@Override
	public String toString() {
		return "Product #" + productNo + ": " +  name + " (" + type + ") " +  cost + "$"; 
	}

	

	public int getProductNo() {
		return productNo;
	}

	public void setProductNo(int productNo) {
		this.productNo = productNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	
	
}
