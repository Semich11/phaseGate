import java.time.LocalDate;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;

public class MenstrualApp{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		LocalDate today = LocalDate.now();

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");



	
	
		System.out.print("Enter the start date of your previous or current Menstrual period \"use the format (dd-MM-yyyy)\": ");
		String previousStartDate = input.next();

		LocalDate lastStartDate = LocalDate.parse(previousStartDate, formatter);

		System.out.print("On the average, how long is your typical Menstrual Cycle: ");
		int menstrualCycle = input.nextInt();





		System.out.print("how many days did your period use to last: ");
		int menstrualDuration = input.nextInt();


		LocalDate lastEnddate = lastStartDate.plusDays(menstrualDuration - 1);
		System.out.println("The End date of your previous period was " + lastEnddate.format(formatter));

		System.out.println();
		LocalDate nextStartdate = lastStartDate.plusDays(menstrualCycle);

		LocalDate nextEndDate = nextStartdate.plusDays(menstrualDuration - 1);
		System.out.println("The estimated date of your next period is " + nextStartdate.format(formatter) + " to " + nextEndDate.format(formatter));

		System.out.println();
		LocalDate ovulationStartDate = lastStartDate.plusDays(menstrualCycle / 2 -1);

		LocalDate ovulationEnddate = ovulationStartDate.plusDays(1);
		System.out.println("Your estimated Ovulation Date is " + ovulationStartDate.format(formatter) + " to " + ovulationEnddate.format(formatter));

		System.out.println();

		LocalDate firstSafePeriodStart = lastEnddate.plusDays(1);

		LocalDate firstSafePeriodEnd = firstSafePeriodStart.plusDays(3);

		LocalDate secondSafePeriodStart = ovulationEnddate.plusDays(5);

		LocalDate secondSafePeriodEnd = secondSafePeriodStart.plusDays(4);




		System.out.println("Your estimated Safe Period is " + firstSafePeriodStart.format(formatter) + " to " + firstSafePeriodEnd.format(formatter) + " and " + secondSafePeriodStart.format(formatter) + " to " + secondSafePeriodEnd.format(formatter));

		System.out.println();

	}

}


