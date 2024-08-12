
def christopher_phone_book(first_name, last_name, phone_number, phone_book):

	print("\n\nPhone Book \n\n1. To Create A Contact. \n\n2. Search A Contact. \n\n3. Edit A Contact. \n\n4. Delete A Contact. \n\n");


	for row in range(len(phone_number)):
		print(row + 1, first_name[row], last_name[row], phone_number[row],"\n\n")


	user_input = int(input("Type here: "))
	print()


	match user_input:
		case 1:
			create_contact(first_name)
			create_contact_last_name(last_name)
			create_contact_phone_number(phone_number)
	
			christopher_phone_book(first_name, last_name, phone_number, phone_book)

		case 2:
			search_for_contact(first_name, last_name, phone_number, 0)

		case 3:

			single_contact = search_for_contact(first_name, last_name, phone_number, user_input)

			updated_contact = editContact(first_name, last_name, phone_number, single_contact);

			print(f" {first_name[single_contact]} {last_name[single_contact]} {phone_number[single_contact]}");

			print()
			print()
			print()

			christopher_phone_book(first_name, last_name, phone_number, phone_book)


		case 4:
			delete_a_contact(first_name, last_name, phone_number);
			print("Contact Deleted!!! ");

			christopher_phone_book(first_name, last_name, phone_number);







def create_contact(first_name):
		
	f_name = input("Enter First Name: ");

	first_name.append(f_name);

	print();

	return first_name;



def create_contact_last_name(last_name):

	l_name = input("Enter Last Name: ");

	last_name.append(l_name);

	print();

	return last_name;


def create_contact_phone_number(phone_number):

	p_number = input("Enter Phone Number: ");

	phone_number.append(p_number);

	print();

	return phone_number;


def search_for_contact(first_name, last_name, phone_number, is_edit):

		if is_edit != 3:
			user_input = input("Search For: ");
	
		else: user_input = input("Search For A Contact To Edit: ");


		index = 0;

		for col in range(len(first_name)):
			index = col
			if first_name[col].lower() == user_input.lower():
				break;

			if last_name[col].lower() == user_input.lower():
				break;

			if phone_number[col].lower() == user_input.lower():
				break;


		print(first_name[index], last_name[index], phone_number[index])
  				
		if is_edit != 3:

			to_continue = int(input("1. To go Back \n2.To Search for Another Contact. \nType here: "));

			if to_continue == 1:
				christopher_phone_book(first_name, last_name, phone_number, phone_book);
			elif to_continue == 2:
				search_for_contact(first_name, last_name, phone_number, is_edit);
			
		
			return index;
		else:	 
			return index;







def editContact(first_name, last_name, phone_number, single_contact):



		user_input = int(input("\n1 Edit First Name. \n2 Edit Last Name. \n3 Edit Phone Number. \n\n"));


		if user_input == 1:
			new_first_name = input("Enter The New First Name : ");

			first_name[single_contact] = new_first_name


			return first_name;




		elif user_input == 2:
			new_last_name = input("Enter The New Last Name : ");

			last_name[single_contact] = new_last_name

			return last_name;


		else:
			new_phone_number = input("Enter The New Phone Number : ");

			phone_number[single_contact] = new_phone_number

			return phone_number;







def delete_a_contact(first_name, last_name, phone_number):

		user_input = input("Search For A Contact To Delete: \n");

 		

		#for (int index = 0; index < phoneNumber.size(); index++){
		index = 0;

		for col in range(len(first_name)):
			index = col
			if first_name[col].lower() == user_input.lower():
				first_name.pop(col)
				last_name.pop(col)
				phone_number.pop(col)
				break;

			if last_name[col].lower() == user_input.lower():
				
				first_name.pop(col)
				last_name.pop(col)
				phone_number.pop(col)

				break;

			if phone_number[col].lower() == user_input.lower():

				first_name.pop(col)
				last_name.pop(col)
				phone_number.pop(col)

				break;


		to_continue = int(input("1. To go Back \n2. To Delete Another Contact. \nType here: "));


		if to_continue == 1:
			christopher_phone_book(first_name, last_name, phone_number, phone_book);
		else: delete_a_contact(first_name, last_name, phone_number);













first_name = ["kizito","clinton","stanley"]
last_name = ["Aorjir","Ayoade","Okonkwo"]
phone_number = ["09012346789","08012345678","07012345678"]

phone_book = [first_name, last_name, phone_number]

christopher_phone_book(first_name, last_name, phone_number, phone_book)




