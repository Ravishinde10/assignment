package condtional_Statments;
import java.util.Scanner;
public class profit_loss {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	int sp,cp,res;
	System.out.println("Enter the selling price");
	sp=sc.nextInt();
	System.out.println("Enter the cost price");
	cp=sc.nextInt();
	res=sp-cp;
	if(res==0)
	{
		System.out.println("Neither profit Nor loss");
	}
	else if(res>0)
	{
		 System.out.println("profit="+res);
		
	}
	else
	{
		 System.out.println("loss="+(-res));
	}
	}

}
