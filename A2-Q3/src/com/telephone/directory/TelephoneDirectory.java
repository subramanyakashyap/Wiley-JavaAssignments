package com.telephone.directory;

import java.util.HashMap;
import java.util.Iterator;

public class TelephoneDirectory {
	public static void main(String[] args) {
		
		HashMap<String, Long> directory = new HashMap<String, Long>();
		
		directory.put("Ravi-Work", 9876543322l);
		directory.put("Ravi-Personal", 9876543322l);
		directory.put("Raj", 8985956456l);
		directory.put("Aarav", null);
		System.out.println("----Just printnig HashMap----");
		System.out.println(directory);
		System.out.println("----Using ForEach loop----");
		for(String key:directory.keySet()){
			System.out.println(key+"'s telephone number is "+directory.get(key));
		}
		System.out.println("----Using Iterator----");
		Iterator<String> itr = directory.keySet().iterator();
		while(itr.hasNext()){
			String key = itr.next();
			System.out.println(key+"'s number is "+directory.get(key));
		}
		
	}

}
