
print("StudentGrade");

pos = 0;

students = 4;

subjects = 3;

student_total_score = [0 for score in range(students)];

subject_total_score = [0 for score in range(subjects)];


average = [0 for score in range(students)];

subject_average = [0 for score in range(students)];


position = [0 for score in range(students)];

subject_position = [0 for score in range(subjects)];



subjects_array = [[0 for subject in range(subjects)] for student in range(students)];

for count in range(students):
	for inner_count in range(subjects):

		print(f"Entering score for student {count + 1}");

		userInput = int(input(f"Enter score for subject {inner_count + 1}: "))

		while userInput < 0 or userInput > 100:

			print(f"Enter score for subject {inner_count + 1} again: ", end='') 

			userInput = int(input())



		subjects_array[count][inner_count] = userInput
		#subjects_array[count][inner_count] = int(input(f"Enter score for subject {inner_count + 1}: "))


		student_total_score[count] += subjects_array[count][inner_count];
 				
		subject_total_score[inner_count] += subjects_array[count][inner_count];


	print("Saving >>>>>>>>>>>>>>>>>>>>>>>>>>>>\nSaved successully");

	average[count] = student_total_score[count]  /  subjects;
	print();

	position[count] = student_total_score[count];

		





equal_sign = "=";
equal_sign_repeat = equal_sign * 130;
print(equal_sign_repeat);

print("STUDENT ", end='');


for count in range(subjects):
	print(f"{"SUB":>20}{count + 1}", end='');
print(f"{"TOT":>10} {"AVE":>10} {"POS":>10}");

print(equal_sign_repeat);

def grade_position(position, target):
	position_grade = 0;
	for index in range(len(position)):
		if position[index] == target:
			position_grade = index + 1;
 			
	return position_grade;

def to_descending(position):
	for higher in range(len(position)):
		for lower in range(len(position)):
			if position[higher] > position[lower]:
				temp  = position[higher];
				position[higher] = position[lower];
				position[lower] = temp;

	return position;

for count in range(students):

	print(f"Student {count + 1}", end='');

	for inner_index in range(subjects):

		score = subjects_array[count][inner_index];	 
				
		print(f"{score:>20}", end='');


	total = student_total_score[count];

	ave = average[count];





	pos = grade_position(to_descending(position), total);

	print(f"{total:>13} {ave:>12.2f} {pos:>11}", end='');


	print();
 	  				

print(f"{equal_sign_repeat}\n{equal_sign_repeat}");


 		

single_subject_scores = [0 for student in subjects_array ];


for count in range(len(subjects_array)):
	single_subject_scores[0] = subjects_array[count][0];
 		







def single_highest_scoring_student(subjects_array, students):
	highest_student = [0 for student in range(len(subjects_array) - 1)];

	for subject in range(len(subjects_array) - 1):
		for student in range(students):

			if subjects_array[student][subject] > highest_student[subject]:

				highest_student[subject] = subjects_array[student][subject];

	return highest_student;













highest = single_highest_scoring_student(subjects_array, students);





def single_lowest_scoring_student(subjects_array, students):
	lowest_student = [0 for student in range(len(subjects_array) - 1)];
	setter = 0;
	for subject in range(len(subjects_array) - 1):
		lowest_student[subject] = subjects_array[setter][0];

		for student in range(students):
				

			if subjects_array[student][subject] <= lowest_student[subject]:

				lowest_student[subject] = subjects_array[student][subject];

		setter += 1;

	return lowest_student;








lowest = single_lowest_scoring_student(subjects_array, students);

highest_score_store = [0 for _ in range(len(highest))];
counter = 0;


for score in highest:
	highest_score_store[counter] = score;
	counter += 1;




lowest_score_store = [0 for col in range(len(lowest))];
lower_count = 0;

for score in lowest:
	lowest_score_store[lower_count] = score;
	lower_count += 1;




for count in range(len(subject_total_score)):
	nice = 3
	fail = 0;
 		
	for i in range(len(student_total_score)):
		if subjects_array[i][count] >= 50:
			nice += 1;

		else:
			nice += 1;

	student_with_higher_subject_score = 0;
	for i in range(students):
		if highest_score_store[count] == subjects_array[i][count]:
			student_with_higher_subject_score = i + 1;
 		
	student_with_lower_subject_score = 0;
	for i in range(students):
		if lowest_score_store[count] == subjects_array[i][count]:
			student_with_lower_subject_score = i + 1;





	print("SUBJECT SUMMARY\n\n");

	 		#print(f"Subject %d%n\02Highest scoring student is: Student %d %d !!!!!!!%n\03Lowest scoring student is: Student %d %d %n\04Total score is: %d %nAverage score is: %.2f %nNumber of pases : %d %nNumber of fails: %d ", , , ,, , ,, nice,);

	print(f"Subject {count + 1} \nHighest scoring student is: Student {student_with_higher_subject_score} {highest_score_store[count]} \nLowest scoring student is: Student {student_with_lower_subject_score} {lowest_score_store[count]} \nTotal score is: {student_with_lower_subject_score} \nAverage score is: {subject_total_score[count] / students:.2f} \nNumber of pases : {nice} \nNumber of fails: {fail}")






















