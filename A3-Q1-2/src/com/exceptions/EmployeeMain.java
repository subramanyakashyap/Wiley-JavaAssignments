package com.exceptions;

import java.util.Scanner;

import com.exceptions.AgeException;
import com.exceptions.DuplicateException;
import com.exceptions.EmployeeList;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeList elist = new EmployeeList();
		int choice;
		Scanner scanner = new Scanner(System.in);
		while(true){
			System.out.println("1. Insert Employee\n2. Display\n3. Exit");
			choice = scanner.nextInt();
			switch(choice){
			case 1:
				System.out.println("Enter name and age: ");
				try {
					elist.addEmployees(scanner.next(), scanner.nextInt());
				} catch (DuplicateException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (AgeException e) {
					e.printStackTrace();
				}
				break;
			case 2:
				elist.display();
				break;
			case 3:
				System.out.println("Thank you!");
				System.exit(0);
			default:
				System.out.println("Invalid Choice");
				break;
			}
		}

	}
}
