package com.collectionClass;

import java.util.HashMap;
import java.util.Map.Entry;
import org.testng.annotations.Test;

       public class HashMapClass {
	   //Hash map is an implements map interface
	   //Extends Abstract Map
	   //It contains only unique elements
	   //Store the values key value pair
	   //It may have one null key and multiple null values
	   //It maintains no order
	   //Hash is non-synchronized – not thread safe
	   //Concurrent modification exception – fail – fast condition 

    	   
	    @Test
	    public void HashMaps() {
		HashMap	<Integer, String> hr = new HashMap	<Integer, String>();
		hr.put(1, "Selenium");
		hr.put(2, "QTP");
		hr.put(3, "TestComplet");
		hr.put(4, "RFT");
		
		// spesipic value
		System.out.println(hr.get(1));
		System.out.println(hr.get(4));
		
		//Loop for all velues
		for(Entry m : hr.entrySet()) {
		System.out.println(m.getKey()+ ""+ m.getValue());
		}
		System.out.println(hr);
		hr.remove(3);
		System.out.println(hr);
		//System.out.println("***************done*****************");
		
		
	    HashMap<Integer, ArrayListEmployee> emp = new HashMap<Integer, ArrayListEmployee>();
	    ArrayListEmployee e1 = new ArrayListEmployee("Tom", 25, "admin"); 
	    ArrayListEmployee e2 = new ArrayListEmployee("Petter", 26, "QA"); 
	    ArrayListEmployee e3 = new ArrayListEmployee("Alam", 27, "Dev");
	    
	    
	    emp.put(1, e1);
	    emp.put(2, e2);
	    emp.put(3, e3);
	    
	    for(Entry<Integer,ArrayListEmployee> m : emp.entrySet()) {
	    	int key =m.getKey();
	    	ArrayListEmployee e = m.getValue();
	    	System.out.println(key + "Info");
	    	System.out.println(e.name);
	    	
	    }
	     
        }}
