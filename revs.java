import java.io.*;
import java.util.*;

class revs
{
	public static void main(String ar[])
	{
		String str="sms";
		String rev="";
		for(char c:str.toCharArray())
		{
			rev=c+rev;
		}
		System.out.println(rev);
		System.out.println("String Compair : "+str.equals(rev)); 
	}
}
