package com.darren.foley;

import com.darren.foley.Node;
import com.darren.foley.LinkedList;

public class Main {

	public static void main(String[] args) {
		LinkedList<String> string_list = new LinkedList<String>();
		
		string_list.add("Darren");
		string_list.add("Foley");
		string_list.add("Strings here 1");
		string_list.add("Strings here 2");
		string_list.add("Strings here 3");
		string_list.add("Strings here 4");
		
		
		string_list.print();
	}

}
