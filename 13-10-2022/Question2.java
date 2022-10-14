package thursday_lab_13Oct;
import java.util.Scanner;

public class Q2_Reverse_no {     //create first class
	
	public static void Reverse_no()
	{
		int num,rev_no=0,rem;      //variable declaration and initialization
		Scanner sc=new Scanner(System.in);    //create an instance of scanner class 
		System.out.println("Enter the number you want to reverse:");   //user input
		num=sc.nextInt();                                               //store user input
		//code to reverse number
		while(num>0)
		{
			rem=num%10;  
			rev_no=(rev_no*10)+rem;
			num=num/10;	
		}
		System.out.println("Reversed number is: "+rev_no); //print reversed number
	}
	

}


package thursday_lab_13Oct;
import java.util.Scanner;

public class Sum_of_digits extends Q2_Reverse_no {//inherits class
	
	public static void SOD()
	{
		int rem,num,sum=0;       //variable declaration and initialization
		Scanner sc=new Scanner(System.in);  //create an instance of scanner class
		System.out.println("Enter the number:");    //user input
		num=sc.nextInt();                            //store user input
		//using while loop to find sum of digits of number
		while(num>0)
		{
			rem=num%10;      //by this we'll get last digit of number
		    sum=sum+rem;      //adds last digit to the variable sum  
		    num=num/10;       //removes the last digit from the number   
		}
		System.out.println("Sum of digits of given number is: "+sum); //prints sum
		
		
	}

}


package thursday_lab_13Oct;

public class Class_3rd_output extends Sum_of_digits {  //inherits class

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reverse_no(); //calling function from Q2_Reverse_no class 
		SOD();        //calling function from Sum_of_digits class
		

	}

}
