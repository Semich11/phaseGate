import java.util.Scanner;

public class MBTI{
   public static void main(String []args){

	Scanner input = new Scanner (System.in);

	System.out.print("What is your name?: ");
	String name = input.next().toUpperCase();

	System.out.print("Welcome " + name + ", Kindly fill out the form below (using options A Or options B) to discover your personality: ");

	System.out.println();

	int firstCountA = 0;
	int firstCountB = 0;

	String[] questionEI = {
		"A. Expend energy, enjoy groups OR B. Conserve energy, enjoy one-on-one", 
		"A. More outgoing OR B. Look for meaning and possibilities",
		"A. Seek many tasks,public activites,interaction with others OR B. Seek private, solitary activities with quiet to concentrate", 
		"A. External,communicative, express yourself OR B. Internal, reticent,keep to yourself", 
		"A. Active,initiate OR B. Reflective,delibrate", 
				};

	for(int questionNumber = 0; questionNumber < 5; questionNumber++){
		System.out.println("Question" + questionNumber + ":" + " " + questionEI[questionNumber]);
		System.out.println("Select A or B");
		char option = input.next().toUpperCase().charAt(0);
		
		switch (option){
			case 'A':
				firstCountA++; break;
			case 'B':
				firstCountB++; break;
			default:
				System.out.println("Invalid");
		}
			System.out.println();
	}

		System.out.println();

		int secondCountA = 0;
		int secondCountB = 0;
	
	String[] questionSN = {
		"A. Interpret literally OR B. Look for meaning and possibilities", 
		"A. Practical,realistic,experiential OR B. Imaginative,innovative,theoretical",
		"A. Standard,usual,conventional OR B. Different,novel,unique", 
		"A. Focus on here-and-now OR B. Look to the future,global perspective,big picture", 
		"A. Facts,things,what is OR B. Ideas, dreams,what could be,philosophical", 
				};

	for(int questionNumber = 0; questionNumber < 5; questionNumber++){
		System.out.println("Question" + questionNumber + ":" + " " + (questionSN[questionNumber]));
		System.out.println("Select A or B");
		char option = input.next().toUpperCase().charAt(0);
		
		switch (option){
			case 'A':
				secondCountA++; break;
			case 'B':
				secondCountB++; break;
			default:
				System.out.println("Invalid");
		}
			System.out.println();
	}


	System.out.println();

		int thirdCountA = 0;
		int thirdCountB = 0;
	
	String[] questionTF = {
		"A. Logical,thinking,questioning OR B. Empathetic,feeling,accomodating", 
		"A. Candid,straight,forward,frank OR B. Tactful,kind,encouraging",
		"A. Firm,tend to criticize,hold the line OR B. Gentle,tend to appreciate,conciliate", 
		"A. Tough-minded,just OR B. Tender-hearted,merciful", 
		"A. Matter-of-fact,issue-oriented OR B. Sensitive,People-oriented,compassionate", 
				};

	for(int questionNumber = 0; questionNumber < 5; questionNumber++){
		System.out.println("Question" + questionNumber + ":" + " " + (questionTF[questionNumber]));
		System.out.println("Select A or B");
		char option = input.next().toUpperCase().charAt(0);
		
		switch (option){
			case 'A':
				thirdCountA++; break;
			case 'B':
				thirdCountB++; break;
			default:
				System.out.println("Invalid");
		}
			System.out.println();
	}

	
	System.out.println();

		int fourthCountA = 0;
		int fourthCountB = 0;
	
	String[] questionJP = {
		"A. Organised,orderly OR B. Flexible,adaptable", 
		"A. Plan,schedule OR B. Unplanned,spontaneous",
		"A. Regulated,structured OR B. Easy-going,live and let live", 
		"A. Preparation,plan ahead OR B. Go with the flow, adapt as you go", 
		"A. Control,govern OR B. Latitude,freedom", 
				};

	for(int questionNumber = 0; questionNumber < 5; questionNumber++){
		System.out.println("Question" + questionNumber + ":" + " " + (questionJP[questionNumber]));
		System.out.println("Select A or B");
		char option = input.next().toUpperCase().charAt(0);
		
		switch (option){
			case 'A':
				fourthCountA++; break;
			case 'B':
				fourthCountB++; break;
			default:
				System.out.println("Invalid");
		}
			System.out.println();
	}
		

	if (firstCountA > firstCountB && secondCountA > secondCountB && thirdCountB > thirdCountA && fourthCountB > fourthCountA){
		System.out.println("ESFP");
	} else if (firstCountA > firstCountB && secondCountA > secondCountB && thirdCountA > thirdCountB && fourthCountA > fourthCountB){
		System.out.println("ESTJ");
	} else if (firstCountA > firstCountB && secondCountB > secondCountA && thirdCountA > thirdCountB && fourthCountA > fourthCountB){
		System.out.println("ENTJ");
   	} else if (firstCountA > firstCountB && secondCountA > secondCountB && thirdCountB > thirdCountA && fourthCountA > fourthCountB){
		System.out.println("ESFJ");
	} else if (firstCountA > firstCountB && secondCountA > secondCountB && thirdCountA > thirdCountB && fourthCountB > fourthCountA){
		System.out.println("ESTP");
	} else if (firstCountA > firstCountB && secondCountB > secondCountA && thirdCountA > thirdCountB && fourthCountB > fourthCountA){
		System.out.println("ENTP");
	} else if (firstCountA > firstCountB && secondCountB > secondCountA && thirdCountB > thirdCountA && fourthCountB > fourthCountA){
		System.out.println("ENFP");
	} else if (firstCountA > firstCountB && secondCountB > secondCountA && thirdCountB > thirdCountA && fourthCountA > fourthCountB){
		System.out.println("ENFJ");
	} else if (firstCountB > firstCountA && secondCountA > secondCountB && thirdCountA > thirdCountB && fourthCountA > fourthCountB){
		System.out.println("ISTJ");
	} else if (firstCountB > firstCountA && secondCountA > secondCountB && thirdCountB > thirdCountA && fourthCountA > fourthCountB){
		System.out.println("ISFJ");
	} else if (firstCountB > firstCountA && secondCountA > secondCountB && thirdCountA > thirdCountB && fourthCountB > fourthCountA){
		System.out.println("ISTP");
	} else if (firstCountB > firstCountA && secondCountA > secondCountB && thirdCountB > thirdCountA && fourthCountB > fourthCountA){
		System.out.println("ISFP");
	} else if (firstCountB > firstCountA && secondCountB > secondCountA && thirdCountA > thirdCountB && fourthCountA > fourthCountB){
		System.out.println("INTJ");
	} else if (firstCountB > firstCountA && secondCountB > secondCountA && thirdCountB > thirdCountA && fourthCountA > fourthCountB){
		System.out.println("INFJ");
	} else if (firstCountB > firstCountA && secondCountB > secondCountA && thirdCountA > thirdCountB && fourthCountB > fourthCountA){
		System.out.println("INTP");
	} else if (firstCountB > firstCountA && secondCountB > secondCountA && thirdCountB > thirdCountA && fourthCountB > fourthCountA){
		System.out.println("ESTJ");
	} else {
		System.out.println("Invalid");
	}

   }
}