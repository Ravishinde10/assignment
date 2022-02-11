package corejava;
import java.util.Scanner;
public class reverse_order {

	public static void main(String[] args) {
		
		int n,reverse=0,reminder=0;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number");
		n=sc.nextInt();
		
		while(n!=0)
		{
			reminder = n%10;
			
			reverse=reverse*10+reminder;
			n=n/10;
		}
		System.out.println("reverse number is: "+reverse);
	}

}
