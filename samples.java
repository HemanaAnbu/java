package hemana;

public class samples {
	public  void reverse() {
	
	int r,sum=0,temp;
	int n=11;
	temp=n;
	while(n>0) {
		r=n%10;
		sum=(sum*10)+r;
		n=n/10;
	}
	if(temp==sum)
		System.out.println("palindrome'");
		else
			System.out.println("not palindrome");
	

}


	public static void main(String[] args) {
		samples obj=new samples();
		obj.reverse();

	}

}
