package basic_programs;

//Write a Java program to sort a numeric array and a string array.

import java.util.Arrays;
import java.util.Scanner;

public class SortNumericString {

	Scanner scr=new Scanner(System.in);
	
	public static void main(String[] args) {
		
		SortNumericString Numeric=new SortNumericString();
		
		Numeric.numericArray();
		
		Numeric.stringArray();
		

	}
	
	public void numericArray() {
		
		System.out.println("Enter the number of elements: ");
		
		int n=scr.nextInt();
		
		int[] arr=new int[n];
		
		System.out.println("Enter the "+n+" numbers:");
		
		for(int i=0;i<n;i++) {
			arr[i]=scr.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
		
	}
	
	public void stringArray() {
		
		System.out.println("Enter the number of String elements: ");
		
		int n=scr.nextInt();
		
		String[] arr=new String[n];
		
		System.out.println("Enter the "+n+" String: ");
		
		for(int i=0;i<n;i++) {
			arr[i]=scr.next();
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-1-i;j++) {
				if(arr[j].compareTo(arr[j+1])>0) {
					String temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
		
	}

}
