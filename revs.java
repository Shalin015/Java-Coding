import java.io.*;
import java.util.*;

class revs
{
	public static void main(String ar[])
	{
		String a="sms";
		String rev="";
		for(char c:a.toCharArray())
		{
			rev=c+rev;
		}
		System.out.println(rev);
		
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}
}