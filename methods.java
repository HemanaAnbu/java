package hemana;

public class methods{
	
	int r,sum=0,temp;
	int n;
	temp=n;
	while(n>0) {{
		r=n%10;
		sum=(sum*10)+r;
		n=n/10;
	}
	if(temp==sum)
		System.out.println("palindrome");
		else
			System.out.println("not palindrome");
	//return 0;

}


public static void  main(String[] args) 
{
		methods obj=new methods;
		obj.methods();

	}


