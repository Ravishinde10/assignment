package condtional_Statments;

import java.util.Scanner;
public class if_else_demo {

	public static void main(String[] args) 
	{
	  int num;
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter Number");
	  num=sc.nextInt();
	  if(num>0)
	  {
		    System.out.println("it is positive Number="+num);
		    
	  }
	  else	  
	  {
		   System.out.println("It is negative Number="+num);
	  }
	}
}
