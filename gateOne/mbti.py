name = input("What is your name?: ").upper()
print(f"Welcome {name}, Kindly fill out the form below (using options A Or options B) to discover your personality:\n")

first_count_a = 0;
first_count_b = 0;

questions_ei = [
	"A. Expend energy, enjoy groups OR B. Conserve energy, enjoy one-on-one",
	"A. More outgoing OR B. Look for meaning and possibilities",
	"A. Seek many tasks, public activities, interaction with others OR B. Seek private, solitary activities with quiet to concentrate",
	"A. External, communicative, express yourself OR B. Internal, reticent, keep to yourself",
	"A. Active, initiate OR B. Reflective, deliberate",
]

question_number = 1

for question in questions_ei:
	print(f"Question {question_number}. {question}")
	option = input("Select A or B: ").upper()

	while option != 'A' and option != 'B':

		print("\nInvalid input!")
		print(f"Question {question_number}. {question}")
		option = input("Select A or B: ").upper()

	match(option):
		case 'A':
			first_count_a += 1
		case 'B':
			first_count_b += 1

	question_number += 1



print()


second_count_a = 0;
second_count_b = 0;

questions_sn = [
	"A. Interpret literally OR B. Look for meaning and possibilities", 
	"A. Practical, realistic, experiential OR B. Imaginative, innovative, theoretical",
	"A. Standard, usual, conventional OR B. Different, novel, unique", 
	"A. Focus on here-and-now OR B. Look to the future, global perspective, big picture", 
	"A. Facts, things, what is OR B. Ideas, dreams, what could be, philosophical"
]




question_number = 1

for question in questions_sn:
	print(f"Question {question_number}. {question}")
	option = input("Select A or B: ").upper()

	while option != 'A' and option != 'B':

		print("\nInvalid input!")
		print(f"Question {question_number}. {question}")
		option = input("Select A or B: ").upper()

	match(option):
		case 'A':
			second_count_a += 1
		case 'B':
			second_count_b += 1


	question_number += 1


print()



third_count_a = 0;
third_count_b = 0;

questions_tf = [
	"A. Logical, thinking, questioning OR B. Empathetic, feeling, accommodating", 
	"A. Candid, straightforward, frank OR B. Tactful, kind, encouraging",
	"A. Firm, tend to criticize, hold the line OR B. Gentle, tend to appreciate, conciliate", 
	"A. Tough-minded, just OR B. Tender-hearted, merciful", 
	"A. Matter-of-fact, issue-oriented OR B. Sensitive, people-oriented, compassionate"
]




question_number = 1

for question in questions_tf:
	print(f"Question {question_number}. {question}")
	option = input("Select A or B: ").upper()

	while option != 'A' and option != 'B':

		print("\nInvalid input!")
		print(f"Question {question_number}. {question}")
		option = input("Select A or B: ").upper()

	match(option):
		case 'A':
			third_count_a += 1
		case 'B':
			third_count_b += 1


	question_number += 1


print()





fourth_count_a = 0;
fourth_count_b = 0;

questions_jp = [
	"A. Organized, orderly OR B. Flexible, adaptable", 
	"A. Plan, schedule OR B. Unplanned, spontaneous",
	"A. Regulated, structured OR B. Easy-going, live and let live", 
	"A. Preparation, plan ahead OR B. Go with the flow, adapt as you go", 
	"A. Control, govern OR B. Latitude, freedom"
]




question_number = 1

for question in questions_jp:
	print(f"Question {question_number}. {question}")
	option = input("Select A or B: ").upper()

	while option != 'A' and option != 'B':

		print("\nInvalid input!")
		print(f"Question {question_number}. {question}")
		option = input("Select A or B: ").upper()

	match(option):
		case 'A':
			fourth_count_a += 1
		case 'B':
			fourth_count_b += 1

	question_number += 1


print()











if first_count_a > first_count_b and second_count_a > second_count_b and third_count_b > third_count_a and fourth_count_b > fourth_count_a:
    print("ESFP")
elif first_count_a > first_count_b and second_count_a > second_count_b and third_count_a > third_count_b and fourth_count_a > fourth_count_b:
    print("ESTJ")
elif first_count_a > first_count_b and second_count_b > second_count_a and third_count_a > third_count_b and fourth_count_a > fourth_count_b:
    print("ENTJ")
elif first_count_a > first_count_b and second_count_a > second_count_b and third_count_b > third_count_a and fourth_count_a > fourth_count_b:
    print("ESFJ")
elif first_count_a > first_count_b and second_count_a > second_count_b and third_count_a > third_count_b and fourth_count_b > fourth_count_a:
    print("ESTP")
elif first_count_a > first_count_b and second_count_b > second_count_a and third_count_a > third_count_b and fourth_count_b > fourth_count_a:
    print("ENTP")
elif first_count_a > first_count_b and second_count_b > second_count_a and third_count_b > third_count_a and fourth_count_b > fourth_count_a:
    print("ENFP")
elif first_count_a > first_count_b and second_count_b > second_count_a and third_count_b > third_count_a and fourth_count_a > fourth_count_b:
    print("ENFJ")
elif first_count_b > first_count_a and second_count_a > second_count_b and third_count_a > third_count_b and fourth_count_a > fourth_count_b:
    print("ISTJ")
elif first_count_b > first_count_a and second_count_a > second_count_b and third_count_b > third_count_a and fourth_count_a > fourth_count_b:
    print("ISFJ")
elif first_count_b > first_count_a and second_count_a > second_count_b and third_count_a > third_count_b and fourth_count_b > fourth_count_a:
    print("ISTP")
elif first_count_b > first_count_a and second_count_a > second_count_b and third_count_b > third_count_a and fourth_count_b > fourth_count_a:
    print("ISFP")
elif first_count_b > first_count_a and second_count_b > second_count_a and third_count_a > third_count_b and fourth_count_a > fourth_count_b:
    print("INTJ")
elif first_count_b > first_count_a and second_count_b > second_count_a and third_count_b > third_count_a and fourth_count_a > fourth_count_b:
    print("INFJ")
elif first_count_b > first_count_a and second_count_b > second_count_a and third_count_a > third_count_b and fourth_count_b > fourth_count_a:
    print("INTP")
elif first_count_b > first_count_a and second_count_b > second_count_a and third_count_b > third_count_a and fourth_count_b > fourth_count_a:
    print("ESTJ")
else:
    print("Invalid")
