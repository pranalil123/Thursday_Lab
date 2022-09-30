// Write a program to accept a number from user and then prints the sum of the even and odd integers.

package thursday_lab_29Sep;
import java.util.Scanner;

public class Question1 {    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//variable declaration and initialization
		int num, even_sum=0,odd_sum=0;        
		char ans;
		Scanner sc=new Scanner(System.in);   //create an instance of scanner class

		do
		{
			System.out.println("Enter the number:\n");   //take user input
			num=sc.nextInt();                            //store user input
			//logic for sum of even numbers
			if(num%2==0)
			{
				even_sum=even_sum+num;
			}
			//logic for sum of odd numbers
			else
			{
				odd_sum=odd_sum+num;
			}
			
			System.out.println("Do you want to continue y/n");
			ans=sc.next().charAt(0);
		}
		while(ans=='Y'||ans=='y');
		System.out.println("Addition of Even numbers is= "+even_sum);
		System.out.println("Addition of Odd numbers is= "+odd_sum);
		

	}

}
