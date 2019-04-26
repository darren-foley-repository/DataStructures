package com.darren.foley;

import com.darren.foley.Node;
import com.darren.foley.LinkedList;

public class Main {

	public static void main(String[] args) {
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
		LinkedList<Integer> int_list = new LinkedList<Integer>();
		
		int_list.getLastItem();
		
		int_list.add(4);
		
		System.out.println(int_list.getLastItem().getData());
	}

}
