package com.google.student;

public class Student {
	 private static int count;
	 private int RollNo, MarksInEng, MarksInMaths, MarksInScience;
	 private String StudName;
	 {
		 count++;
		 RollNo = count;
	 }
	public int getRollNo() {
			return RollNo;
	}
	public int getMarksInEng() {
		return MarksInEng;
	}
	public void setMarksInEng(int marksInEng) {
		MarksInEng = marksInEng;
	}
	public int getMarksInMaths() {
		return MarksInMaths;
	}
	public void setMarksInMaths(int marksInMaths) {
		MarksInMaths = marksInMaths;
	}
	public int getMarksInScience() {
		return MarksInScience;
	}
	public void setMarksInScience(int marksInScience) {
		MarksInScience = marksInScience;
	}
	public String getStudName() {
		return StudName;
	}
	public void setStudName(String studName) {
		StudName = studName;
	}
	 


}
