package com.darren.foley;

import com.darren.foley.Node;
import com.darren.foley.LinkedList;

public class Main {

	public static void main(String[] args) {
		
		// Test1
		String[] s = {"a","b","c"};
		LinkedList<String> string_list = new LinkedList<String>(s);
		string_list.print();
		System.out.println("");
		System.out.println(string_list.size());
		System.out.println("");
		
		
		string_list.add("d");
		string_list.print();
		System.out.println("");
		System.out.println(string_list.size());
		System.out.println("");
		
		string_list.add("e");
		string_list.print();
		System.out.println("");
		System.out.println(string_list.size());
		System.out.println("");
		
		
		string_list.add("e", 2);
		string_list.print();
		System.out.println("");
		System.out.println(string_list.size());
		System.out.println("");
		
		
		System.out.println(string_list.get(2));
		System.out.println("");
		System.out.println(string_list.size());
		System.out.println("");
		
		
		string_list.remove();
		string_list.print();
		System.out.println("");
		System.out.println(string_list.size());
		System.out.println("");
		
		string_list.remove(2);
		string_list.print();
		System.out.println("");
		System.out.println(string_list.size());
		System.out.println("");
		
		
	}

}
