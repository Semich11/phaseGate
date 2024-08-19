import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;



public class PizzaWahala{

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		ArrayList<String> pizzaType = new ArrayList<>(
			List.of("sapa size", "Small Money", "Big boys", "Odogwu")
		);
		ArrayList<Integer> numberOfSlice = new ArrayList<>(
			List.of(4, 6, 8, 12)
		);
		ArrayList<Integer> pricePerBox = new ArrayList<>(
			List.of(2000, 2400, 3000, 4200)
		);

		System.out.printf("Number of people: ");

		int numberOfPeople = input.nextInt();

		System.out.printf("Pizza type: ");

		String pizzaTypeOrder = input.next();

		int boxes = 0;
		int totalSlice = 0;
		int remainingSlices = 0;
		int price = 0;

 		for (int element = 0; element < pizzaType.size(); element++){

			if (pizzaType.get(element).equalsIgnoreCase(pizzaTypeOrder)){

				int pizzaQuotient = numberOfPeople / numberOfSlice.get(element);

				if (pizzaQuotient * numberOfSlice.get(element) < numberOfPeople){

					totalSlice = pizzaQuotient * numberOfSlice.get(element) + numberOfSlice.get(element);

					boxes = totalSlice / numberOfSlice.get(element);

					remainingSlices = totalSlice - numberOfPeople;

					price = pricePerBox.get(element) * boxes;

				}
			}
		}

		System.out.printf("Number of boxes of pizza to buy = %d boxes.%n", boxes);
		System.out.printf("Number left over slices after serving = %d slices%n", remainingSlices);
		System.out.printf("Price = %d%n", price);




	}

}