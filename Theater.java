package com.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Theater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Customer>seatingList =new ArrayList<>();
		ArrayList<Customer>waitingList =new ArrayList<>();
		Set<Integer>bookingStatus=new HashSet<>();
		Scanner input = new Scanner(System.in);
		
		while(true) {
			System.out.println("\n====== THEATER MENU=====");
			System.out.println("1.booking ticket");
			System.out.println("2.booking status");
			System.out.println("3.wating list");
			System.out.println("=======================");
			System.out.println("enter your choice");
			int choice=input.nextInt();
			
			switch (choice) {
			case 1:
			System.out.println("=======================");
			System.out.println("enter your id");
			Integer id=input.nextInt();
			input.nextLine();
			System.out.println("enter your name");
			String name =input.nextLine();
			
			System.out.println("=======================");
			Customer c = new Customer();
			if(bookingStatus.contains(id)) {
				
				
			}

			



			
			
			}
			
			
			
		}


	}

}
