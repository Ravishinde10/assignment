package condtional_Statments;
import java.util.Scanner;
public class switch_Demo {

	public static void main(String[] args) {
		char val;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the charcter:");
		val=sc.next().charAt(0);
		switch(val)
		{
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
	   System.out.println("It is vowel="+val);
			break;
			default:
				 System.out.println("It is not a vowel="+val);
		}
	}

}

