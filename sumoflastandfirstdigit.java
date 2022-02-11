package Basicjava;
import java.util.Scanner;
public class sumoflastandfirstdigit {

	public static void main(String[] args) {
		int FirstDigit,sum,num,lastdigit;
		System.out.println("Enter Number");
		
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		lastdigit=num%10;  //calculate last digit
		
		System.out.println("last digit: "+lastdigit);
		
		
		for(;num>=10;) {   
			num=num/10;
		}
		FirstDigit=num;
		
		System.out.println("first digit: "+FirstDigit);
		
		System.out.println("sum of first digit and last digit is: "+(lastdigit+FirstDigit));
	}

}
