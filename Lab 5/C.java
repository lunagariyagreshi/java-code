// There is an integer array nums sorted in ascending order (with distinct values). 
// Prior to being passed to your function, nums is possibly rotated at an unknown pivot 
// index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., 
// nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] 
// might be rotated at pivot index 3 and become [4,5,6,7,0,1,2]. 
// Given the array nums after the possible rotation and an integer target, return the 
// index of target if it is in nums, or -1 if it is not in nums.[C] 
// Example 1: 
// Input: nums = [4,5,6,7,0,1,2], target = 0 
// Output: 4 
// Example 2: 
// Input: nums = [4,5,6,7,0,1,2], target = 3 
// Output: -1

import java.util.*;
public class C{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the size of array ");
		int n=sc.nextInt();
		int a[] = new int[n];
		int i,j;
		int index=0;
		for(i=0;i<a.length;i++){
			System.out.println("enter element ");
			a[i] = sc.nextInt();
		}
		for(i=0;i<a.length;i++){
			for(j=i+1;j<a.length;j++){
			if(a[i]>a[j]){
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		  }
		}
		System.out.println("sorted array is = ");
		for(i=0;i<a.length;i++){
			System.out.print(a[i]);
		}
		
		 System.out.println("Enter the target number ");
		int target = sc.nextInt();
		for(i=0;i<a.length;i++){
			if(a[i]==target){
				System.out.println("Target number is on index = "+i);
			    index=i;
				break;
			}
		}
		System.out.print("After rotete array ");
		for(i=index;i<a.length;i++){
			System.out.print(a[i]);
		}
		for(i=0;i<index;i++){
			System.out.print(a[i]);
		}
		
	}
} 
