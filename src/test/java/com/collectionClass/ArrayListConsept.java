package com.collectionClass;
import java.util.ArrayList;
import java.util.Iterator;

import org.testng.annotations.Test;
public class ArrayListConsept {
	
	    @Test
	    public  void main() {
		int a [] = new int [3];     // static array size is fixed
		
		// Dynamic array -- Array list
		// 1. can contain duplicate values/ Element
		// 2. Maintain insertion order
		// 3. synchronization
		// 4. Allows random access to fetch the element because it stores the values on the basis of index
		
		
		
		
		 //Hash map is an implements map interface
		   //Extends Abstract Map
		   //It contains only unique elements
		   //Store the values key value pair
		   //It may have one null key and multiple null values
		   //It maintains no order
		   //Hash is non-synchronized – not thread safe
		   //Concurrent modification exception – fail – fast condition 
		 
		 ArrayList ar = new ArrayList();
		 ar.add(10); // 0
		 ar.add(20); // 1
		 ar.add(30); // 2
		 
		 System.out.println(ar.size()); // yellow means non generic array list object
		 
		 ar.add(40);     // 3
		 ar.add(50);     // 4
		 ar.add(60);     // 5
		 ar.add(12.33);  // 6
		 ar.add("Test"); // 7
		 ar.add("a");    // 8
		 ar.add(true);   // 9
		 
		 System.out.println(ar.size()); // size of array list
		 System.out.println(ar.get(4)); // to get the value from an index
		 
		 // to print all the values from array list/ array: so use:
		 //1. for loop
		 //2. using iterator
		 for(int i=0; i<ar.size(); i++) {
		 System.out.println(ar.get(i));
		 }
	 // non generic vs generic
		 ArrayList<Integer> ar1 = new ArrayList<Integer>();
		 ar1.add(100);
		// this is call generic that means which data type i define inside <data type>
		// its not support after jdk 1.5
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("test");
		ar2.add("selenium");
		
		//ArrayList<E> ar3 = new ArrayList<E>();
		
		
		System.out.println("************");
		// ArrayListEmployee class object:
		
		ArrayListEmployee e1 = new ArrayListEmployee("alam", 38, "QA");
		ArrayListEmployee e2 = new ArrayListEmployee("ahad", 48, "Dev");
		ArrayListEmployee e3 = new ArrayListEmployee("Izaz", 24, "qa");
		
		// create array list:  its generic 
		
		ArrayList<ArrayListEmployee> ar4 = new ArrayList<ArrayListEmployee>();
	    ar4.add(e1);
	    ar4.add(e2);
	    ar4.add(e3);
	    
	    // Iterator to traverse the values:
	    
	    Iterator<ArrayListEmployee> it = ar4.iterator();
	    while(it.hasNext()) {
	    ArrayListEmployee emp = it.next();
	    System.out.println(emp.name);
	    System.out.println(emp.age);
	    System.out.println(emp.dept);
	    }
	    System.out.println("************");
	    // addAll() method functions
	    ArrayList<String> ar5 = new ArrayList<String>();
		ar5.add("test");
		ar5.add("selenium");
		ar5.add("QTP");
		
		ArrayList<String> ar6 = new ArrayList<String>();
		ar6.add("dev");
		ar6.add("java");
		ar6.add("javaScript");
		 
		ar5.addAll(ar6); // this is addAll()  method connect between first value and sceand value
		 
		for(int i = 0; i<ar5.size(); i++) {
		System.out.println(ar5.get(i));
		}
		
		System.out.println("************");
		// removeAll
	    ar5.removeAll(ar6);
	    for(int i = 0; i<ar5.size(); i++) {
		System.out.println(ar5.get(i));
		}
	    System.out.println("************");
	    
        // retainAll()method give only common Element  
	    ArrayList<String> ar7 = new ArrayList<String>();
	    ar7.add("test");
		ar7.add("selenium");
		ar7.add("QTP");
		
		ArrayList<String> ar8 = new ArrayList<String>();
		ar8.add("test");
		ar8.add("java");
		ar8.add("javaScript");
		
		ar7.retainAll(ar8);
		for(int i = 0; i<ar7.size(); i++) {
		System.out.println(ar7.get(i));
	    }}}
