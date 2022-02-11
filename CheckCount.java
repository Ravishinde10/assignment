package Basicjava;
import java.util.Scanner;
public class CheckCount {

	public static void main(String[] args) {
		System.out.println("Enter Number");
		Scanner sc=new Scanner(System.in);
		int number =sc.nextInt();
     sc.close();
     int count=0;
     
     for(;number!=0;) {
    	 number/=10;
    	 count++;
    	 
     }
     System.out.println("The count of number is : "+count);
     
	}

}
