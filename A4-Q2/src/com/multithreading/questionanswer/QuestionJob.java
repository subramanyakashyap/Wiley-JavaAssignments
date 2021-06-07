package com.multithreading.questionanswer;

public class QuestionJob implements Runnable{

	private String[] questions= {"Who is PM of India?","Say 'Maja Maja'","What is thread?"};
	private QuestionAnswer qa;
	
	
	public QuestionJob(QuestionAnswer qa) {
		super();
		this.qa = qa;
	}


	public void run() {
		for(int i=0;i<questions.length;i++) {
			try {
				qa.showQuestion(questions[i], i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
