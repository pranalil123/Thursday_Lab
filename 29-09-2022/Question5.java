//Lab QUE5: WAP to accept no from user in array and find out average and sum of array numbers.

package thursday_lab_29Sep;
import java.util.Scanner;

public class Question5 {              

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		array();                    //function call 

	}
	public static void array()
	{
		Scanner sc=new Scanner(System.in);      //create an instance of scanner class
		int size,i,sum=0;                        //declaration and initialization of variables
		int avg;
		System.out.println("Enter the Array size:");      //take size of array by user
		size=sc.nextInt();                                  //store size input
		int arr[]=new int[size];                             //array creation
		System.out.println("Enter "+size+" numbers:");        //enter elements in array by user
		for(i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();                              //store an array
		}
		//display array
		System.out.println("The Array elements are:");
		for(i=0;i<size;i++)
		{
			System.out.println(arr[i]);
			sum=sum+arr[i];                          //logic for addition
		}
		avg=sum/size;                                //logic to calculate average
		
		System.out.println("Sum of all array elements is: "+sum);
		System.out.println("Average is: "+avg);
	}
	
	

}
