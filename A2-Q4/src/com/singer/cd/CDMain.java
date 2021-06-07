package com.singer.cd;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class CDMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<CD> cds = new TreeSet<CD>(new sortBySingerName());
		cds.add(new CD("Positions", "Ariana Grande"));
		cds.add(new CD("Baby", "Justin Beiber"));
		cds.add(new CD("Attention", "Charlie Puth"));
		cds.add(new CD("Smelly Cat", "Phoebe"));
		
		System.out.println("----Just Printing Tree----");
		System.out.println(cds);
		
		System.out.println("Traversal Using for each loop");
		for(CD element: cds){
			System.out.println(element);
		}
		System.out.println("Traversal using iterator");
		Iterator<CD> itr = cds.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
	}

}
