import java.util.ArrayList;
import java.util.Scanner;

public class InventoryProgram {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		ArrayList<Product> ProductArrayList = new ArrayList<Product>();
		ArrayList<Grocery> GroceryArrayList = new ArrayList<Grocery>();

		int count = 0;
		System.out.println();

		while (true) {
			String command = scan.next();
			switch (command) {

			case "np":

				String name = scan.next();
				String type = scan.next();
				int cost = scan.nextInt();

				Product product = new Product(name, type, cost);
				ProductArrayList.add(product);
				System.out.println("Created " + product.toString());

				break;

			case "lp":
				for (int i = 0; i < ProductArrayList.size(); i++) {

					System.out.println(ProductArrayList.get(i).toString());
				}

				break;

			case "ns": {
				int product1 = scan.nextInt();
				int amount = scan.nextInt();
				int price = scan.nextInt();
				Grocery grocery = new Grocery(ProductArrayList.get(product1 - 1), price, amount);
				GroceryArrayList.add(grocery);

				break;
			}

			case "ls":
				for (int i = 0; i < GroceryArrayList.size(); i++) {

					System.out.println(GroceryArrayList.get(i).toString());
				}

				break;

			/*
			 * case "sp": int productNo = scan.nextInt(); int sellingAmount=scan.nextInt();
			 * int sellingPrice=scan.nextInt(); //Grocery grocery1 = new
			 * Grocery(ProductArrayList.get(productNo-1), sellingPrice, sellingAmount);
			 * for(int i = 0 ; i <GroceryArrayList.size() ; i++){
			 * 
			 * if(sellingAmount > GroceryArrayList.get(i).getStockAmount()) { System.out.
			 * println("There are not enough products. Amount of the product in the stock: "
			 * + GroceryArrayList.get(i).getStockAmount()); } else {
			 * System.out.println("Remaining Stock = " + GroceryArrayList.toString()); } if
			 * (sellingPrice > GroceryArrayList.get(i).getStockPrice()) {
			 * System.out.println("There is no such product selling at"+ sellingPrice
			 * +". Please try again with correct price. "); } }
			 * 
			 * 
			 * break;
			 */
			
			case "sp":
				int productNo = scan.nextInt();
				int sellingAmount = scan.nextInt();
				int sellingPrice = scan.nextInt();
				boolean a =  true;
				for (int i = 0; i < GroceryArrayList.size(); i++) {
					if (GroceryArrayList.get(i).getProduct().getProductNo()== productNo && (GroceryArrayList.get(i).getStockPrice() == sellingPrice)) {
						a=false;
						if (GroceryArrayList.get(i).getStockAmount() >= sellingAmount) {
							GroceryArrayList.get(i).setStockAmount(GroceryArrayList.get(i).getStockAmount() - sellingAmount);
							System.out.println("Remaining Stock = " + GroceryArrayList.get(i).toString());
							break;
						}
						
						else {
							System.out.println("There are not enough product.  Amount of the product in the stock:");
							break;
						}
						
							
						
					}

				    }

				if (true) {
				System.out.println("There is no such product selling at " + sellingPrice  + "$. Please try again with correct price");
				break;
					}
				
				
				if (a=true) {
						System.out.println("There is no such product selling at " + sellingPrice  + "$. Please try again with correct price");
					    }
				
				break;
				
				

		/*	case "sp":
				int productNo = scan.nextInt();
				int sellingAmount=scan.nextInt();
				int sellingPrice=scan.nextInt();
				
				for(int i = 0 ; i < GroceryArrayList.size() ; i++){
					if(GroceryArrayList.get(i).getProduct().getProductNo() == productNo){
						if(GroceryArrayList.get(i).getStockAmount() >= sellingAmount){
							if(GroceryArrayList.get(i).getPrice() == sellingPrice)
								GroceryArrayList.get(i).setStockAmount(GroceryArrayList.get(i).getStockAmount() - sellingAmount);
							else
								System.out.println("There is no such product selling at" + sellingPrice + "Please try again with correct price");
						}
						else
							System.out.println("There are not enough product.  Amount of the product in the stock:");
					}
				}
				break;
		*/	
				
		
		case "q":
				for (int i = 0; i < GroceryArrayList.size(); i++) {

					System.out.println(GroceryArrayList.get(i).toString());
				}
				System.exit(0);
			}

		}
	}}
