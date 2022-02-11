package Basicjava;
import java.util.Scanner;
public class sumofnutural {

	public static void main(String[] args) {
		int num,i,sum=0;
		System.out.println("Enter Number");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		
		for(i=1;i<=num;i++) {
			sum=sum+i;
		}
		System.out.println("sum of natural no, from 1 to "+ num +" is = "+sum);
	}

}
