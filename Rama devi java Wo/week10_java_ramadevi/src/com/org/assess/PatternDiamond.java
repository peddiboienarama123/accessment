package com.org.assess;

public class PatternDiamond {

	public static void main(String[] args) {
		int n=9;
		int spaces=(n/2);
		int stars=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=spaces;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=stars;k++)
			{
				System.out.print("*");
			
			}
			if(i<=n/2)
			{
				stars+=2;
				spaces--;
			}
			else
			{
				stars-=2;
				spaces++;
			}
			System.out.println();
		}
	}

}
