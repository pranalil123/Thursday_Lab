/*Lab QUE4: WAP to accept size from user accordingly accept numbers from user and 
also accept the no from user which you want to delete from your array and display the output.
*/
package thursday_lab_29Sep;
import java.util.Scanner;         //import scanner class

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     accept_array();                       //calling function

	}
	public static void accept_array()
	{
	
		Scanner sc=new Scanner(System.in);      //create an instance of scanner class
		int size,i,del_ele;                        //declaration of variables
		System.out.println("Enter the size of Array: ");      //take size of array by user
		size=sc.nextInt();                                    //store size input
		int arr[]=new int[size];                              //array creation
		System.out.println("Enter "+size+" numbers: ");         //enter elements in array by user
		for(i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();                              //store an array
		}
		//display array
		System.out.println("The Array elements are:");
		for(i=0;i<size;i++)
		{
			System.out.println(arr[i]);
		}
		//user input to delete a particular element from an array
		System.out.println("Enter the element you want to delete= ");
		del_ele=sc.nextInt();
		//logic to delete an element
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]==del_ele)
			{
				for(int j=i;j<arr.length-1;j++)
				{
					arr[j]=arr[j+1];
				}
				break;
			}
		}
		//display array after deleting element
		System.out.println("Elements after deletion: ");
		for(i=0;i<arr.length-1;i++)
		{
			System.out.println(arr[i]);
		}
		
	}

}


