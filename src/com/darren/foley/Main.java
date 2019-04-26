package com.darren.foley;

import com.darren.foley.Node;
import com.darren.foley.LinkedList;

public class Main {

	public static void main(String[] args) {
		// Test1
		/*
		LinkedList<String> string_list = new LinkedList<String>();
		
		string_list.add("Darren");
		string_list.add("Foley");
		string_list.add("Strings here 1");
		string_list.add("Strings here 2");
		string_list.add("Strings here 3");
		string_list.add("Strings here 4");
		
		
		string_list.print();
		
		string_list.remove();
		string_list.remove();
		string_list.remove();
		
		System.out.println("");
		
		string_list.print();
		
		string_list.add("Strings here 5");
		
		System.out.println("");
		
		string_list.print();
		*/
		
		// Test2
		/*
		LinkedList<Integer> int_list = new LinkedList<Integer>();
		
		int_list.getLastItem();
		
		int_list.add(4);
		
		System.out.println(int_list.getLastItem().getData());
		*/
		
		// Test 3
		/*
		String[] a = new String[] {"1","2","3","4"};
		
		LinkedList<String> str_list = new LinkedList<String>(a);
		
		str_list.print();
		
		str_list.remove();
		
		System.out.println("");
		
		str_list.print();
		*/
		
		// Test 4
		
		/*
		Integer[] n = new Integer[] {1,2,3,4,5,6};
		LinkedList<Integer> lst = new LinkedList<Integer>(n);
		lst.add(10);
		lst.add(100);
		
		lst.print();
		
		System.out.println("");
		
		lst.remove(); // Removes 100
		
		System.out.println(lst.get(3).getData()); //returns 4
		System.out.println("");
		
		lst.print();
		*/
		
		// Test 5
		/*
		Integer[] n = new Integer[] {1,2,3,4,5,6};
		LinkedList<Integer> lst = new LinkedList<Integer>(n);
		
		lst.print();
		
		lst.remove(1);
		
		System.out.println("");
		
		lst.print();
		
		System.out.println("");
		
		lst.remove(2);
		
		System.out.println("");
		
		lst.print();
		*/
		
		// Test 6
		
		Integer[] n = new Integer[] {1,2,3,4,5,6};
		LinkedList<Integer> lst = new LinkedList<Integer>(n);
		
		lst.print();
		
		System.out.println("");
		
		lst.add(10, 1);
		
		lst.print();
		
		System.out.println("");
		
		lst.add(100, 4);
		
		lst.print();
	}

}
