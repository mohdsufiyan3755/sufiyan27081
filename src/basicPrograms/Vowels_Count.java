package basicPrograms;

import java.util.Scanner;

public class Vowels_Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string to count for vowels");
		String str = scan.next();
		int count=0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)=='a' || str.charAt(i)=='e'|| str.charAt(i)=='i'|| str.charAt(i)=='o'||str.charAt(i)=='u') {
				count++;
			}
		}
		if(count>0) {
			System.out.println("Number of vowels in the string is: "+count);
		}
		else {
			System.out.println("There are no vowels in the string");
		}

	}

}
