package com.iamsemicolon.myslate;

/**
 * 
 * 
 * 
Write an algorithm to determine if a number is "happy".

A happy number is a number defined by the following process: 
Starting with any positive integer, replace the number by the sum of the squares of its digits, 
and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. 
Those numbers for which this process ends in 1 are happy numbers.

Example: 19 is a happy number

12 + 92 = 82
82 + 22 = 68
62 + 82 = 100
12 + 02 + 02 = 1

 * @author mevelu
 *
 */


public class HappyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getsum(11);
		System.out.println("done....");
	}

	public static boolean isHappyNumber(int n)
	{

		if(n <= 0) return false;



		return false;
	}

	private static int getsum(int num)
	{
		if(num < 0) return 0;
		if(num == 1) return 1;

		int[] numArr =  getNumArr(num);
		int sumVal = squaredSumOfNum(numArr);
		if(sumVal != 1 )
		{
			if(sumVal > 9)
			{
				getsum(sumVal);
			}
			else
			{
				return sumVal;
			}
		}
		return 1;
	}


	

	private static int[] getNumArr(int n)
	{
		int[] arr;
		if(n < 0)
		{
			return null;
		}
		if(n<=9)
		{
			arr = new int[1];
			arr[0] = n;
			return arr;
		}
		String numberInStr = ""+n;
		int l = numberInStr.length();
		int last, rval=l;
		arr  = new int[l];
		for(int i=0; i<l; i++)
		{
			arr[--rval] = n % 10;
			n  = n /10;
		}
		
		return arr;
	}
	
	
	private static int squaredSumOfNum(int[] numArr)
	{
		int sum = 0;
		for(int i=0; i<numArr.length; i++)
		{
			sum = sum + (numArr[i] * numArr[i]);
		}
		System.out.println("sq sum :"+ sum);
		return sum;
	}
}

