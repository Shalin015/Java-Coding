//find the number the can only divide by 3 & 5
import java.io.*;
import java.util.*;

class div
{
	public static void main(String ar[])
	{
		int a,b,c;
		for(int i=0; i<=100; i++)
		{
			if(i%3==0 && i%5==0)
			{
				System.out.println(i);
			}
		}
	}
}