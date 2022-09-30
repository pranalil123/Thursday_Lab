/*Lab QUE3: WAP to accept a no from user and check it is prime or not. 
Pass this number in different function and check it is even or odd. 
IF number is even than check it is divisible by 10 or not in different function and is no is odd than check it is divisible by 3 or not in different function
*/

package thursday_lab_29Sep;
import java.util.Scanner;
public class Question3 {
	int num;      //variable declaration

	//main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Question3 obj=new Question3();      //create object
		obj.accept_val();                  //function call
		
		}
	//function 
	public void accept_val()
	{
		Scanner sc=new Scanner(System.in);    //create an instance of scanner class
		System.out.println("Enter the number:\n");    //user input
		num=sc.nextInt();                              //store user input
		int temp=0;                                    //initialization 
		
		//logic to check whether number is prime or not
		for(int i=2;i<num;i++)
        {
     	   if(num%i==0)
     		   temp=temp+1;
        }
        if(temp==0)
        {
     	   System.out.println(num+" is a Prime number");
     	   even_odd(num);
        }
        else
        {
     	   System.out.println(num+" is NOT a Prime number");
     	   even_odd(num);
        }

	}
	//logic to check number is even or odd by passing same number
	public void even_odd(int num)
	{
		if(num%2==0)
		{
			System.out.println("Entered number "+num+" is Even");
			div_by10(num);                            //calling the div_by10 function
		}
		else
		{
			System.out.println("Entered number "+num+" is Odd");
			div_by3(num);                              //calling the div_by3 function
		}
	}
	//logic to check even number is divisible by 10 or not passing same number
	public void div_by10(int num)
	{
		if(num%10==0)
		{
			System.out.println("The number "+num+" is Divisible by 10");
		}
		else
		{
			System.out.println("The number "+num+" is not Divisible by 10");
		}
	}
	//logic to check even number is divisible by 3 or not passing same number
	public void div_by3(int num)
	{
		if(num%3==0)
		{
			System.out.println("The number "+num+" is Divisible by 3");
		}
		else
		{
			System.out.println("The number "+num+" is not Divisible by 3");
		}
	}
	

}
