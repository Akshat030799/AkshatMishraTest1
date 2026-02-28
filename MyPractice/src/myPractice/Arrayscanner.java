package myPractice;

import java.util.Arrays;
import java.util.Scanner;

public class Arrayscanner {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int Value= sc.nextInt();
 int a[]=new int[Value];
 
 for (int i=0;i<a.length;i++) {
	
	System.out.println("Enter the values"); 
 a[i]= sc.nextInt();
	 
 }
System.out.println(Arrays.toString(a));

for(int i=0;i<Value/2;i++) {
	
	int tem=a[i];//11
	a[i]=a[Value-1-i];
	a[Value-1-i]=tem;
}
System.out.println(Arrays.toString(a));


	}

}
