package Basicjava;
import java.util.Scanner;
public class Kilotomile {

	public static void main(String[] args) {
		System.out.println("value of kilometer");
		Scanner sc=new Scanner(System.in);
	
		float kilometer =sc.nextFloat(); 
		System.out.println("To Mile");
       System.out.println(kilometer/1.6);
	}

}
