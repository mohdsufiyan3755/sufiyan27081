package basicPrograms;

import java.util.Scanner;

public class Special_Character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String to check special character");
		String str = scan.next();
		int count = 0;
		for(int i=0; i<str.length(); i++) {
			if(!Character.isDigit(str.charAt(i)) && !Character.isLetter(str.charAt(i)) && !Character.isWhitespace(str.charAt(i))) {
				count++;
				System.out.println(str.charAt(i));
			}
		}
		if(count==0) {
			System.out.println("No special characters in the string");
		}
		else {
			System.out.println("Number of special Character in string: "+count);
		}

	}

}
