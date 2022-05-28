
public class App 
{
	public static void main(String[] args) 
	{
		int [] arr= {123};
		String str1="4/5/6";
		String str2="7/8/9";
		System.out.print(arr[0]);
		String [] arr1=str1.split("/");
		String [] arr2=str2.split("/");
		System.out.print(arr1[2]);	
		System.out.print(arr2[2]); 
		System.out.print(arr2[1]);	
		System.out.print(arr2[0]);	
		System.out.print(arr1[0]);	
		System.out.print(arr1[1]);	
	}

}
