package com.multithreading.questionanswer;

public class AnswerJob implements Runnable{

	private String[] answers= {"Narendra Modi","Maja Maja","A smallest unit sub-process which cannot be further divided"};
	private QuestionAnswer qa;
	
	
	public AnswerJob(QuestionAnswer qa) {
		super();
		this.qa = qa;
	}


	public void run() {
		for(int i=0;i<answers.length;i++) {
			qa.showAnswer(answers[i]);
		}
	}
}
