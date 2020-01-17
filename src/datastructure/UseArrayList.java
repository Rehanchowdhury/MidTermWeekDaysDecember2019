package datastructure;

import java.util.ArrayList;
import java.util.Iterator;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */
		ArrayList<Integer> myArrayList = new ArrayList<>(2);

		myArrayList.add(5);
		myArrayList.add(10);
		myArrayList.add(15);
		myArrayList.add(20);
	    myArrayList.add(25);


		System.out.println("The ArrayList items by using For Each:");
		for(Integer item:myArrayList)
			System.out.println(item);

		// Retrieving data using iterator

		System.out.println("The ArrayList items by using iterator interface:");

		Iterator iterator = myArrayList.iterator();

		while(iterator.hasNext())
			System.out.println(iterator.next());

		myArrayList.remove(Integer.valueOf(20));
		System.out.println("Removed 20. Now the ArrayList content is:");
		for(Integer item: myArrayList)
			System.out.println(item);

		System.out.println("Retrieving element at index 3: " + myArrayList.get(3));
	}


}


