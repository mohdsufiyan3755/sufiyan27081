package basicPrograms;

import java.util.Scanner;

public class BubbleSorting {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of elements in an array");
		int n= scan.nextInt();
		int[] array = new int[n];	
		System.out.println("Enter the array of numbers");
		for (int i=0; i<n; i++) {
			array[i] = scan.nextInt();
		
		System.out.print(array[i]+" ");
        }
	
		//ascendingOrder(array);
		descendingOrder(array);
		//namesSorting();
	}
	
	//For ascending order
	
	private static void ascendingOrder(int[] a) {
		int temp;
		for (int i= 0; i<a.length; i++) {
			int count=0;
			for (int j=0; j<a.length-1-i; j++) {
				if (a[j]>a[j+1]) {
					temp= a[j];
					a[j]= a[j+1];
					a[j+1]= temp;
					count++;
				}
			}
			if(count==0) {
				break;
			}
		}
		System.out.println();
		System.out.println("Numbers in Ascending Order:");
		for (int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}
	
	//For descending order
	private static void descendingOrder(int[] a) {
		int temp;
		
		for (int i= 0; i<a.length; i++) {
			int count=0;
			for (int j=0; j<a.length-1-i; j++) {
				if (a[j]<a[j+1]) {
					temp= a[j];
					a[j]= a[j+1];
					a[j+1]= temp;
					count++;
				}
			}
			if(count==0) {
				break;
			}
		}
		System.out.println();
		System.out.println("Numbers in Descending Order:");
		for (int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}
	
	private static void namesSorting(String[] a) {
		String temp;
		for (int i= 0; i<a.length; i++) {
			int count=0;
			for (int j=0; j<a.length-1-i; j++) {
				if (a[j].compareToIgnoreCase(a[j+1])>0) {
					temp= a[j];
					a[j]= a[j+1];
					a[j+1]= temp;
					count++;
				}
			}
			if(count==0) {
				break;
			}
		}
		System.out.println("Names in Ascending Order:");
		for (int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}


}
