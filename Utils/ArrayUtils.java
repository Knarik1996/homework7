package Utils;
public class ArrayUtils
{
	public static int reverse(int[] arr)
	{
		int[] rev=new int[arr.length];
		for(int i=arr.length-1;i>=0;i--)
		{
			rev[arr.length-1-i]=arr[i];
		}
		return rev;
	};
	public static stringifyArray(int[] arr1)
	{
		String concat;
		for(int i=0;i<arr1.length-2;i++)
		{
			concat=arr1[i]+", ";
		}
		return concat+arr1[arr1.length-1];
	}
}