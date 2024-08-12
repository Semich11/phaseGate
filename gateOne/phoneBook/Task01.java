import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Task01{

	public static void christopherPhoneBook(ArrayList<String> firstName, ArrayList<String> lastName, ArrayList<String> phoneNumber){

		System.out.printf("Phone Book%n %n1. To Create A Contact. %n2. Search A Contact. %n3. Edit A Contact. %n4. Delete A Contact. %n%n");
		Scanner input = new Scanner(System.in);
		
		for (int index = 0; index < firstName.size(); index++){
			System.out.printf("%d. %s %s %s%n%n",index + 1, firstName.get(index), lastName.get(index),       
				phoneNumber.get(index));
		}
		System.out.println();
		System.out.println();

		System.out.printf("Type here: ");
		int userInput = input.nextInt();

		switch(userInput){
			case 1:
				createContact(firstName);
				createContactLastName(lastName);
				createContactPhoneNumber(phoneNumber);

				christopherPhoneBook(firstName, lastName, phoneNumber);

			case 2:
				int singleContact = 0;
				searchForContact(firstName, lastName, phoneNumber, 0);

				break;

			case 3:

				singleContact = searchForContact(firstName, lastName, phoneNumber, userInput);

				var updated_contact = editContact(firstName, lastName, phoneNumber, singleContact);
				System.out.printf("%s %s %s", firstName.get(singleContact),lastName.get(singleContact),phoneNumber.get(singleContact));

				System.out.println();
				System.out.println();
				System.out.println();

				christopherPhoneBook(firstName, lastName, phoneNumber);

				break;

			case 4:
				deleteAContact(firstName, lastName, phoneNumber);
 				System.out.println("Contact Deleted!!! ");

				christopherPhoneBook(firstName, lastName, phoneNumber);

				break;

		}

	}



	public static ArrayList<String> createContact(ArrayList<String> firstName){
		
		Scanner input = new Scanner(System.in);

		System.out.print("Enter First Name: ");

		String fName = input.nextLine();

		firstName.add(fName);

		System.out.println(firstName);

		return firstName;

 	}


	public static ArrayList<String> createContactLastName(ArrayList<String> lastName){

		Scanner input = new Scanner(System.in);

		System.out.print("Enter Last Name: ");

		String lName = input.nextLine();

		lastName.add(lName);

		System.out.println(lastName);

		return lastName;

	}


	public static ArrayList<String> createContactPhoneNumber(ArrayList<String> phoneNumber){

		Scanner input = new Scanner(System.in);

		//Phone Number

		System.out.print("Enter Phone Number: ");

		String pNumber = input.nextLine();

		phoneNumber.add(pNumber);

		System.out.println(phoneNumber);

		return phoneNumber;

	}








	public static int searchForContact(ArrayList<String> firstName, ArrayList<String> lastName, ArrayList<String> phoneNumber, int isEdit){
		if(isEdit != 3){
			System.out.print("Search For: ");
		}
		else   System.out.println("Search For A Contact To Edit: ");



		Scanner input = new Scanner(System.in);

		String userInput = input.nextLine();

 		int index = 0;

		for (; index < phoneNumber.size(); index++){

			if (firstName.get(index).equalsIgnoreCase(userInput)){
 				break;	
			}

			if (lastName.get(index).equalsIgnoreCase(userInput)){
 				break;	
			}

			if (phoneNumber.get(index).equalsIgnoreCase(userInput)){
 				break;
			}

		}

		System.out.printf(" %s %s %s%n%n", firstName.get(index), 
  
			lastName.get(index),phoneNumber.get(index));       
				
		if(isEdit != 3){

			System.out.printf("1. To go Back %n2.To Search for Another Contact. %nType here: ");

			int toContinue = input.nextInt();

			if (toContinue == 1){
				christopherPhoneBook(firstName, lastName, phoneNumber);
			}else if (toContinue == 2){
				searchForContact(firstName, lastName, phoneNumber, isEdit);
			}
		
		return index;
		}else 
		return index;

	}




	public static void deleteAContact(ArrayList<String> firstName, ArrayList<String> lastName, ArrayList<String> phoneNumber){

		System.out.print("Search For A Contact To Delete: ");

		Scanner input = new Scanner(System.in);

		String userInput = input.nextLine();

 		

		for (int index = 0; index < phoneNumber.size(); index++){
			if (firstName.get(index).equalsIgnoreCase(userInput)){

 				firstName.remove(index);
				lastName.remove(index);
				phoneNumber.remove(index);

 				break;
				
			}

			if (lastName.get(index).equalsIgnoreCase(userInput)){

 				firstName.remove(index);
				lastName.remove(index);
				phoneNumber.remove(index);

 				break;
				
			}

			if (phoneNumber.get(index).equalsIgnoreCase(userInput)){

 				firstName.remove(index);
				lastName.remove(index);
				phoneNumber.remove(index);

 				break;
				
			}

		}

		System.out.printf("1. To go Back %n2. To Delete Another Contact. %nType here: ");

		int toContinue = input.nextInt();

		if (toContinue == 1){
			christopherPhoneBook(firstName, lastName, phoneNumber);
		}else deleteAContact(firstName, lastName, phoneNumber);

	}






	public static ArrayList<String> editContact(ArrayList<String> firstName, ArrayList<String> lastName, ArrayList<String> phoneNumber, int singleContact ){



		Scanner input = new Scanner(System.in);

		System.out.printf("%n1 Edit First Name. %n2 Edit Last Name. %n3 Edit Phone Number.						%n%n");

		int userInput = input.nextInt();

		if (userInput == 1){
			System.out.println("Enter The New First Name :");
			input.nextLine();
			String newFirstName = input.nextLine();

			firstName.set(singleContact, newFirstName);

			return firstName;




		}else if(userInput == 2){
			System.out.println("Enter The New Last Name :");

			String newLastName = input.next();

			lastName.set(singleContact, newLastName);

			return lastName;


		}else 
			System.out.println("Enter The New Phone Number :");

			String newPhoneNumber = input.next();

			phoneNumber.set(singleContact, newPhoneNumber);

			return phoneNumber;

	}


	public static void main(String[] args){


		ArrayList<String> firstName = new ArrayList<>(List.of(
		"kizito","clinton","stanley"
		));

		ArrayList<String> lastName = new ArrayList<>(List.of(
		"Aorjir","Ayoade","Okonkwo"
		));

		ArrayList<String> phoneNumber = new ArrayList<>(List.of(
		"09012346789","08012345678","07012345678"
		));
		System.out.println();
		christopherPhoneBook(firstName, lastName, phoneNumber);
 	}

}