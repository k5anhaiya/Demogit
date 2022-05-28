import java.util.Scanner;

public class app 
{

	public static void main(String[] args) 
	{
		int h,p,b;
		System.out.println("Please enter three numbers to check the pythagoras triplet");
		System.out.println("==============================================================");
		Scanner sc=new Scanner(System.in);
		System.out.print("please enter the first number=");
		h=sc.nextInt();
		System.out.print("please enter the second number=");
		p=sc.nextInt();
		System.out.print("please enter the third number=");
		b=sc.nextInt();
		
		if(h*h==(b*b)+(p*p))
		{
			System.out.print("This is a pythagoras triplet");
		}
		else 
		{
			System.out.print("This is not a pythagoras triplet");
			
		}

	}

}
