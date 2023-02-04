package com.simplilearn.emai_Id.validation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmailIdValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>emailIdList=new ArrayList<>();
	       
	       //adding email id to ArrayList object using add method.
	       emailIdList.add("himani.pathak@gmail.com");
	       emailIdList.add("john@@gmail.com");
	       emailIdList.add("mavrick@yahoo.com");
	       emailIdList.add("prateek@hotmail.com");
	       emailIdList.add("sam26@gmail.com");
	       emailIdList.add("neha@yahoo.com");
	       emailIdList.add("rahul01@gmail.com");
	       emailIdList.add("mohan@hotmail.com");
	       emailIdList.add("himakshi@gmail.com");
	       
	       //variable declaration,providing emailId null value so that it won't hold any garbage value.
	       String emailId; 
	       
	       //Taking input from the user using Scanner class.
	       System.out.println("Enter the email id you want to search");
	       
	       Scanner EmailInput =new Scanner(System.in);
	       emailId=EmailInput.nextLine();
	      
	       // comparing emailId entered by user with emailId present in the ArrayList using contains method. 
	       if(emailIdList.contains(emailId))
	       {
	    	   System.out.println("The entered Email Id "  + emailId  +  " is found");
	       }
	       else 
	       {
	    	   System.out.println("The entered Email Id "  + emailId  +  " is not found");
	       }
		
		}
			
	

	}


