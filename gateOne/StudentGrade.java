import java.util.Arrays;
import java.util.Scanner;



public class StudentGrade{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);




		System.out.println("StudentGrade");

 		int pos = 0;

		int students = 4;

		int subjects = 3;

		int[] studentTotalScore = new int[students];
		int[] subjectTotalScore = new int[subjects];


		float[] average = new float[students];
		float[] subjectAverage = new float[students];


		int[] position = new int[students];
		int[] subjectPosition = new int[subjects];



		int[][] subjectsArray = new int[students][subjects];







 		for (int count = 0; count < students; count++){
			for (int innerCount = 0; innerCount < subjects; innerCount++){

				System.out.printf("Entering score for student %d%n", count + 1);

				System.out.printf("Enter score for subject %d%n", innerCount + 1);

				int userInput = input.nextInt();


				while (userInput < 0 || userInput > 100){

					System.out.printf("Enter score for subject %d again %n", innerCount + 1);

					userInput = input.nextInt();

				}

				subjectsArray[count][innerCount] = userInput;

				studentTotalScore[count] += subjectsArray[count][innerCount];
 				
 			 	subjectTotalScore[innerCount] += subjectsArray[count][innerCount];

 			}


 		 	System.out.println(Arrays.toString(subjectTotalScore));


			System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>>>>>>\nSaved successully");

			average[count] = studentTotalScore[count]  / (float) subjects;
			System.out.println();

 		 	position[count] = studentTotalScore[count];

 		}

 		

 		System.out.println(Arrays.toString(average));



		String equalSign = "=";
		String equalSignRepeat = equalSign.repeat(130);
		System.out.printf("%s%n", equalSignRepeat);

		System.out.printf("STUDENT ");


		for (int count = 1; count <= subjects; count++){
			System.out.printf("%20s%d ", "SUB", count);
		}
		System.out.printf(" %10s %10s %10s%n", "TOT", "AVE", "POS");
		
		System.out.printf("%s%n", equalSignRepeat);

		for (int count = 0; count < students; count++){ 
			System.out.printf("Student %d", count + 1);

 			for (int innerIndex = 0; innerIndex < subjects; innerIndex++){
 				int score = subjectsArray[count][innerIndex];	 				
				System.out.printf("%20d", score);
 			}
 			int total = studentTotalScore[count];

 			float ave = average[count];

 			pos = gradePosition(toDescending(position), total);

			System.out.printf("%13d %12.2f %11d",total, ave, pos);


			System.out.println();
 	  				
		}
		System.out.printf("%s%n%s%n", equalSignRepeat, equalSignRepeat);




 		

 		int[] singleSubjectScores = new int[subjectsArray.length];

 	 	for (int count = 0; count < subjectsArray.length; count++){
			singleSubjectScores[count] = subjectsArray[count][0];
 		}




 		int[] highest = singleHighestScoringStudent(subjectsArray, students);

 		int[] lowest = singleLowestScoringStudent(subjectsArray, students);

 		int[] highestScoreStore = new int[highest.length];
 		int counter = 0;


		for (int score : highest){
			 highestScoreStore[counter] = score;
 			 counter += 1;

		}



 		int[] lowestScoreStore = new int[lowest.length];
 		int lowerCount = 0;
		for (int score : lowest){
			 lowestScoreStore[lowerCount] = score;
 			 lowerCount += 1;
		}




 		for (int count = 0; count < subjectTotalScore.length; count++){
         		int pass = 0;
         		int fail = 0;
 		
 			for (int i = 0; i < studentTotalScore.length; i++){
					if (subjectsArray[i][count] >= 50){
						pass += 1;
					}
					else{
						fail += 1;
					}
 			}
			int studentWithHigherSubjectScore = 0;
 			for (int i = 0; i < students; i++){
				if (highestScoreStore[count] == subjectsArray[i][count]){
		 			studentWithHigherSubjectScore = i + 1;
 				}
 			}

 			int studentWithLowerSubjectScore = 0;
 			for (int i = 0; i < students; i++){
				if (lowestScoreStore[count] == subjectsArray[i][count]){
		 			studentWithLowerSubjectScore = i + 1;
 				}
 			}

 			System.out.println("SUBJECT SUMMARY\n\n");

	 		System.out.printf("Subject %d%n\02Highest scoring student is: Student %d %d %n\03Lowest scoring student is: Student %d %d %n\04Total score is: %d %nAverage score is: %.2f %nNumber of pases : %d %nNumber of fails: %d ", count + 1, studentWithHigherSubjectScore, highestScoreStore[count], studentWithLowerSubjectScore, lowestScoreStore[count], subjectTotalScore[count],subjectTotalScore[count] / (float) students, pass, fail);

 			}




		}





	public static int gradePosition(int[] position, int target){
	 	int positionGrade = 0;
 		for (int index = 0; index < position.length; index++){
			if (position[index] == target){
				positionGrade = index + 1;
 			}
 			
 		}
 		return positionGrade;
	}




	public static int[] singleHighestScoringStudent(int[][] subjectsArray, int students){
	 	int[] highestStudent = new int[subjectsArray.length - 1];

 		for (int i = 0; i < subjectsArray.length - 1; i++){
			for (int j = 0; j < students; j++){

				if (subjectsArray[j][i] > highestStudent[i]){
					highestStudent[i] = subjectsArray[j][i];
  				}

			}

 		}
 		return highestStudent;
 	}

	public static int[] singleLowestScoringStudent(int[][] subjectsArray, int students){
	 	int[] lowestStudent = new int[subjectsArray.length - 1];
		int setter = 0;
 		for (int i = 0; i < subjectsArray.length - 1; i++){
				lowestStudent[i] = subjectsArray[setter][0];

			for (int j = 0; j < students; j++){
				
				if (subjectsArray[j][i] <= lowestStudent[i]){
					lowestStudent[i] = subjectsArray[j][i];
  				}

			}
		setter += 1;

 		}
 		return lowestStudent;
 	}






	public static int[] toDescending(int[] position){
 		for (int higher = 0; higher < position.length; higher++){
			for (int lower = 0; lower < position.length; lower++){
				if (position[higher] > position[lower]){
					int temp  = position[higher];
 					position[higher] = position[lower];
 					position[lower] = temp;
				} 
			}
 		}
 		return position;
 	}











}