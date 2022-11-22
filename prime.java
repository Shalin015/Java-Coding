import java.io.*;
import java.util.*;

class prime
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int flag=0;
		if(a==0 || a==1)
		{
			System.out.println("Is not prime number :");
			flag=1;
		}
		else if(a%2==0) 
		{
			if(a==2)
			{
				flag=0;
			}
			else
			{
				System.out.println("Is not prime number");
				flag=1;
			}
		}
		if(flag==0)
		{
			System.out.println("Is a prime number");
		}
	}
}