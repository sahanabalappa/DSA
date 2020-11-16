import java.util.*;
public class LinearSearch {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the element to be searched");
		int ele=sc.nextInt();
		int arr[]=new int[10];
		for(int i=0;i<10;i++)
		{
			arr[i]=sc.nextInt();
		}
		boolean b=LinearSearch(arr,ele);
		if(b==true)
		{
			System.out.println("element found");
		}
		else
		{
			System.out.println("element not found");
		}
	}
	public static boolean LinearSearch(int arr[],int ele)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(ele==arr[i])
			{
				return true;
			}
		}
		return false;
	}
}
