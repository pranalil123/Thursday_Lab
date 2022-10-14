//Q1)Single:
//WAP to create a class which contain the method Palindrom .the second class will use the property of first class and display the output."

package thursday_lab_13Oct;
import java.util.Scanner;

public class Q1_palindrom {
	   
	   public static void palindrom()
	   {
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
         // if given number equal to reverse number then number is palindrom otherwise not palindrom
	       if(num==rev_no)
	       {
		       System.out.println(num+" is Palindrom number");
	       }
	      else
	       {
		      System.out.println(num+" is NOT Palindrom number");
	       }
	     }
	

}



package thursday_lab_13Oct;

public class Palindrom_class2 extends Q1_palindrom { //class Palindrom_class2 inherits Q1_palindrom class

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		palindrom();  //calling method of class Q1_palindrom

	}

}
