import java.util.Scanner;

public class bubble_sort 
{
	public static void main(String[] args) 
	{
		int n,temp=0;
		System.out.print("Please enter the size of array :");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int [] a=new int [n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(int j=0;j<a.length;j++)
		{
			for(int k=j+1;k<a.length;k++)
			{
				if(a[j]>a[k])
				{
					temp=a[j];
					a[j]=a[k];
					a[k]=temp;
				}
			}
		}
		for(int ctr:a)
		{
			System.out.print(ctr+" ");
		}

	}

}
