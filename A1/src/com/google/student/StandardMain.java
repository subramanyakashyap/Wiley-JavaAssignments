package com.google.student;

public class StandardMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Standard s = new Standard();
		Student[] stud = s.createStudents();
		s.sortAndDisplay(stud);
		Student mathsTopper = s.topperMaths(stud);
		Student topper = s.topper(stud);
		System.out.println(topper.getRollNo()+" : "+topper.getStudName());
		System.out.println(mathsTopper.getRollNo()+" : "+mathsTopper.getStudName());
	}

}
