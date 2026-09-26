package com.coding;

public class SlidingPractice {
	
	public static int maxSubArray(int arr[],int k)
	{
		int low=0;
		int high=k-1;
		int sum=0;
		int result=Integer.MIN_VALUE;
		
		for(int i=0;i<=high;i++)
		{
			sum=sum+arr[i];
		}
		while(high < arr.length)
		{
			result=Math.max(sum, result);
			low++;
			high++;
			
			sum=sum-arr[low-1];
			if(high == arr.length)
			{
				break;
			}
			sum=sum+arr[high];
		}
		
		
		return result;
	}

	public static void main(String[] args) {
		int arr[]= {100,200,300,400};
	    System.out.println(maxSubArray(arr, 2));
		
		
	}
}
