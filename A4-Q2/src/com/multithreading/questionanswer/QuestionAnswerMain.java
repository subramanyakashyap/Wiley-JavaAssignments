package com.multithreading.questionanswer;

public class QuestionAnswerMain {
	
	

	public static void main(String args[]) {
		QuestionAnswer qa=new QuestionAnswer();
		
		Thread question=new Thread(new QuestionJob(qa),"Question");
		Thread answer=new Thread(new AnswerJob(qa),"Answer");
		
		question.start();
		answer.start();
	}
}
