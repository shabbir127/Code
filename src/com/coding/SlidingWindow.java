package com.coding;

/*Input: arr[] = [100, 200, 300, 400], k = 2
Output: 700
Explanation: arr2 + arr3 = 700, which is maximum */

public class SlidingWindow {

	public static int maxSubarraySum(int[] arr, int k) {
		
		int low=0;
		int high=k-1;
		int sum=0;
		int res=0;
		
		for(int i=low;i<=high;i++)
		{
			sum=sum +arr[i];
			
		}
		    while(high < arr.length)
			   {
				res=Math.max(res,sum);
				low++;
				high++;
				sum=sum- arr[low-1];
				if(high == arr.length)
				{
					break;
				}
				sum=sum +arr[high];
				
			  }	
		return res;
	}
	/*
	 Input: target = 7, nums = [2,3,1,2,4,3]
Output: 2
Explanation: The subarray [4,3] has the minimal length under the problem constraint.
	  */
	
	public static int minSubArrayLen(int target, int[] nums) {
		
		int low=0;
		int high=0;
		int sum=0;
		int res=Integer.MAX_VALUE;
		
		while(high < nums.length)
		{
			sum=sum+nums[high];
			while(sum >= target)
			{
				int len=high-low+1;
				res=Math.min(res, len);
				sum=sum-nums[low];
				low++;			
			}
			high++;
		}
		if (res== Integer.MAX_VALUE) {
			return 0;
		}
	return res;
		
	}
	
public static void main(String[] args) {
	int arr[]= {100, 200, 300, 400};
	int size=2;
	System.out.println(maxSubarraySum(arr, size));
	
	System.out.println(minSubArrayLen(7,new int[] {2,3,1,2,4,3}));
}
}
