package basic_programs;

//

import java.util.Scanner;

public class AverageValueOfArray {

	public static void main(String[] args) {
		
		Scanner scr=new Scanner(System.in);
		
		System.out.println("Enter the number of elements: ");
		
		int n=scr.nextInt();
		
		int[] arr=new int[n];
		
		int sum=0;
		
		System.out.println("Enter the "+n+" number:");
		
		for(int i=0;i<n;i++) {
			arr[i]=scr.nextInt();
			sum+=arr[i];
		}
		
		double average=sum/n;
		
		System.out.println("Average value of Array is: "+average);

	}

}
