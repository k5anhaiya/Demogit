import java.util.Scanner;

public class largestNumber 
{
	public static void main(String[] args) 
	{
		int n,temp;
		System.out.println("please Enter the size of array::");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int [] num=new int [n];
		for(int i=0;i<n;i++)
			{
				num[i]=sc.nextInt();
			}
		for(int j=0;j<num.length;j++)
		{
			for(int k=j+1;k<num.length;k++)
			{
				if(num[j]<num[k])
				{
					temp=num[j];
					num[j]=num[k];
					num[k]=temp;
				}
			}	
		}
		System.out.print("Second largest number:"+num[num.length-2]);
	}

}
