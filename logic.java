package hemana;

import java.util.Scanner;

public class logic {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
	    System.out.print("enter the value of a:\n");
	    int a=input.nextInt();
	    System.out.print("enter the value of b:\n");
	    int b=input.nextInt();
	    if (a<b&&a>b)
	    {System.out.println("condition is false");}
	    else 
	    {System.out.println("condition is true");}

	}

}
