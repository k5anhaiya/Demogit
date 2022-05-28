import java.util.Scanner;

public class reversePrint 
{
	public static void main(String[] args) 
	{
		System.out.print("please enter the number of rows to print star:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<=n;i++)
			{	
				for(int k=n;k>i;k--)
				 {               
					System.out.print("*"+" ");
				 }
			  System.out.println();
			}
	}

}
