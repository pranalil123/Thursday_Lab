/*Q3)"Write a Java program to print an array after changing the rows and columns of a given two-dimensional array.

		Original Array:
		10 20 30
		40 50 60
		After changing the rows and columns of the said array:
		10 40
		20 50
		30 60
		"
		*/
package thursday_lab_13Oct;

public class Q3_Transpose_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				int i,j;  //declare variables
				//initialize array 
				int array[][]= {{10,20,30}, {40,50,60}};
				//display array 
				System.out.println("Given Array is: ");
				for(i=0;i<2;i++)
				{
					for(j=0;j<3;j++);
					System.out.println(array[i][j]+"");
				}
				System.out.println("");
				
				//code for transpose array
				System.out.println("Transpose of given Array is: ");
				for(i=0;i<3;i++)
				{
					for(j=0;j<2;j++);
					System.out.println(array[j][i]+"");
				}
				System.out.println("");
				
				
		

		}


	

}
