import Animals.Puppy;
import Utils.*;
public class Driver
{
	public static void main(String[] args)
	{
		Puppy p1=new Puppy("Joey");
		Puppy p2=new Puppy("Chandler");
		Puppy p3=new Puppy("Ross");
		System.out.println(p1.getName());
		System.out.println(p2.getName());
		System.out.println(p3.getName());
		ArrayUtils a=new ArrayUtils();
		System.out.println(a.stringifyArray(a.reverse({9, 20, 3, 44, 88, 300})));
		Math f=new Math();
		double num=15.4;
		System.out.println(f.factorial((int) num));
	}
}