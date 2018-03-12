package com.collectionClass;



public class ArrayLoop {
	
	public static void main(String[] args) {

	
	
   //int sum = 0;
   //int c [] = { 2, 4, 6, 8, 9, 11, 12 };
  // for (int i = 0; i<c.length; i++) {
	   
  //System.out.println(c[i]); // this line print  all values 2, 4, 6, 8, 9

    //sum = sum + c [i]; }
    // System.out.println(sum); // this line print all values Equals (29)
	
  // if (c[i]==8) {
  //System.out.println(i);  // this line for how to print index like 1 numbers
	 
	//   System.out.println(c[i]);
	//  if (c[i]==8) {
	//  break;  // this line for how to break loop 
		
/*		
		int a [][] = new int [2] [3];
		a[0][0]=2;
		a[0][1]=4;
		a[0][2]=5;
		
		a[1][0]=3;
		a[1][1]=4;
		a[1][2]=7;
		//System.out.println(a[1][0]);}
		
		//int b [][]= {{2,4,5},{3,4,7}};
		//System.out.println(a[1][0]);
		
		for (int i = 0; i<2; i++) { // outer loop stands for row
		for (int j= 0; j<3; j++) {  // inner loop stands for column
			
		System.out.println(a[i][j]);
			}}
		}} */
		
	/*	int b [][]= {{6,4,5},{3,4,7}, {9,0,1}}; // this fashion for find minimum number
		int min = b[0][0];
		for (int i = 0; i<3; i++) { // outer loop stands for row
		for (int j= 0; j<3; j++) { // inner loop stands for column
		if (b[i][j]<min) {
		min=b[i][j]; 
		}}}
		System.out.println(min);
		}}*/
		
		int b [][]= {{6,4,5},{3,4,7}, {9,0,1}};
		int min = b[0][0];
		int mincolumn = 0;
		for (int i = 0; i<3; i++) { // outer loop stands for row
		for (int j= 0; j<3; j++) { // inner loop stands for column
		if (b[i][j]<min) {
		min=b[i][j]; 
		mincolumn = j;
		}}}
		int max = b [0][mincolumn];
		int k = 0;
		while(k<3)
		{
		if (b[k][mincolumn]>max)
		{
		max=b[k][mincolumn];
		}
		k++;
	    }
        System.out.println(max);

	   }}
		



