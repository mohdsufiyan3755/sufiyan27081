package basicPrograms;

import java.util.Scanner;

public class palindromeStringWithStringMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// palindrome string

		
		String str;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String");
		str = scan.next();
		String str1 = str;
		String temp = "";
		for(int i=str1.length()-1; i>=0; i--) {
			temp = temp + str1.charAt(i);			
		}
		if(temp.equals(str)) {
			System.out.println("Word is palindrome");
		}
		else {
			System.out.println("The word is not a palindrome");
		}
		
		
	}

}
