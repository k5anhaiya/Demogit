
public class patternPrinting 
{
	public static void main(String[] args) 
	{
		int a = 10;
		int b = 20;
//swap number without using third variable
		b = b + a; // now b is sum of both the numbers
		a = b - a; // b - a = (b + a) - a = b (a is swapped)
		b = b - a;
		System.out.println(b);
		System.out.println(a);
	}

}
