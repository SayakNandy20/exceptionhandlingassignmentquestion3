package appexh3;

import  exceptionalhandlingquestion3.Validator1;

import java.util.Scanner;

import exceptionalhandlingquestion3.IncorrectPasswordException;

public class appmainexh3 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter User Name");
		String username=sc.nextLine();
        System.out.println("Enter Password");
        String userpassword=sc.nextLine();
      
        Validator1 validator1=new Validator1();
            
        try {
        	validator1.validatepassword(userpassword);
			System.out.println("Bon Voyage");
		} catch (IncorrectPasswordException e) {
			// TODO Auto-generated catch block
			System.out.println("Incorrect password");
	
		}
        
        
        
	}

}
