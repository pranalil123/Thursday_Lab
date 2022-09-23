//Q1: Write a program to accept a number from the user and check if a given number is palindrome or not.
package q1;
import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaration and initialization of variables.
		   int num,rem,rev_no=0;
		   Scanner sc = new Scanner(System.in);   //Create an instance of the Scanner class
	       System.out.println("Enter the number: "); //get input from user 
	       num=sc.nextInt();
	       int temp=num; //hold num value to temp
	       
	       //code to reverse the given number
	       while(temp!=0)
	       {    
	          rem=temp%10;    
	          rev_no=rev_no*10+rem;    
	          temp=temp/10;    
	       }  
	    // if given number equal to reverse number then number is palindrome otherwise not palindrome
		   if(num==rev_no)
		   {
			System.out.println(num+" is Palindrome number");
		   }
		   else
		{
			System.out.println(num+" is NOT Palindrome number");
		}
		
		

	}

}

