import java.util.Scanner;

public class swapDemo 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int number,temp;
		System.out.print("Enter the size of array=");
		number=sc.nextInt();
		int [] arr=new int[number];
		for(int i=0;i<number;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int j=0;j<arr.length;j++)
		{
			for(int k=j+1;k<arr.length;k++)
			{
				if(arr[j]<arr[k])
				{
					temp=arr[j];
					arr[j]=arr[k];
					arr[k]=temp;
				}
			}
		}
		// this is the use of for each loop
		for(int ctr:arr)
		{
			System.out.print(ctr+" ");
		}
	}

}
