import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;



public class Checkout{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		ArrayList<String> item = new ArrayList<>(
			List.of("parfait", "rice")
		); 
		ArrayList<Integer> quantity = new ArrayList<>(
			List.of(2, 2)
		); 
		ArrayList<Double> price = new ArrayList<>(
			List.of(2100.00, 550.00)
		); 

		

		System.out.println("What is the customer's Name");
		String customerName = "christopher";

		boolean flag = true;

		while (flag){

			System.out.println("What did the user buy?");
			String productBought = input.next();
			item.add(productBought);

			System.out.println("How many pieces?");
			int unit = input.nextInt();
			quantity.add(unit);

			System.out.println("How much per unit?");
			double perUnitCost = input.nextDouble();
			price.add(perUnitCost);

			System.out.println("Add more Items?");
			String isAddItem = input.next();

			if (isAddItem.equalsIgnoreCase("yes") || isAddItem.equalsIgnoreCase("no")){
				if (isAddItem.equalsIgnoreCase("no")) flag = false;
			}else {
				boolean innerFlag = true;

				while (innerFlag){
					System.out.println("Invalid input!!!");

					System.out.println("Add more Items?");
					isAddItem = input.next();
					if (isAddItem.equalsIgnoreCase("yes") || isAddItem.equalsIgnoreCase("no")) innerFlag = false;
				}
				if (isAddItem.equalsIgnoreCase("no")) flag = false;

			}

		}

		System.out.println("What is your Name?");
		String cashierName = "Cashier's Name";

		System.out.println("How much discount will he get");
		double discountPercent = 8;





		System.out.printf(
			"%s %n%s %n%s %n%s %n%s %n%s%s %n%s%s %n%n",
			"SEMICOLON STORES",
			"MAIN BRANCH",
			"LOCATION: 312, HERBERT MACAULAY WAY, ABO YABA, LAGOS.",
			"TEL: 03293828343",
			"DATE: ",
			"CASHIER: ", cashierName,
			"Customer Name: ", customerName
		);

		System.out.println("=".repeat(60) + "\n");

		System.out.printf("%25s%10s%10s%15s%n%n", "ITEM", "QTY", "PRICE", "TOTAL(NGN)");

		System.out.println("-".repeat(60) + "\n");

		double subTotal = 0;

		for (int index = 0; index < item.size(); index++){

			subTotal += quantity.get(index) * price.get(index);

			System.out.printf("%27s%6d %12.2f %10.2f%n%n", item.get(index), quantity.get(index), price.get(index), quantity.get(index) * price.get(index));

		}

		System.out.println("-".repeat(60) + "\n");
		
		double discount = discountPercent / 100 * subTotal;

		//double vat = 


		System.out.printf("%40s%15.2f%n%40s%15.2f%n%40s%n%n", "Sub Total:", subTotal, "Discount:", discount, "VAT @ 17.50%:");

		System.out.println("=".repeat(60) + "\n");
/*
		System.out.printf("%40s%n%n", "Bill Total:");

		System.out.println("=".repeat(60) + "\n");

		System.out.printf("THIS IS NOT AN RECEIPT KINDLY PAY %.2f%n%n", 5803.50);

		System.out.println("=".repeat(60) + "\n\n\n");

		System.out.println("How much did the customer give to you?");

*/


	}
}