
public class app1
{
	public static void main(String[] args) 
	{
		int n=10 ,first=0, second=1;
		System.out.println("printing fabonascii series between 1 to 10");
		
		for(int i=1;i<=n;i++)
		{
			System.out.print(first+",");
			int next=first+second;
			first=second;
			second=next;
		}
	}

}
