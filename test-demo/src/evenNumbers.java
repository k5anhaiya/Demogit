//print all even numbers between 1 to 100
public class evenNumbers 
{
	public static void main(String[] args) 
	{
		int temp=0;
		for(int i=0;i<=100;i++)
		{
			if(i%2==0)
			{
				
				System.out.print(i+" ");
				temp++;
			}
		}
		System.out.println();
		System.out.println("Total Even Numbers="+temp);
	}

}
