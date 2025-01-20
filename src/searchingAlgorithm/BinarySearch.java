package searchingAlgorithm;

import java.util.Scanner;

public class BinarySearch {

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
		int li=0;
		int hi=n-1;
		int mi= (li+hi)/2;
		while(li<=hi) {
			if(a[mi]==item) {
				System.out.println("Number is present at "+mi+" index in the array");
				break;
			}
			else if(a[mi]<item) {
				li=mi+1;
			}
			else {
				hi=mi-1;
			}
			mi=(li+hi)/2;
		}
		if(li>hi) {
			System.out.println("Element is not present in the array");
		}
			
		
	}
}
