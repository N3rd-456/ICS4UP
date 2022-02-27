/**
 * Purpose: This class prints out an array of 20 course questions and check whether they have already been used.
 * Author: Jake Bastin
 * Date: Thursday January 9, 2020
 */

public class QuizQuestions extends QuizGame
{

	public static void courseQuestions()
	{

	  // Creates a string array that contains the 20 course questions and their answer options.
	  String[] questions = 
		  {
		     "What is Ohm's Law?"
		 	  + "\na) q = NE"	
		 	  + "\nb) V = IR" 
		 	  + "\nc) F = MA"
		 	  + "\nd) V = q/C",
		 	
		 	  "What does ALU stand for?"
		 	  + "\na) Arithmetic Logic Unit" 
		 	  + "\nb) Ampere Logic Unit"
		 	  + "\nc) Arduino Logic Unit"
		 	  + "\nd) Arithmetic Laptop Unicode",
		 	
		 	  "What is the truth table for an XNOR Logic Gate?"
		 	  + "\na) 0001"
		 	  + "\nb) 1100"
		 	  + "\nc) 1001" 
		 	  + "\nd) 0110",
		 	
		 	  "HTTP stands for “HyperText Transfer Protocol"
		 	  + "\na) True" 
		 	  + "\nb) False",
		 	
		 	  "There are billions of this component found within electronics. What is it?"
		 	  + "\na) Resistors"
		 	  + "\nb) Capacitors"
		 	  + "\nc) Transistors" 
		 	  + "\nd) Inductors",
		 	
		 	  "There are 4 logic gates in total."
		 	  + "\na) False" 
		 	  + "\nb) True",
		 	
		 	  "What does the variable \"C\" in the equation Ct = (C1^-1 + C2^-1...)^-1 denote?"
		 	  + "\na) Conductance"
		 	  + "\nb) Electric Charge"
		 	  + "\nc) Capacitance" 
		 	  + "\nd) Current",
		 	
		 	  "The potentiometer is a variable resistor that actively alters the amount of resistance in a circuit."
		 	  + "\na) False"
		 	  + "\nb) True", 
		 	
		 	  "The use of computer technology has and never will negatively impact others."
		 	  + "\na) True"
		 	  + "\nb) False", 
		 	  
		 	  "What does PWM stand for?"
		 	  + "\na) Power Wide Modulation"
		 	  + "\nb) Pizza Wild Man"
		 	  + "\nc) Pulse Width Modulation" 
		 	  + "\nd) Pulse Width Modulator",
		 	  
		 	  "The Arduino is a microcontroller."
		 	  + "\na) True"
		 	  + "\nb) False", 
		 	  
		 	  "What are the 2 type of input/output pins on the Arduino microcontroller platform?"
		 	  + "\na) Digital, Power"
		 	  + "\nb) Power, Analog"
		 	  + "\nc) PWM, Power"
		 	  + "\nd) Digital, Analog", 
		 	  
		 	  "The Arduino is not open source hardware."
		 	  + "\na) True"
		 	  + "\nb) False", 
		 	  
		 	  "There are 2 ways (ports) to power the Arduino."
		 	  + "\na) False"
		 	  + "\nb) True", 
		 	  
		 	  "WAN stands for World Area Network."
		 	  + "\na) False" 
		 	  + "\nb) True",
		 	  
		 	  "What type of hacker is defined to be working towards a malicious goal?"
		 	  + "\na) White Hat Hacker"
		 	  + "\nb) Black Hat Hacker" 
		 	  + "\nc) Grey Hat Hacker"
		 	  + "\nd) All of the above",
		 	  
		 	  "The Arduino's on board LED is internally connected to digital pin ____"
		 	  + "\na) 12"
		 	  + "\nb) 13" 
		 	  + "\nc) 1"
		 	  + "\nd) 2",
		 	  
		 	  "What programming language is the Arduino IDE based off of."
		 	  + "\na) Java"
		 	  + "\nb) C/C++" 
		 	  + "\nc) Python"
		 	  + "\nd) Ruby",
		 	  
		 	  "CMOS stands for Complimentary Metal-Oxide Semiconductor"
		 	  + "\na) True" 
		 	  + "\nb) False",
		 	  
		 	  "What is the prototyping platform for electronic circuit development?"
		 	  + "\na) Breadboard" 
		 	  + "\nb) Arduino"
		 	  + "\nc) Printed Circuit Boards (PCB)"
		 	  + "\nd) None of the above"
		  };
	
	  // This string stores the users answer response and creates a boolean array that with the questions arrays length.
	  String userResponse;
	  boolean[] questionUsed = new boolean[questions.length];
	  int count = 0;

	  // This while loop prints 10 random questions out of the possible 20 questions.
	  while(count < 10)
	  {		
		  count = count + 1;
		  randomize((int) (Math.random() * 20));

		  // Checks if a question has been used and selects another question if it has been used already.
		  for(; questionUsed[questionRandom()] == true ;)
		  {
			  randomize((int) (Math.random() * 20));
		  }

		  // Prints out a randomly selected question and opens up the scanners user input.
		  System.out.println("");
		  System.out.print(questions[questionRandom()]);
		  userResponse = useScan().nextLine();

		  // Checks if the users response matches the correct answer and sets the question to have already been used.
		  QuizAnswers.quizAnswerCheck(userResponse);
		  System.out.println("");
		  questionUsed[questionRandom()] = true;
	  }

	}

}


