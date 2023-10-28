package hemana;

import java.util.Scanner;

public class average {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("value  of a");
		int a= input.nextInt();
		System.out.println("value of b");
		int b= input.nextInt();
		System.out.println("value of c");
		int c=input.nextInt();
		int average= (a+b+c)/3;
		System.out.println("average of 3 is"+average);
		

	}

}
