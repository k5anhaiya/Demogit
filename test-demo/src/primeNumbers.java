import java.util.Scanner;

public class primeNumbers 
{
	public static void main(String[] args) 
	{
		int temp=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number :");
		int number=sc.nextInt();
		for(int i=2;i<=number-1;i++)
		{
			if(number%i==0)
			{
				temp=1;
			}
		}
		if(temp>0)
		{
			System.out.println(number+" is not prime number.");
		}
		else
		{
			System.out.println(number+" is prime number.");
		}
	}

}
