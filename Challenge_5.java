/*
Coding Challenge 5:
Problem Statement:
 Find the maximum sum of consecutive elements in the array.
Input:
●	N
●	N integers
Output:
●	Maximum sum

*/
package thirteen_jan;

import java.util.Scanner;

public class Challenge_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter N: ");
		int n=sc.nextInt();
		
		int arr[] = new int[n];
		System.out.println("Enter Array Elements : ");
		for(int i=0; i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		int sum=0;
		for(int i=0; i<arr.length; i++) {
				sum +=arr[i];
		}
		System.out.println("Sum of Array Elements: " + sum);
		sc.close();
	}

}
