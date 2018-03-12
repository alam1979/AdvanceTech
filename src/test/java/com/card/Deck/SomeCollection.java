package com.card.Deck;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SomeCollection {

	    public static void main(String[] args) {
 	/*	List<String> aListDays = new ArrayList<String>();
		aListDays.add("Sunday");
		aListDays.add("Monday");
		aListDays.add("Tuesday");
		aListDays.add("Sunday"); //duplicate
		aListDays.add("Wednesday");
		aListDays =  aListDays.stream().distinct().collect(Collectors.toList());
		System.out.println(aListDays);}}*/

/*	     	ArrayList aList = new ArrayList();
	    	//Add elements to ArrayList object
	    	aList.add("1"); 
	    	aList.add("2"); 
	    	aList.add("3");
	    	aList.add("4");
	    	aList.add("5");
	    	Collections.reverse(aList);
	    	System.out.println("After Reverse Order, ArrayList Contains :" + aList);*/

	/*      int[] numbers = new int[]{1,2,3,4,5,6,7,8,9,10};
	    	for(int i=0; i < numbers.length; i++){
	    	//* use modulus operator to check if the number is even or odd.
	    	//* If we divide any number by 2 and reminder is 0 then the number is
	    	//* even, otherwise it is odd.
	    	if(numbers[i]%2 == 0)
	    	System.out.println(numbers[i] + " is even number.");  else
	    	System.out.println(numbers[i] + " is odd number.");*/

     /*     int limit = 30; //define limit
            System.out.println("Prime numbers between 1 and " + limit);
            //loop through the numbers one by one
            for(int i=1; i < 30; i++) { boolean isPrime = true;
            //check to see if the number is prime
            for(int j=2; j < i ; j++) { if(i % j == 0){ isPrime = false; break; }}
            // print the number
            if(isPrime) System.out.print(i + " ");}}}*/
	    	
	    	Double [] decMax = {-2.8, -8.8, 2.3, 7.9, 4.1, -1.4, 11.3 };
	    	List<Double> a = new ArrayList<Double>(Arrays.asList(decMax));
	    	System.out.println("The highest maximum for the December is: " + Collections.max(a));
            System.out.println("The highest maximum for the December is: " + Collections.min(a));}}
              


