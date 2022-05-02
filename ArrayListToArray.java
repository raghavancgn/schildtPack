package schildtPack;

import java.util.*;
// Convert an Array List to Array
public class ArrayListToArray {
	public static void main(String[] args) {
		//Create an array list.
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		// Add elements to the array list.
		a1.add(1);
		a1.add(2);
		a1.add(3);
		a1.add(4);
		
		System.out.println("Contents of a1: " + a1);
		
		//Get the array
		Integer ia[] = new Integer[a1.size()];
		ia = a1.toArray(ia);
		
		int sum = 0;
		
		//Sum the array
		for(int i : ia) sum += i;
		System.out.println("Sum is: " + sum);
	}
}