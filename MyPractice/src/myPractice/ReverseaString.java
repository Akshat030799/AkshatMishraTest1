package myPractice;

import java.util.Scanner;

public class ReverseaString {
	public String HoldString(String name) {
		
		
		return("Akshat"+name);
		
		
	}
	public void Reverse() 
	
	{
		Scanner sc= new Scanner(System.in);
		String Output="", put="";
		System.out.println("Enter String");String Input=sc.next();
		
		for(int i=Input.length()-1;i>=0;i--) {
			Output=Output+Input.charAt(i);
			
		}
		System.out.println(Output);
		
		char a[]=Input.toCharArray();
		for(int i=a.length-1;i>=0;i--) {
			put=put+a[i];
			
		}
		System.out.println(put);
		
		Input=Input.concat(put);
		System.out.println(Input);

		
		
	}

}
