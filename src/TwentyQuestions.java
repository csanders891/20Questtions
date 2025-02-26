package twenty_questions;
import java.util.Scanner;

public class TwentyQuestions {
	
	static int score = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Let's play 20 Questions");
		System.out.println("Press any key to begin");
		Scanner input = new Scanner(System.in);
		String begin = input.next();
		char start = begin.charAt(0);
		
		
		System.out.println("Question 1:");
		System.out.println("How many bones are in the human body?");
		System.out.println("A. 136");
		System.out.println("B. 194");
		System.out.println("C. 206");
		System.out.println("D. 241");
		
		String answer = input_validation();
		char choice = inputValidation(answer);
		
		String correctAnswer = "206";
		
		switch(choice)
		{
			case 'A':
			case 'a':
			
			case 'B':
			case 'b':
				wrongAnswer(correctAnswer);
				break;
				
			case 'C':
			case 'c':
				rightAnswer();
				break;	
				
			default:
				wrongAnswer(correctAnswer);
				break;
		}
		
		System.out.println("Question 2:");
		System.out.println("What tech company manufactures the iPhone?");
		System.out.println("A. IBM");
		System.out.println("B. Google");
		System.out.println("C. Apple");
		System.out.println("D. Microsoft");
		
		answer = input_validation();
		choice = inputValidation(answer);
		
		correctAnswer = "Apple";

		switch(choice)
		{
			case 'A':
			case 'a':
			
			case 'B':
			case 'b':
				wrongAnswer(correctAnswer);
				break;
				
			case 'C':
			case 'c':
				rightAnswer();
				break;
				
			default:
				wrongAnswer(correctAnswer);
				break;
		}
		
		System.out.println("Question 3:");
		System.out.println("What animal is a member of the ursine family?");
		System.out.println("A. bear");
		System.out.println("B. dog");
		System.out.println("C. horse");
		System.out.println("D. elephant");
		
		answer = input_validation();
		choice = inputValidation(answer);
		
		correctAnswer = "bear";
		
		switch(choice)
		{
			case 'A':
			case 'a':
				rightAnswer();
				break;
			
			case 'B':
			case 'b':
			
			case 'C':
			case 'c':
			
			default:
				wrongAnswer(correctAnswer);
				break;
		}
		
		System.out.println("Question 4:");
		System.out.println("What is the last book of the Old Testament?");
		System.out.println("A. Psalms");
		System.out.println("B. Malachi");
		System.out.println("C. Nehemiah");
		System.out.println("D. Deuteronomy");
		
		answer = input_validation();
		choice = inputValidation(answer);
		
		correctAnswer = "Malachi";
		
		switch(choice)
		{
			case 'A':
			case 'a':
				wrongAnswer(correctAnswer);
				break;
			
			case 'B':
			case 'b':
				rightAnswer();
				break;
				
			case 'C':
			case 'c':
				
			default:
				wrongAnswer(correctAnswer);
				break;	
		}

		System.out.println("Question 5:");
		System.out.println("What NFL team plays their home games at Lambeau Field?");
		System.out.println("A. Green Bay Packers");
		System.out.println("B. New Orleans Saints");
		System.out.println("C. New York Jets");
		System.out.println("D. Las Vegas Raiders");
		
		answer = input_validation();
		choice = inputValidation(answer);
		
		correctAnswer = "Green Bay Packers";
		
		switch(choice)
		{
			case 'A':
			case 'a':
				rightAnswer();
				break;
			
			case 'B':
			case 'b':
				
			case 'C':
			case 'c':
				
			default:
				wrongAnswer(correctAnswer);
				break;	
		}
		
		System.out.println("Question 6:");
		System.out.println("At how many degrees Fahrenheit does water freeze?");
		System.out.println("A. 20");
		System.out.println("B. 23");
		System.out.println("C. 28");
		System.out.println("D. 32");
		
		answer = input_validation();
		choice = inputValidation(answer);
		
		correctAnswer = "32";
		
		switch(choice)
		{
			case 'A':
			case 'a':
			
			case 'B':
			case 'b':
				
			case 'C':
			case 'c':
				wrongAnswer(correctAnswer);
				break;
					
			default:
				rightAnswer();
				break;
		}
		
		System.out.println("Question 7:");
		System.out.println("Augusta is the capital of what US state?");
		System.out.println("A: Arizona");
		System.out.println("B. Maine");
		System.out.println("C. Ohio");
		System.out.println("D. Kentucky");
		
		answer = input_validation();
		choice = inputValidation(answer);
		
		correctAnswer = "Maine";
		
		switch(choice)
		{
			case 'A':
			case 'a':
				wrongAnswer(correctAnswer);
				break;
			
			case 'B':
			case 'b':
				rightAnswer();
				break;
				
			case 'C':
			case 'c':
				
			default:
				wrongAnswer(correctAnswer);
				break;
		}
		
		System.out.println("Question 8:");
		System.out.println("What is the superhero alter ego of Tony Stark?");
		System.out.println("A. Superman");
		System.out.println("B. Wolverine");
		System.out.println("C. The Flash");
		System.out.println("D. Iron Man");
		
		answer = input_validation();
		choice = inputValidation(answer);
		
		correctAnswer = "Iron Man";
		
		switch(choice)
		{
			case 'A':
			case 'a':
			
			case 'B':
			case 'b':
				
			case 'C':
			case 'c':
				wrongAnswer(correctAnswer);
				break;
				
			default:
				rightAnswer();
				break;
		}
		
		System.out.println("Question 9:");
		System.out.println("Who is the leader of \"The Three Stooges\"?");
		System.out.println("A. Larry");
		System.out.println("B. Curly");
		System.out.println("C. Moe");
		System.out.println("D. Shemp");
		
		answer = input_validation();
		choice = inputValidation(answer);
		
		correctAnswer = "Moe";
		
		switch(choice)
		{
			case 'A':
			case 'a':
			
			case 'B':
			case 'b':
				wrongAnswer(correctAnswer);
				break;
				
			case 'C':
			case 'c':
				rightAnswer();
				break;
				
			default:
				wrongAnswer(correctAnswer);
				break;
		}
	
		System.out.println("Question 10:");
		System.out.println("How do you say goodbye in Spanish?");
		System.out.println("A. hola");
		System.out.println("B. adios");
		System.out.println("C. si");
		System.out.println("D. cuatro");
		
		answer = input_validation();
		choice = inputValidation(answer);
		
		correctAnswer = "adios";
		
		switch(choice)
		{
			case 'A':
			case 'a':
				wrongAnswer(correctAnswer);
				break;
			
			case 'B':
			case 'b':
				rightAnswer();
				break;
				
			case 'C':
			case 'c':
				
			default:
				wrongAnswer(correctAnswer);
				break;
		}
	
		System.out.println("Question 11:");
		System.out.println("Which US president signed the \"American Disabilities Act\" into law?");
		System.out.println("A. George H.W. Bush");
		System.out.println("B. John F. Kennedy");
		System.out.println("C. Ronald Reagan");
		System.out.println("D. Barack Obama");
		
		answer = input_validation();
		choice = inputValidation(answer);
		
		correctAnswer = "George H.W. Bush";
		
		switch(choice)
		{
			case 'A':
			case 'a':
				rightAnswer();
				break;
			
			case 'B':
			case 'b':
			
			case 'C':
			case 'c':
			
			default:
				wrongAnswer(correctAnswer);
		}
		
		System.out.println("Question 12:");
		System.out.println("What color is Grover from \"Sesame Street\"?");
		System.out.println("A. green");
		System.out.println("B. red");
		System.out.println("C. blue");
		System.out.println("D. yellow");
		
		answer = input_validation();
		choice = inputValidation(answer);
		
		correctAnswer = "blue";
		switch(choice)
		{
			case 'A':
			case 'a':
			
			case 'B':
			case 'b':
				wrongAnswer(correctAnswer);
				break;
				
			case 'C':
			case 'c':
				rightAnswer();
				break;		
				
			default:
				wrongAnswer(correctAnswer);
				break;
		}
		
		System.out.println("Question 13:");
		System.out.println("In \"Little Women\", which one of the March sisters died?");
		System.out.println("A. Meg");
		System.out.println("B. Amy");
		System.out.println("C. Beth");
		System.out.println("D. Jo");
		
		answer = input_validation();
		choice = inputValidation(answer);
		
		correctAnswer = "Beth";
		
		switch(choice)
		{
			case 'A':
			case 'a':
			
			case 'B':
			case 'b':
				wrongAnswer(correctAnswer);
				break;
				
			case 'C':
			case 'c':
				rightAnswer();
				break;
					
			default:
				wrongAnswer(correctAnswer);
				break;
		}
		
		System.out.println("Question 14:");
		System.out.println("Which actress portrayed Carrie Bradshaw on \"Sex and the City\"?");
		System.out.println("A. Kim Cattrall");
		System.out.println("B. Sarah Jessica Parker");
		System.out.println("C. Cynthia Nixon");
		System.out.println("D. Kristin Davis");
		
		answer = input_validation();
		choice = inputValidation(answer);
		
		correctAnswer = "Sarah Jessica Parker";
		
		switch(choice)
		{
			case 'A':
			case 'a':
				wrongAnswer(correctAnswer);
				break;
			
			case 'B':
			case 'b':
				rightAnswer();
				break;
				
			case 'C':
			case 'c':
				
			default:
				wrongAnswer(correctAnswer);
				break;	
		}
		
		System.out.println("Question 15:");
		System.out.println("Which shoe brand uses the slogan \"Just Do It\"?");
		System.out.println("A. Nike");
		System.out.println("B. Adidas");
		System.out.println("C. Reebok");
		System.out.println("D. Puma");
		
		answer = input_validation();
		choice = inputValidation(answer);;
		
		correctAnswer = "Nike";
		
		switch(choice)
		{
			case 'A':
			case 'a':
				rightAnswer();
				break;
			
			case 'B':
			case 'b':
				
			case 'C':
			case 'c':
				
			default:
				wrongAnswer(correctAnswer);
				break;	
		}
		
		System.out.println("Question 16:");
		System.out.println("Which US coin is worth 10 cents?");
		System.out.println("A. quarter");
		System.out.println("B. nickel");
		System.out.println("C. penny");
		System.out.println("D. dime");
		
		answer = input_validation();
		choice = inputValidation(answer);
		
		correctAnswer = "dime";
		
		switch(choice)
		{
			case 'A':
			case 'a':
			
			case 'B':
			case 'b':
				
			case 'C':
			case 'c':
				wrongAnswer(correctAnswer);
				break;
				
			default:
				rightAnswer();
				break;
		}
		
		System.out.println("Question 17:");
		System.out.println("Which R&B/hip-hop girl group sang \"Waterfalls\" and \"No Scrubs\"?");
		System.out.println("A. Destiny's Child");
		System.out.println("B. TLC");
		System.out.println("C. SWV");
		System.out.println("D. Blaque");
		
		answer = input_validation();
		choice = inputValidation(answer);
		
		correctAnswer = "TLC";
		
		switch(choice)
		{
			case 'A':
			case 'a':
				wrongAnswer(correctAnswer);
				break;
			
			case 'B':
			case 'b':
				rightAnswer();
				break;
				
			case 'C':
			case 'c':
				
			default:
				wrongAnswer(correctAnswer);
				break;	
		}
		
		System.out.println("Question 18:");
		System.out.println("How is 500 written in Roman numerals?");
		System.out.println("A. D");
		System.out.println("B. M");
		System.out.println("C. V");
		System.out.println("D. X");
		
		answer = input_validation();
		choice = inputValidation(answer);
		
		correctAnswer = "D";
		
		switch(choice)
		{
			case 'A':
			case 'a':
				rightAnswer();
				break;
			
			case 'B':
			case 'b':
				
			case 'C':
			case 'c':
				
			default:
				wrongAnswer(correctAnswer);
				break;	
		}
		
		System.out.println("Question 19:");
		System.out.println("Which food company makes Cap'n Crunch?");
		System.out.println("A. General Mills");
		System.out.println("B. Kellogs");
		System.out.println("C. Post");
		System.out.println("D. Quaker Oats");
		
		answer = input_validation();
		choice = inputValidation(answer);
		
		correctAnswer = "Quaker Oats";
		
		switch(choice)
		{
			case 'A':
			case 'a':
			
			case 'B':
			case 'b':
				
			case 'C':
			case 'c':
				wrongAnswer(correctAnswer);
				break;		
				
			default:
				rightAnswer();
				break;
		}
		
		System.out.println("Question 20:");
		System.out.println("Burma is the former name of what Asian country?");
		System.out.println("A. Myanmar");
		System.out.println("B. Indonesia");
		System.out.println("C. Singapore");
		System.out.println("D. Thailand");
		
		answer = input_validation();
		choice = inputValidation(answer);
		
		correctAnswer = "Myanmar";
		
		switch(choice)
		{
			case 'A':
			case 'a':
				rightAnswer();
				break;
			
			case 'B':
			case 'b':
			
			case 'C':
			case 'c':
			
			default:
				wrongAnswer(correctAnswer);
				break;
		}
		
		System.out.println("Tallying your score........");
		System.out.println("Your scored " + score + " points");
		
		if(score == 20)
			System.out.println("You have a perfect score");
		
		if(score == 0)
			System.out.println("Better luck next time");
	}
	
	//string must have one and only one character
	private static String input_validation() 
	{
		Scanner sc = new Scanner(System.in);
		String answer = sc.next();
		while(answer.length()>1)
		{
			System.out.println("Invalid entry.  Try again");
			answer = sc.next();
		}
		
		return answer;
	}
	
	//choices must be A, B, C, or D
	private static char inputValidation(String ans)
	{
		char choice = ans.charAt(0);
		while(choice < 'A' || choice > 'D' && choice <  'a' || choice > 'd')
		{
			
			System.out.println("Invalid entry.  Try again");
			Scanner s = new Scanner(System.in);
			ans = s.next();
			choice = ans.charAt(0);
		}
		
		return choice;
		
	}

	public static void rightAnswer()
	{
		System.out.println("That is the correct answer.");
		score++;
		
		System.out.println("Press any key to continue");
		Scanner S = new Scanner(System.in);
		String ch =  S.next();
		char c = ch.charAt(0);
	}
	
	public static void wrongAnswer(String correct)
	{
		System.out.println("I'm sorry.  The correct answer is " + correct + ".");
		System.out.println("Press any key to continue");
		Scanner S = new Scanner(System.in);
		String ch =  S.next();
		char c = ch.charAt(0);
		
	}

}