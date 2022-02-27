/**
 * Purpose: Main class that kickstarts the whole program and simulates a TEJ3M quiz by printing questions, checking answers and adjusting scores.
 * Author: Jake Bastin
 * Date: Monday January 13, 2020
 */

// This line of code imports the scanner for user keyboard input.
import java.util.Scanner;

public class QuizGame 
{

	// Initialize and declare the required fields needed to track user input and the user score.
	private static int random = (int) (Math.random() * 20);
	private static int answersWrong = 0;
	private static int answersRight = 0;
	private static Scanner scan = new Scanner(System.in);

	// Main method that kickstarts the entire program and prints out the introduction and course questions.
	public static void main(String[] args) 
	{

		// These lines of code print out what the quiz is about.
		System.out.println("Hmm, you must be taking TEJ3M, Gr 11 Computer Engineering. In that case, get ready to start the TEJ3M Final Exam Review Quiz!!");
		System.out.println("");
		System.out.println("");

		// This code block prints out the instructions as well as scores (win or lose) scenarios.
		System.out.println("Instructions:");
		System.out.println("");
		System.out.println("This quiz consists of 10 multiple choice and true/false questions.");
		System.out.println("Read carefully and answer the questions, typing the corresponding letters given (a, b, c, d) using ONLY lower case.");
		System.out.println("Get 5 or more questions correct to pass and win. If you don't... YOU FAIL and lose! :(");
		System.out.println("");

		// Run the methods within different classes that print out the 10 random questions and tracks the score.
		QuizQuestions.courseQuestions();
		QuizScore.quizPoints();

	}

	// Makes the scanner visible to other classes.
	public static Scanner useScan()
	{
		return scan;
	}

	// Retrieves the scanner to be used for user input in other classes.
	public static void scanRetrieve(Scanner scan)
	{
		QuizGame.scan = scan;
	}

	// Returns the random field that picks a random question to be used in another class (QuizQuestions).
	public static int questionRandom()
	{
		return random;
	}

	// Runs random when called upon and picks the randomized question but used in another class.
	public static void randomize(int random)
	{
		QuizGame.random = random;
	}

	// Retrieves the right answer private field that keeps the number of correct answers to be used in other classes.
	public static int correctRetrieve()
	{
		return QuizGame.answersRight;
	}

	// Sets the private int with the number of right answers to a public function to be used in another class.
	public static void setRightAnswer(int correctAnswer)
	{
		QuizGame.answersRight = correctAnswer;
	}

	// Retrieves the wrong answer private field that keeps track of the number of incorrect answers to be used in other classes.
	public static int incorrectRetrieve()
	{
		return answersWrong;
	}

	// Sets the private int field with the number of wrong answers to a public function to be used in another class.
	public static void setWrongAnswer(int answersWrong)
	{
		QuizGame.answersWrong = answersWrong;
	}

}

