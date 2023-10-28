package hemana;

import java.util.Scanner;

public class details {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("value  of a");
		int a= input.nextInt();
		System.out.println("value of b");
		int b= input.nextInt();
		System.out.println("value of c");
		int c=input.nextInt();
		if (a>b&&a>c) {
			System.out.print("a is greater");}
		else if (b>a&&b>c)  {
			System.out.print("b is greater");}
		else {
			System.out.print("c is greater");}
		}
		

	}


