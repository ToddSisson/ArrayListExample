package test;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<Integer> arrayListEx = new ArrayList<Integer>();
		
		arrayListEx.add(10);
		arrayListEx.add(20);
		arrayListEx.add(30);
		
		
		for (int x: arrayListEx){
			System.out.println(x);
		}
		
		System.out.println();
		arrayListEx.set(1, 25);
		
		for (int x: arrayListEx){
			System.out.println(x);
		}

	}

}
