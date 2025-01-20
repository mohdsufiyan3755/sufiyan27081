package searchingAlgorithm;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
				System.out.println("Enter the number of elements in an array");
				int n= scan.nextInt();
				int[] a = new int[n];	
				
				for (int i=0; i<n; i++) {
					a[i] = scan.nextInt();
		        }
				System.out.println("Array of "+n+" elements is: ");
				for (int i=0; i<n; i++) {
					System.out.print(a[i]+" ");
				}
				System.out.println();
				System.out.println("Enter the number to be searched in the list");
				int item = scan.nextInt();
				int count=0;
				for (int i=0; i<n; i++) {
					if (a[i]==item) {
						System.out.println("Number is present at "+i+" index in the array");
						count = count+1;
						break;
					}
				}
					if(count==0) {
						System.out.println("Number is not present in the list");
					}
				
	

	}

}
