
public class char_at 
{
	public static void main(String[] args) 
	{

		String str1="international";
		char ch=str1.charAt(5);
		System.out.println(ch);
		int index=str1.indexOf('n');
		int index1=str1.lastIndexOf('n');
		System.out.println(index);
		System.out.println(index1);
		String k1=str1.substring(5);
		String k2=str1.substring(5,11);
		System.out.println(k1);
		System.out.println(k2);
	}
}
