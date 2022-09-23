//Q3: Create a menu for food counter and accept the items from user and display the final Bill amount with the item is ordered
package q3;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declare and initialize variables
		int menu_item,menu1,qty,total=0;  
		char ans;
		String item_name="";
		Scanner sc=new Scanner(System.in); //create instance of scanner class 
		do
		{
			System.out.println("=====================================================================");
			System.out.println("********************WELCOME TO VEDIKA FOOD CORNER********************");
			System.out.println("=====================================================================");
			System.out.println("   What would you like to choose:\n");
			System.out.println("       Menu:\n1:Starters \n2:Main Course \n3:Desserts");
			menu_item=sc.nextInt();
			switch(menu_item)
			{
			  case 1: 
				  //declare item prices
				  int GobiManchurian=120;
				  int AlooTikki=140;
				  int SpringRolls=180;
				  int SweetCornCutlets=200;
				  
				  System.out.println("       1:Gobi Manchurian      \t\tRs.120");
				  System.out.println("       2:Aloo Tikki           \t\tRs.140");
				  System.out.println("       3:Spring Rolls         \t\tRs.180");
				  System.out.println("       4:SweetCorn Cutlets    \t\tRs.200");
				  menu1=sc.nextInt();
				  switch(menu1)
					{
					case 1:
						item_name+="\nGobi Manchurian";
						System.out.println("Enter Quantity: ");
						qty=sc.nextInt();
						total=total+qty*GobiManchurian;
						break;
					case 2:
						item_name+="\nAloo Tikki";
						System.out.println("Enter Quantity: ");
						qty=sc.nextInt();
						total=total+qty*AlooTikki;
						break;
					case 3:
						item_name+="\nSpring Rolls";
						System.out.println("Enter Quantity: ");
						qty=sc.nextInt();
						total=total+qty*SpringRolls;
						break;
					case 4:
						item_name+="\nSweetCorn Cutlets";
						System.out.println("Enter Quantity: ");
						qty=sc.nextInt();
						total=total+qty*SweetCornCutlets;
						break;
					default:
						System.out.println("Please enter valid choice");
					}
				    break;
				    
			  case 2: 
				  int BadamiPaneer=290;
				  int VegBiryani=260;
				  int ButterRoti=50;
				  int PeasPulao=280;
				  
				  System.out.println("       1:Badami Paneer        \t\tRs.290");
				  System.out.println("       2:Veg Biryani          \t\tRs.260");
				  System.out.println("       3:Butter Roti          \t\tRs.50");
				  System.out.println("       4:Peas Pulao           \t\tRs.280");
				  menu1=sc.nextInt();
				  switch(menu1)
					{
					case 1:
						item_name+="\nBadami Paneer";
						System.out.println("Enter Quantity: ");
						qty=sc.nextInt();
						total=total+qty*BadamiPaneer;
						break;
					case 2:
						item_name+="\nVeg Biryani";
						System.out.println("Enter Quantity: ");
						qty=sc.nextInt();
						total=total+qty*VegBiryani;
						break;
					case 3:
						item_name+="\nButterRoti";
						System.out.println("Enter Quantity: ");
						qty=sc.nextInt();
						total=total+qty*ButterRoti;
						break;
					case 4:
						item_name+="\nPeas Pulao";
						System.out.println("Enter Quantity: ");
						qty=sc.nextInt();
						total=total+qty*PeasPulao;
						break;
					default:
						System.out.println("Please enter valid choice");
					}
				    break;
			  case 3: 
				  int GulabJamun=130;
				  int GajarHalwa=150;
				  int ShahiTukda=190;
				  int Kulfi=170;
				  
				  System.out.println("       1:Gulab Jamun          \t\tRs.130");
				  System.out.println("       2:Gajar Halwa          \t\tRs.150");
				  System.out.println("       3:Shahi Tukda          \t\tRs.190");
				  System.out.println("       4:Kulfi                \t\tRs.170");
				  menu1=sc.nextInt();
				  switch(menu1)
					{
					case 1:
						item_name+="\nGulab Jamun";
						System.out.println("Enter Quantity: ");
						qty=sc.nextInt();
						total=total+qty*GulabJamun;
						break;
					case 2:
						item_name+="\nGajar Halwa";
						System.out.println("Enter Quantity: ");
						qty=sc.nextInt();
						total=total+qty*GajarHalwa;
						break;
					case 3:
						item_name+="\nShahi Tukda";
						System.out.println("Enter Quantity: ");
						qty=sc.nextInt();
						total=total+qty*ShahiTukda;
						break;
					case 4:
						item_name+="\nKulfi";
						System.out.println("Enter Quantity: ");
						qty=sc.nextInt();
						total=total+qty*Kulfi;
						break;
					default:
						System.out.println("Please enter valid choice");
					}
				    break;
			      }
			   System.out.println("Do you want to addd another item y/n");
			   ans=sc.next().charAt(0);
		    }
		while(ans=='Y'||ans=='y');

		System.out.println("     Ordered Items are:"+item_name);
		System.out.println("\n   Your Total Bill Amount is:"+total);
		System.out.println("\n=======================Thanks for coming=======================");
		System.out.println("  =========================Visit Again===========================");
		}
	 
			

}
