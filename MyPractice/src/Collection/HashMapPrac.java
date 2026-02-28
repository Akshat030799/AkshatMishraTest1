package Collection;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapPrac {

	public static void main(String[] args) {
		HashMap<Integer, String> hp=new HashMap<Integer, String>();
		
		hp. put(101,"akshat");
		hp. put(102,"Aakarsh");
		hp. put(103,"Meeta");
		hp. put(104,"Geeta");
		hp. put(105,"sumit");
		System.out.println(hp);
		System.out.println(hp.keySet());
		System.out.println(hp.values());
		System.out.println(hp.entrySet());
		
		for (int k: hp.keySet()) {
			
			System.out.println(k+"   "+ hp.get(k));
		}
		
		Iterator< Map.Entry <Integer, String>> it= hp.entrySet().iterator();
		while (it.hasNext()) {
			
			Map.Entry <Integer, String> entry=it.next();
			System.out.println("Iterator  -  "+entry.getKey()+"  "+ entry.getValue());
		}
	}

}
