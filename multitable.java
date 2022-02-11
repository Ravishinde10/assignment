package Basicjava;
import java.util.Scanner;
public class multitable {

	public static void main(String[] args) {
		int num,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to print multitable:");
		num=sc.nextInt();
		for(i=1;i<=10;i++) {
			System.out.println(num+"*"+i+"="+(num*i));
		}

	}

}
