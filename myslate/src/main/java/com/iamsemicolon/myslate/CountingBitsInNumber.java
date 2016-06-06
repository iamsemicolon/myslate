package com.iamsemicolon.myslate;

/**
Given a non negative integer number num. For every numbers i in the range 0 ≤ i ≤ num calculate the number of 1's in their binary representation and return them as an array.

Example:
For num = 5 you should return [0,1,1,2,1,2]
https://leetcode.com/problems/counting-bits/
*/
public class CountingBitsInNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("countbits: " + countBits(10));
	}
	
	public static int[] countBits(int num) {
	    int[] result = new int[num+1];
	 
	    int p = 1; //p tracks the index for number x
	    int pow = 1;
	    for(int i=1; i<=num; i++)
	    {
	    	//System.out.println("before :: i:" + i + ", pow :" + pow + ", p:" + p);
	    	if(i==pow)
	        {
	            result[i] = 1;
	            pow <<= 1;
	            p = 1;
	        }
	        else
	        {
	            result[i] = result[p]+1;
	            p++;
	        }
	       // System.out.println("after : i:" + i + ", pow :" + pow + ", p:" + p +"\n");
	    }
	 
	    for(int i=0; i<result.length; i++)
	    {
	    	System.out.print(result[i] + " ");
	    }
	    return result;
	}

}
