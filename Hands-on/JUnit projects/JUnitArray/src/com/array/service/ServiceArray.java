package com.array.service;

public class ServiceArray {
	public int arraymax(int arr[]) {
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		return max;
	}

}
