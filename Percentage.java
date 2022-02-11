package Basicjava;
import java.util.Scanner;
public class Percentage {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	 int Totle= 500;

	System.out.println("Physics");
	float Physics=sc.nextFloat();
	
	System.out.println("Chemistry");
	float Chemistry=sc.nextFloat();
	
	System.out.println("Marathi");
	float Marathi=sc.nextFloat();
	
	System.out.println("English");
	float English=sc.nextFloat();
	
	System.out.println("Hindi");
	float Hindi=sc.nextFloat();
	
	System.out.println("Percentage Of Student");
	System.out.println((Physics+Chemistry+Marathi+Hindi+English*Totle)/500+"%");
	
	
		
		

	}

}
