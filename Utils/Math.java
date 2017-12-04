package Utils;
public class Math
{
	public static int factorial(int n)
	{
		if(n<=1)
			return 1;
		return n*factorial(n-1);
	};
	public static int factorialLoop(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
			fact*=i;
		return fact;
	}
}