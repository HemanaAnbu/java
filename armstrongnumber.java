package hemana;

public class armstrongnumber {

	//private static Object math;

	public static void main(String[] args) {
		int number=298;
		int originalNumber,remainder;
		int result=0;
		originalNumber=number;
		while (originalNumber !=0)
		{
			remainder=originalNumber%10;
			result+=Math.pow(remainder,3);
			originalNumber/=10;
			
		}
		if (result==number)
			System.out.print("armstrong");
		else 
			System.out.print("not a armstrong");

	}

}
