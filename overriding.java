package hemana;


class overriding {
	void run()
	{
		System.out.println("runnning");
	}
}
class splender extends overriding
{
	void run()
	{
		System.out.println(" running safely  with  60kn");
	}}
class testridig{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		overriding b=new splender();
		b.run();
	}

}



//online la run aguthu