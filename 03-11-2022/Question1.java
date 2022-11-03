/*Ques 1. Write a program that creates 2 threads - each displaying a message
(Pass the message as a parameter to the constructor). 
The threads should display the messages continuously till the user presses any key.
*/

package Thread;

public class thread_class extends Thread {
	
		String str; 
		// constructor accepting a parameter
		thread_class(String s) 
		{
			str = s;
		}
		// run method calling by the another class
		public void run() 
		{
			// infinity loop
			for (;;) 
			{
				    System.out.println((Thread.currentThread()).getName()+" "+"Message: "+str); // printing the message
		            System.out.println((Thread.currentThread()).getName()+" "+"Priority:  "+(Thread.currentThread()).getPriority()); // printing the priority here
		             
		            try
		            {
		            	// sleeping the thread for 2 sec
		                Thread.sleep(2000); 
		            }
		            catch(Exception e)
		            { 
		                System.out.println(e);
		            }
		    }
		}
	

}

//main

package Thread;

public class question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		   thread_class ob = new thread_class("The Thread is Active"); // passing Message to the constructor
		    thread_class ob1 = new thread_class("The Thread is UNACTIVE"); // passing Message to the constructor
						System.out.println("---Display the running---");
						// call the run method
						ob.start(); 
						ob1.start(); 
					}

			

}

