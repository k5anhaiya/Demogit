import java.util.Scanner;

public class findLargestNumber 
{
	public static void main(String[] args) 
	{
		int n,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("===================================");
		System.out.print("Please enter the size of array=");
		n=sc.nextInt();
		int [] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int j=0;j<n;j++)
		{
			for(int k=j+1;k<n;k++)
			{
				if(arr[j]<arr[k])
				{
					temp=arr[j];
					arr[j]=arr[k];
					arr[k]=temp;
				}
			}
		}
		
		System.out.println("printing in ascending order");
		for(int ctr=n-1;ctr>=0;ctr--)
		{
			System.out.print(arr[ctr]+" ");
		}
		System.out.println();
		System.out.println("printing in descending order");
		for(int ctr=0;ctr<n;ctr++)
		{
			System.out.print(arr[ctr]+" ");
		}

	}

}
