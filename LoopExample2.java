package Basicjava;

import java.util.Scanner;

public class LoopExample2 {

	public static void main(String[] args) {
		int i,n;
		System.out.println("Enter range to print natural number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		for(i=100;i>=n;i--)
		{
			System.out.println(i);
		}
	}

}
