package hemana;

import java.util.Scanner;

public class Operator {

	public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.print("enter the value of a:\n");
    int a=input.nextInt();
    System.out.print("enter the value of b:\n");
    int b=input.nextInt();
    int c=a+b;
    System.out.println("c value is"+c);
    int d=a-b;
    System.out.println("d value is"+d);
    
}

}
