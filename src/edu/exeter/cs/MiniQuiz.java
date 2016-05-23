package edu.exeter.cs;

import java.util.Scanner;

public class MiniQuiz {

	static Scanner scan = new Scanner(System.in);
	static String possible;
	
	public static void main(String[] args) {
		
		 Question q1 = new Question("What is the capital of Massachusetts?", "Boston");
		 Question q2 = new Question("What is worse, ignorance or apathy?", "ignorance");
		 
		 System.out.println(q1);
		 possible = scan.next();
		 q1.isCorrect(possible);
		 
		 System.out.println();
		 
		 System.out.println(q2);
		 possible = scan.next();
		 q2.isCorrect(possible);
		
	}

}
