public class Chapter7Problem5
{
	public static void main (String[] args)
	{
		int userNumberSelected = 0;

		int[] arrayGiven = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; 

		LargerThanN object = new LargerThanN();

		object.largerThanN(arrayGiven, userNumberSelected);
	}
}