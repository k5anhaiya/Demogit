
public class App2 
{
	public static void main(String[] args) 
	{
		int first=1;
		int [] [] a=new int [3] [3];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				a[i][j]=first++;
			}
		}
		for(int k=0,m=0;m<a.length;m++)
		{
			System.out.print(a[k][m]+" ");
			
			//for(int l=0;l<a.length;l++)
			{
				//System.out.print(a[k][l]+" ");
			}
		}
	}

}
