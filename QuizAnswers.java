/**
 * Purpose: This class includes the char array that contains all the MC answers checks if the user response matches it.
 * Author: Jake Bastin
 * Date: Friday January 10, 2020
 */

public class QuizAnswers extends QuizGame
{

	public static void quizAnswerCheck(String userResponse)
	{
		
		// This char array contains all the multiple choice answers in order.
		char[] answers = 
			{
				'b',
				'a',
				'c',
				'a',
				'c',
				'a',
				'c',
				'b',
				'b',
				'c',
				'b',
				'd',
				'b',
				'b',
				'a',
				'b',
				'b',
				'b',
				'a',
				'a',		
			};
		
		// Checks if user input matches the correct answer and adjusts the number of correct answers accordingly and prints correct.
		if(userResponse.charAt(0) == (answers[questionRandom()]))
		{
			System.out.println("");
			System.out.println("Correct!");
			setRightAnswer(correctRetrieve() + 1);
		}
		
		// Increments the number of incorrect answers and lets the user know if they got it wrong if input doesn't match answer.
		else 
		{
			System.out.println("");
			System.out.println("Wrong!");
			setWrongAnswer(incorrectRetrieve() + 1);
		}		
	
	}
	
}
