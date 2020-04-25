
public class ReverseString {

	public static void main(String[] args) {
		String str="Hello World";
		System.out.println(new StringBuilder(str).reverse());
		String temp="";

		for(int i=0;i<str.length();i++)
		{
			temp=temp+str.charAt(str.length()-(1+i));
		}
		System.out.println(temp);
	}

}
