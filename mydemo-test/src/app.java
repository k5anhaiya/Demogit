import java.util.Scanner;

public class app 
{
	public static void main(String[] args) 
	{
		int number;
		int temp=0;
		System.out.println("*****Programme to check the number is prime or non-prime*****");
		Scanner sc=new Scanner(System.in);
		System.out.print("please enter any number :");
		number=sc.nextInt();
		for(int i=2;i<number;i++)
		{
			if(number%i==0)
			{
				temp=1;
			}
		}
		if(temp>0)
		{
			System.out.println(number+" is non-prime number.");
		}
		else
		{
			System.out.println(number+" is prime number.");
		}

	}

}
