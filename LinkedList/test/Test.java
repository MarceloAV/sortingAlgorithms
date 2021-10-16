package test;

import java.util.ArrayList;

import linkedlist.IteratorLinkedList;
import linkedlist.LinkedList;

public class Test {

	public static void main(String[] args) {
		
		int limit = 10000;
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		long initialTime = System.currentTimeMillis();
		for (int i = 0; i < limit; i++) {
			arr.add(i);
		}
		System.out.println("ArrayList Adding Elements: " + (System.currentTimeMillis() - initialTime) + "ms");
		
		initialTime = System.currentTimeMillis();
		LinkedList<Integer> ll = new LinkedList<Integer>();
		for (int i = 0; i < limit; i++) {
			ll.add(i);
		}
		System.out.println("LinkedList Adding Elements: " + (System.currentTimeMillis() - initialTime) + "ms");
		
		initialTime = System.currentTimeMillis();
		for (int i = 0; i < arr.size(); i++) {
			arr.get(i);
		}
		System.out.println("ArrayList Reading Time: " + (System.currentTimeMillis() - initialTime) + "ms");
		
		initialTime = System.currentTimeMillis();
		for (int i = 0; i < ll.length(); i++) {
			ll.get(i);
		}
		
		System.out.println("LinkedList Reading Time: " + (System.currentTimeMillis() - initialTime) + "ms");
		
		IteratorLinkedList<Integer> iterator = ll.getIterator();
		initialTime = System.currentTimeMillis();
		while (iterator.hasNext()) {
			iterator.next();
		}

		System.out.println("LinkedList with Iterator Reading Time: " + (System.currentTimeMillis() - initialTime) + "ms");
	}

}
