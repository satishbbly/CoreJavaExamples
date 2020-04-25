import java.util.Arrays;
import java.util.List;

public class TwoSum {

	public static void main(String[] args) {
		Integer[] numbers= {1,3,6,8,2}; 
		int target=11;
		
		for (int i = 0; i < numbers.length; i++) {
			int delta=target-numbers[i];
			List<Integer> l=Arrays.asList(numbers);

			int index=l.indexOf(delta);
			
			if(index>0)
			{
				System.out.println(i+"  "+index);
				break;
			}
			
			
		}

	}

}
