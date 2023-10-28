package hemana;

import java.util.Scanner;

public class employee {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("employee name");
	    String a= input.next();
		System.out.println("experence  of work");
		int b= input.nextInt();
		System.out.println("salary");
		int c=input.nextInt();
		if (c<30000)
		System.out.println("hr team");
		else if (c<20000&c>30000) {
			System.out.println("production team");}
		else if (c>20000) {
			System.out.println("  sales  team");}
		}

	}


