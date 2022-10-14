//Q4)Write a program to accept the positive numbers  from user and display the sum of that numbers using loop.

package thursday_lab_13Oct;
import java.util.Scanner;    //import scanner class

public class Q4 {

	public static void main(String[] args) { //main method
		// TODO Auto-generated method stub
		sum();   // calling method
	}
	public static void sum()
	{
		Scanner sc=new Scanner(System.in);   //Create an instance of the Scanner class
		int size,i,sum=0;                    //declaration and initialization of variables
		System.out.println("Enter number of elements for sum:");   //user input
		size=sc.nextInt();          //store user input
		int numbers[]=new int[size];    //array declaration
		System.out.println("Enter "+size+" numbers: ");   //user input
		for(i=0;i<size;i++)
		{
			numbers[i]=sc.nextInt();           //store array input
		}
		
		//display array
		System.out.println("Numbers are: ");
		for(i=0;i<size;i++)
		{
			System.out.println(numbers[i]);
		}
		
		//loop through array for add all nembers
		for(i=0;i<numbers.length;i++)
		{
		  sum=sum+numbers[i];
		}
		System.out.println("Sum of given numbers is: "+sum);
		
	}

}
