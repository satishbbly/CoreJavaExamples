
public class MultiplyDevideTest {

	public static void main(String[] args) {
		int num1=7;
		//int num2=3;
		//double d=num1/num2; will lead to wrong result 2.0 instead of expected result 2.3333333333335 because after dividing it will store in int temp variable 
		double num2=3;
		double d=num1/num2;
		System.out.println(d);
		
		int num3=55555;
		//int num4=66666;
		//long l=num3*num4; will lead to wrong result -591337666 instead of expected result 3703629630 because after multiplying it will store in int temp variable 
		long num4=66666;
		long l=num3*num4;
		System.out.println(l);

	}

}
