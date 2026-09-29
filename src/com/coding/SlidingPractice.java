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
	
	
	public static int minsubArray(int arr[],int target)
	{
		int low=0;
	
		int sum=0;
		int result=Integer.MAX_VALUE;
		
		//while(high < arr.length)
			for(int high=0;high < arr.length;high++)
		{
			sum=sum+arr[high];
			while(sum >=target)
			{
				int len=high-low+1;
				result=Math.min(result, len);
				sum=sum-arr[low];
				low++;
			}
		high++;
		}
		 return result ;
		
	}
	
	

	
	

	public static void main(String[] args) {
		int arr[]= {100,200,300,400};
		int num[]= {2,3,1,2,4,3};
	    System.out.println(maxSubArray(arr, 2));
		System.out.println(minsubArray(num, 7));
		
	}
}
