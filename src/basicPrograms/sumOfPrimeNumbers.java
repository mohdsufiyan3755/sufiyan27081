package basicPrograms;

import java.util.Scanner;

public class sumOfPrimeNumbers {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Starting number of the range");
		int start = scan.nextInt();
		System.out.println("Enter Ending number of the range");
		int end = scan.nextInt();
		int count, sum=0;
		
		for(int i=start; i<=end; i++ ) {
			count=0;
			   for(int j=2; j<=i/2; j++) {
				   if(i%j==0) {
					   count++;
					   break;
				   }
			   }
			   if(count==0 && i!=1) {
				   sum=sum+i;				   
			   }
			   
		}		
		System.out.println("Sum of Prime numbers ranging from "+start+" to "+end+" is : "+sum);
	}

}
