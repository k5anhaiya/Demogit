
public class triangularSeries 
{
	public static void main(String[] args) 
	{
		int noOfTerms = 20;
	     System.out.print("The first " + noOfTerms + " terms of the Triangular series are: \n");
	     for(int i = 1; i <= noOfTerms; i++)
	     {
	              // calculating the term
	              int term = (i * (i + 1)) / 2;
	                 // displaying the term
	                 System.out.print(term + " ");
	     }

	}

}
