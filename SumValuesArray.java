package basic_programs;

// Write a Java program to sum values of an array.

import java.util.Scanner;

public class SumValuesArray {

	public static void main(String[] args) {
		
		Scanner scr=new Scanner(System.in);
		
		System.out.println("Enter number of elements: ");
		
		int n=scr.nextInt();
		
		int[] arr=new int[n];
		
		int sum=0;
		
		System.out.println("Enter the "+n+" Number: ");
		
		for(int i=0;i<n;i++) {
			arr[i]=scr.nextInt();
			sum+=arr[i];
		}
		
		System.out.println("Sum values of Array is: "+sum);

	}

}
