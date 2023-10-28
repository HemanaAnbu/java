package hemana;

import java.util.Scanner;

public class palindrome1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		string original,reverse =" ";
		Scanner  in=new Scanner(System.in);
		System.out.println("enter");
		original=in.nextLine();
		int  length=original.length();
		for (int i=length-1;i>=0;i--)
		{reverse=reverse + original.charAt(i);
		if (original.equals(reverse))
			System.out.println("is a palinerome");
		else 
			System.out.println("not a palinrome");
		}

	}

}
