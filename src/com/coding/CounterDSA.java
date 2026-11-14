package com.coding;

import java.util.Arrays;

public class CounterDSA {
	
	public static int[] TwoSum(int arr[], int target)
	{
		//2,7,11,15 ---> 
		int left=0;
		int right=arr.length-1;
		
		while(left < right)
		{
			int sum=arr[left]+arr[right];
			if(sum == target)
			{
				return new int[] {left+1 , right+1};
			}else if (sum < target) {
				left++;
			}else {
				right--;
			}
		}
		
		return new int[] {-1,-1};
	}
	
	public static void main(String[] args) {
		
		int arr[]= {2,7,11,15};
		int result[]=TwoSum(arr, 13);
		System.out.println(Arrays.toString(result));
		
	}

}
