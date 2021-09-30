package com.arrays;

public class ReverseAnArray {

	public static void main(String[] args) {
		
		// primitive way (not recommended)
		int arr[] = {4, 5, 1, 2};
		for (int i = arr.length-1; i >= 0; i--) {
			 System.out.print(arr[i] + " ");
		}
		
		// better approach
		int temp ;
		int start = 0;
		int end = arr.length-1;
		while(start<end) {
			temp = arr[start]; //4
			arr[start]=arr[end];//
			arr[end]= temp;// [2,5,1,4]
			start ++;
			end--;
		}
		System.out.println("better approach");
		for (int i = 0; i < arr.length; i++) {
			 System.out.print(arr[i] + " ");
		
		}
	}
}
