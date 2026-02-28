package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListProg {

	public static void main(String[] args) {
		ArrayList<String> abcd=new ArrayList();
		abcd.add("abc:");
		abcd.add("10");
		abcd.add("7");
		abcd.add("jjj");
		abcd.add("17870");
		abcd.add("788");
		abcd.add("c:");
		abcd.add("1165480");
		abcd.add("725");
		System.out.println(abcd+" "+abcd.size());
		System.out.println(abcd.get(2));
		System.out.println();
		
		System.out.println("First we can print");
		for(int i=0;i<abcd.size();i++) {
			System.out.println(abcd.get(i));
		}
		System.out.println();
		
		
		System.out.println("Second we can print");
		for(String x: abcd) {
			
			System.out.println(x);
		}
		System.out.println();
	
		
		System.out.println("Third we can print");
		Iterator<String> iter= abcd.iterator();
		while(iter.hasNext()) {
			
			System.out.println(iter.next());
		}
		
		
		System.out.println("");
		
		
		
		
		
		
		System.out.println("Practice we can print");
		ArrayList abcde=new ArrayList();
		abcde.add("akkkk");
		abcde.add(00);
		abcde.add("akkkhbujhbjhk");
		abcde.add(100);
		
		for(int i=0;i<abcde.size();i++) {
			
			System.out.println(abcde.get(i));
		}
		
		
		System.out.println(abcde);
		System.out.println(abcde.size());
		
		
		ArrayList<Integer>ab=new ArrayList();
		ab.add(5);
		ab.add(7);
		System.out.println(ab);
		for(int i: ab) {
			System.out.println(i);
		}
		
		
	}

}
