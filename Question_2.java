/*Q2: Write a program to accept choice from user and perform the operation:
1:factorial
2:sum of digit
3:Armstrong number or not
4:fibonacci series
5:Prime no or Not
*/
package q2;
import java.util.Scanner;

public class Question_2 {

	public static void main(String[] args) { //main method
		// TODO Auto-generated method stub
		//calling methods
		fact();
		sum();
		armstrong_num();
		fibo_series();
		prime_no();
		

	}
	  public static void fact()
	  {
	      Scanner sc=new Scanner(System.in); //Create an instance of the Scanner class
	      System.out.println("To Find Factorial");
	      System.out.println("Enter the Number:\n"); //Take input from the user
	      int num=sc.nextInt();
	      int fact=1;                  //Declaration and initialization of variables.
	      
	      for(int i=1;i<=num;i++)
	        {
	            fact=fact*i;
	        }
	      System.out.println("Factorial of the number: "+fact); 
	      
	  }
	  
	  public static void sum()
	  {
		  int num1,num2,res;      //Declaration and initialization of variables.
	      Scanner sc=new Scanner(System.in);  //Create an instance of the Scanner class
	      System.out.println("\nSum of Digits");
	    //user inputs
	      System.out.println("Enter the 1st Number:\n"); 
	      num1=sc.nextInt();
	      System.out.println("Enter the 2nd Number:\n");
	      num2=sc.nextInt();
	      res=num1+num2; 
	      
	      System.out.println("Sum of given numbers is: "+res);
	   }
	  
	  public static void armstrong_num()
	  {
		  int rem,num,sum=0; ////Declaration and initialization of variables.
	      Scanner sc=new Scanner(System.in);
	      System.out.println("\nArmstrong number or NOT");
	      System.out.println("Enter the Number:\n"); //user inputs
	      num=sc.nextInt();
	      int temp=num;
	      //code to check number is armstrong or not.
	      while(temp>0)
	      {
	    	  rem=temp%10;
	    	  sum=sum+(rem*rem*rem);
	    	  temp=temp/10;
	    	  
	      }
	    //  If the sum value is equal to the num value, then input value is an Armstrong number, else it’s not an Armstrong number
	      if(num==sum)
	      {
	    	  System.out.println(num+" is an Armstrong number.");
	      }
	      else
	      {
	    	  System.out.println(num+" is NOT an Armstrong number.");
	      }
	   }
	      
 
       public static void fibo_series()
       {
    	   int num,dg1=0,dg2=1,dg3=0;
           Scanner sc=new Scanner(System.in);
           System.out.println("\nFibonacci Series");
           System.out.println("Enter the Number:\n");
           num=sc.nextInt();
           System.out.println("\nFibonacci Series is:\n");
           System.out.print(dg1+ " " +dg2); //print dg1 and gd2
           for(int i=2;i<=num;i++)
           {
        	   dg3=dg1+dg2;
        	   dg1=dg2;
        	   dg2=dg3;
        	   System.out.print(" "+dg3);

           }

       }
       public static void prime_no()
       {
    	   int num,temp=0; //decaration, initialization
           Scanner sc=new Scanner(System.in);
           System.out.println("\n\nPrime number or NOT");
           System.out.println("Enter the Number:\n");//user input
           num=sc.nextInt();
           //code to whether the given number is prime or not
           for(int i=2;i<num;i++)
           {
        	   if(num%i==0)
        	   {
        		   temp=temp+1;
               }
           }
           //if temp value is equal to 0 then the given number is prime otherwise not.
           if(temp==0)
           {
        	   System.out.println(num+" is a Prime number");
           }
           else
           {
        	   System.out.println(num+" is NOT a Prime number");
           }

        }  
}
