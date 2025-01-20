package basicPrograms;

import java.util.Scanner;

public class Repeated_Characters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string to check for duplicate character");
		String str = scan.next();
		char[] chararr = str.toCharArray();
		int count=0;
		for(int i= 0; i<str.length(); i++) {
			for(int j=i+1; j<str.length(); j++) {
				if(chararr[i]==chararr[j]) {
					System.out.println(chararr[j]+" ");
					break;
				}
			}
		}

	}

}
