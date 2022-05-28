
public class app3 
{

		static final int R=3;
		static final int C=3;
		
		static Void formSpiralMatrix(int arr[],int mat[][])
		{
			int top=0,bottom=R-1,left=0,right=C-1;
			int index=0;
			while(true)
			{
				if(left>right)
					break;
				
				for(int i=left; i<=right;i++)
					mat[top][i]=arr[index++];
					top++;
					
				if(top>bottom)
					break;
				for(int i=top;i<=bottom;i++)
				mat[i][right]=arr[index++];
				right--;
				
				if(left>right)
					break;
				for(int i=right;i>=left;i--)
					mat[bottom][i]=arr[index++];
				if(top>bottom)
					break;
				for()
				
				
			}
		}
		
public static void main(String[] args) 
{
	int arr[]= {1,2,3,4,5,6,7,8,9};
	int mat[][]=new int[R][C];
	formSpiralMatrix(arr, mat);
	
	
}

}
