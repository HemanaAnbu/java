package hemana;

import java.util.Scanner;

public class aciivalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner Sccanner=new Scanner(System.in);
        System.out.print("enter  a character");
        char userInput = Scanner.next).charAt(0);
        if(userInput>='A'&& userInput<='2')
        { int asciivalue=(int)userInput;
            System .out.print("character"+userInput+"asciivalue"+asciivalue);
        }
        else 
        	System.out.print("invalid");
	}

}
