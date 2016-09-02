package Guvi;

import java.util.Scanner;

public class StrToInt 
{
	public static void main(String[] args) 
	{

		String s = "100";

		try 
		{
			int i = Integer.parseInt(s);
			System.out.println(+i);
		} 
		catch (NumberFormatException e) 
		{
			System.out.println("NumberFormatException: " + e.getMessage());
		}
	}
}
