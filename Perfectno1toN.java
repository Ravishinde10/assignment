package corejava;
import java.util.Scanner;
public class Perfectno1toN {

	public static void main(String[] args) {
		int n,i,j,sum;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Range:");
		n=sc.nextInt();
		for(i=1;i<=n;i++) {
			sum=0;
			for (j=1;j<i;j++) {
				if(i%j==0)
				{
					sum=sum+j;
				}
			}
			
			if(sum==i)
				System.out.println(i);
		}
	}

}
