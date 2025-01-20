package basicPrograms;

import java.util.Scanner;

public class sumOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number for sum:");
		int number = scan.nextInt();
		int sum = 0;
		for (int i=1; i<=number; i++) {
			sum = sum+i;
		}
		System.out.println("Sum of "+number+" is: "+sum);
	}

}
