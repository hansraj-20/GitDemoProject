package com.cjc;

import java.util.ArrayList;
import java.util.Iterator;

public class A {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList();
		al.add(5);
		al.add(10);
		al.add(15);
		al.add(20); 

		Iterator itr =al.iterator();
		while(itr.hasNext()) 
		{
			int i = (int)itr.next();
			System.out.println(i);
		}
	}
}