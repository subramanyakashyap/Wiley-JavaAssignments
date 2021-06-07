package com.google.student;

public class Standard {
	
	public Student[] createStudents(){
		int eng=90,maths=85,science=80;
		char c = 'a';
		Student[] students = new Student[8];
		for(int i=0;i<students.length;i++){
			students[i] = new Student();
			students[i].setStudName(""+c++);
			students[i].setMarksInEng(eng--);
			students[i].setMarksInScience(science--);
			students[i].setMarksInMaths(maths--);
		}
		return students;
	}
	public void sortAndDisplay(Student[] students) {
		for(int i=0;i<students.length-1;i++){
			for(int j=0;j<students.length;j++){
				Student temp;
				if(students[j].getRollNo()>students[j].getRollNo()){
					temp = students[j];
					students[j] = students[j+1];
					students[j+1] = temp;
				}
			}
		}
		for(int i=0;i<students.length;i++){
			System.out.println(students[i].getRollNo()+" : "+students[i].getStudName());
		}
	}
	public Student topper(Student[] students){
		Student top = students[0];
		int maxTotal = students[0].getMarksInEng()+students[0].getMarksInMaths()+students[0].getMarksInScience();
		for(int i=1;i<students.length;i++){
			int total = students[i].getMarksInEng()+students[i].getMarksInMaths()+students[i].getMarksInScience();
			if(total>maxTotal){
				maxTotal = total;
				top = students[i];
			}
		}
		return top;
	}
	public Student topperMaths(Student[] students){
		Student top = students[0];
		for(int i=1;i<students.length;i++){
			if(students[i].getMarksInMaths()>top.getMarksInMaths()){
				top = students[i];
			}
		}
		return top;
	}
			
}
