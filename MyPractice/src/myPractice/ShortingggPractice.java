package myPractice;

import java.util.Scanner;

public class ShortingggPractice {

	public static void main(String[] args) {
		int a[]={22,25,28,89
			,95,58,74,58};
		
		Scanner sc= new Scanner(System.in);
		
		
		int desiredoutput=sc.nextInt();
		boolean val=false;
		System.out.println("Length of array  -"+a.length);
		
		for(int storedval: a) {
			
			if(storedval==desiredoutput) {
				
				System.out.println("its a match");
				System.out.println(storedval);
				val=true;
				break;
				
			}}
			
		if (val==false) {
			System.out.println("Not MAatch");
		}
		}

	}

