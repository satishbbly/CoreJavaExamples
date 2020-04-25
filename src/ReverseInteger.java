
public class ReverseInteger {

	public static void main(String[] args) {
		System.out.println("reversed intger"+reverse(2147483647));

	}

	private static long reverse(int i) {
		long reversed=0;
		while(i != 0)
		{
			reversed=reversed*10+(i%10);
			i=i/10;
			if(reversed>=Integer.MAX_VALUE || reversed<=Integer.MIN_VALUE)
			{
				return 0;
			}
		}
		
		return reversed;
	}

}
