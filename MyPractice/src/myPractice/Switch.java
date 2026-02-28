package myPractice;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No");
	int k=sc.nextInt();
switch (k) {

case 1: System.out.println("Jan");break;
case 2: System.out.println("Feb");break;
case 3: System.out.println("Mar");break;
case 4: System.out.println("Jun");break;
case 5: System.out.println("Jul");break;
case 6: System.out.println("Ag");break;
case 7: System.out.println("Sep");break;
default: System.out.println("iNAVL");
}
System.out.println("Enter 2nd No");
int y=sc.nextInt();

switch (y) {

case 1:{ System.out.print("Jan");
System.out.println("Uray");
break;}

case 2: System.out.println("Feb");break;
case 3: System.out.println("Mar");break;
case 4: System.out.println("Jun");break;
case 5: System.out.println("Jul");break;
case 6: System.out.println("Ag");break;
case 7: System.out.println("Sep");break;
default: System.out.println("iNAVL");
}

	
	
	
	}

	}

