/*Write a JAVA program which will generate the threads: -
 To display 10 terms of Fibonacci series. - To display 1 to 10 in reverse order.
*/
package Thread;
import java.io.*;
public class Fibonacci_class extends Thread
{
	public void run()
    {
         try
         {
              int a=0, b=1, c=0;
              //used to create a buffered character input stream
              BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
              System.out.print("Enter the Limit for fabonacci: ");
              int n = Integer.parseInt(br.readLine());
              System.out.println("\n*********************************");
              System.out.println("Fibonacci series:");
            //for printing 10 terms
              while (n>0)
              {
                   System.out.print(c+" ");            
                   a=b;
                   b=c;
                   c=a+b;
                   n=n-1;
              }
         }
         catch (Exception ex)
         {
              ex.printStackTrace();
         }
    }
}

package Thread;

public class Reverse_class extends Thread
{
	public void run()
    {
         try
         {
              System.out.println("\n*********************************");
              System.out.println("\nReverse is: ");
              System.out.println("*********************************");
              //to reverse the the number from 1 to 10
              for (int i=10; i >= 1 ;i-- )
              {
                   System.out.print(i+"  ");
              }
              System.out.println("\n*********************************\n\n");
         }
         catch (Exception ex)
         {
              ex.printStackTrace();
         }
    }
}

package Thread;

public class Fibo_main 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		try
        {
			//creating an object of the Thread class
			Fibonacci_class fib = new Fibonacci_class();
			//used to begin the execution of thread
             fib.start();
             fib.sleep(4000);
             Reverse_class rev = new Reverse_class();
             rev.start();
        }
        catch (Exception ex)
        {
             ex.printStackTrace();
        }
   }
}
