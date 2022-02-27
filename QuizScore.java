/**
 * Purpose: Checks how many answers have been answered correctly and prints out a personalized comment, score and whether the user has won.
 * Author: Jake Bastin
 * Date: Tuesday January 14, 2020
 */

public class QuizScore extends QuizGame
{

	public static void quizPoints()
	{

		// Closes the scanner from receiving user input and lets the user know that the quiz is over.
		useScan().close();
		System.out.println("");
		System.out.println("-End of Quiz!-");

		// Prints out the score, a personalized comment as well as whether or not the user won depending on the score.
		switch(QuizAnswers.correctRetrieve())
		{

		// Cases 10 to 5 run if the user got 5 or more correct answers, lets them know that they won and prints their score.
		case 10:
			System.out.println("Are you a reincarnation of Maxwell!? YOU ACED IT!!!");
			System.out.println("Score: You got " + QuizGame.correctRetrieve() + " right and " + QuizGame.incorrectRetrieve() + " wrong.");
			System.out.println("");
			System.out.println("YOU WIN! :)");
			break;

		case 9: 
			System.out.println("Excellent studying out there! You strive for perfection (or close to it)!");
			System.out.println("Score: You got " + QuizGame.correctRetrieve() + " right and " + QuizGame.incorrectRetrieve() + " wrong.");
			System.out.println("");
			System.out.println("YOU WIN! :)");
			break;

		case 8:
			System.out.println("Great job out there! You achieved an \"A\" score and proved that you know a good portion of the content!");			
			System.out.println("Score: You got " + QuizGame.correctRetrieve() + " right and " + QuizGame.incorrectRetrieve() + " wrong.");
			System.out.println("");
			System.out.println("YOU WIN! :)");
			break;

		case 7:
			System.out.println("You did decently. Your studying could improve slightly but you scored a sufficient amount of questions correctly!");
			System.out.println("Score: You got " + QuizGame.correctRetrieve() + " right and " + QuizGame.incorrectRetrieve() + " wrong.");
			System.out.println("");
			System.out.println("YOU WIN! :)");
			break;

		case 6:
			System.out.println("Not bad! You did alright but your study habits could be improved!");
			System.out.println("Score: You got " + QuizGame.correctRetrieve() + " right and " + QuizGame.incorrectRetrieve() + " wrong.");
			System.out.println("");
			System.out.println("YOU WIN! :)");
			break;

		case 5:
			System.out.println("You barely passed! You should REALLY learn how to study better! You only retained about half the information on this quiz!");
			System.out.println("Score: You got " + QuizGame.correctRetrieve() + " right and " + QuizGame.incorrectRetrieve() + " wrong.");
			System.out.println("");
			System.out.println("YOU WIN! :)");
			break;

		// Cases 4 to 1 runs if the user got between 1 to 4 questions right, tells the user that they lost and their score.
		case 4: 
			System.out.println("You failed! If you want to pass this course, you should probably try harder");
			System.out.println("Score: You got " + QuizGame.correctRetrieve() + " right and " + QuizGame.incorrectRetrieve() + " wrong.");
			System.out.println("");
			System.out.println("YOU LOSE! :(");
			break;

		case 3: 
			System.out.println("You failed! At this point, you should get a tutor to help you study for this course."); 
			System.out.println("Score: You got " + QuizGame.correctRetrieve() + " right and " + QuizGame.incorrectRetrieve() + " wrong.");
			System.out.println("");
			System.out.println("YOU LOSE! :(");
			break;

		case 2:
			System.out.println("You failed! At this point, you should get a tutor to help you study for this course."); 
			System.out.println("Score: You got " + QuizGame.correctRetrieve() + " right and " + QuizGame.incorrectRetrieve() + " wrong.");
			System.out.println("");
			System.out.println("YOU LOSE! :(");
			break;

		case 1:
			System.out.println("You failed! At this point, you should get a tutor to help you study for this course."); 
			System.out.println("Score: You got " + QuizGame.correctRetrieve() + " right and " + QuizGame.incorrectRetrieve() + " wrong.");
			System.out.println("");
			System.out.println("YOU LOSE! :(");
			break;

		// Case 0 runs if the user didn't get any questions right, prints their score and that they lost.
		case 0:
			System.out.println("You have A LOT of work to do... You are very far from success but you can do it!!!");
			System.out.println("Score: You got " + QuizGame.correctRetrieve() + " right and " + QuizGame.incorrectRetrieve() + " wrong.");
			System.out.println("");
			System.out.println("YOU LOSE! :(");
			break;

		}
		
	}

}
