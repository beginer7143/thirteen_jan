/*
Coding Challenge 2:
Problem Statement:
 Find the second largest distinct element in the array.
Input:
●	N
●	N integers
Output:
●	Second largest element

*/
package thirteen_jan;

import java.util.Scanner;

public class Challenge_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter N: ");
		int n=sc.nextInt();
		
		int arr[] = new int[n];
		System.out.println("Enter Array Elements : ");
		for(int i=0; i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		int large=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]<arr[i++]) {
				large +=arr[i];
				System.out.println("Large number : "+large);
			}
		}
		sc.close();
	}
}
