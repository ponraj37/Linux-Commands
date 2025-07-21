package basic_programs;

//Write a Java program to test if an array contains a specific value.

import java.util.Scanner;

public class ArrayContains {

	public static void main(String[] args) {
		
		Scanner scr=new Scanner(System.in);
		
		int[] array= {1,40,30,50,23,4,6,5,2,7};
		
		System.out.println("Enter the number: ");
		
		int target=scr.nextInt();
		
		boolean found=false;
		
		for(int i=0;i<array.length;i++) {
			if(array[i]==target) {
				found=true;
				break;
			}	
		}
		if(found){
			System.out.println("The array contains the value: " + target);
			
		}else {
			System.out.println("The array not contains the value: " + target);
		}

	}

}
