package com.iamsemicolon.myslate;
/**
 * Given an array of integers, every element appears twice except for one. Find that single one.
 *
 */

public class SingleNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {2,2,1,1,5,5,-1,6,6,3,3,8,8,7,7};
		System.out.println( "Number :: " + singleNumber(num));
	}
	
	public static int singleNumber(int[] A) {
        int res=0;
        for(int i=0;i<A.length;i++){
        	res=res^A[i];
        	System.out.println(res);
        }
        return res;
    }
	
	private static int findSingleNumber(int[] arr)
	{
		if(null == arr || arr.length < 2)
			return 0;
		
		int prev;
		int next;
		int curr;
		for(int i=0; i < arr.length; i=i+2)
		{
			if(i+1 > arr.length && arr[i] != arr[i-1])
				return arr[i];
			curr = arr[i];
			prev = arr[i+1];
			System.out.println("i : "+i+" curr: " + curr + " prev : " + prev);
			if(curr != prev)
			{
				System.out.println("found number "+ prev + "at " + (i-1)  );
				return prev;
			}
		}
		return 0;
	}

}
