package edu.exeter.cs;

public class Question {

	private int intensity;
	private String question;
	private String answer;
	
	public Question(String q, String a) {
		question = q;
		answer = a;
		if (question.equals("What is the capital of Massachusetts?")) {
			intensity = 4;
		}
		if (question.equals("What is worse, ignorance or apathy?")) {
			intensity = 10;
		}
	}
	
	public void isCorrect(String s) {
		if (s.equals(answer)) {
			System.out.println("Correct!");
		} else {
			System.out.println("No, the answer is I don't know and I don't care.");
		}
	}
	
	public int getIntensity() {
		return intensity;
	}
	public void setIntensity(int n) {
		intensity = n;
	}
	
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String s) {
		question = s;
	}
	
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String s) {
		answer = s;
	}
	
	public String toString() {
		return question + " (Level: " + intensity + ")";
	}
	
}
