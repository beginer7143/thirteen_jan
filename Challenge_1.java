/*
Coding Challenge 1:
Problem Statement:
 Given an integer array and a number X, check whether X is present in the array.
Input:
●	First line: Integer N (size of array)
●	Second line: N space-separated integers
●	Third line: Integer X
Output:
●	Print "Found" if element exists, else "Not Found"

*/
package thirteen_jan;

import java.util.Scanner;

public class Challenge_1 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);	
	
	System.out.print("Size of Array: ");
	int size = sc.nextInt();
	
	int arr[] = new int[size];
//	int arr[] = {1,2,5,7,9,54,66,25,52,65,48,13,24,86,71,3,85,46,89,468,0};
	System.out.println("Enter Array Elements : ");
	for(int i=0;i<size; i++) {
		arr[i] = sc.nextInt();
	}
	System.out.print("Enter X: ");
	int x=sc.nextInt();
	
	for(int i=0; i < arr.length;i++) {
		if(arr[i] == x) {
			System.out.println("Foun!"+arr[i]);
		} else {
			System.out.println("Not Found!");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	sc.close();
	}
}