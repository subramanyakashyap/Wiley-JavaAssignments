package com.multithreading.questionanswer;

public class QuestionAnswer
{
	
	private String[] answersHere= {"Narendra Modi","Maja Maja","A smallest unit sub-process which cannot be further divided"};
	private int index;
	private boolean flag=true;
	
	synchronized void showQuestion(String question, int i) throws InterruptedException {
		if(flag==false) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName()+" : "+question);
		index = i;
		Thread.sleep(5000);
		flag=false;
		notify();
	}
	
	synchronized void showAnswer(String answer) {
		if(flag==true) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		if(answer.equals(answersHere[index])){
		System.out.println(Thread.currentThread().getName()+" : "+answer);
		}else{
			System.exit(0);
		}
		flag=true;
		notify();
	}
}
