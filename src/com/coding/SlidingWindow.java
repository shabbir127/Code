package com.coding;

import java.util.HashMap;
import java.util.Map;

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
	
/*You are given a string s consisting only lowercase alphabets and an integer k. 
 * Your task is to find the length of the longest substring that contains exactly k distinct characters.
Note : If no such substring exists, return -1. 
Examples:
Input: s = "aabacbebebe", k = 3
Output: 7
Explanation: The longest substring with exactly 3 distinct characters is "cbebebe", which includes 'c', 'b', and 'e'. */
	
	 public static int longestKSubstr(String s, int k) {
	        // code here
		 int low=0;
		 int res=-1;
		 
		 Map<Character, Integer> map=new HashMap<>();
		 for(int high=0;high<s.length();high++) {
			 
			 char ch=s.charAt(high);
			 map.put(ch,map.getOrDefault(ch, 0)+1);
			 while(map.size() > k)
			 {
				 char left=s.charAt(low);
				 map.put(left, map.get(left)-1);
				 if(map.get(left)==0)
				 {
					 map.remove(left);
					
				 }	
				 low++;	 
			 }
				 
				 //equal k vaule....
				 if(map.size()==k)
				 {
					 res=Math.max(res,high-low+1);
				 }
			 
		 }
		 
		 return res;
	 }
	
public static void main(String[] args) {
	int arr[]= {100, 200, 300, 400};
	int size=2;
	System.out.println(maxSubarraySum(arr, size));
	System.out.println(minSubArrayLen(7,new int[] {2,3,1,2,4,3}));
	System.out.println(longestKSubstr("aabacbebebe", 3));
}
}
