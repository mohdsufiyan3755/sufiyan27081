package basicPrograms;

import java.util.Scanner;

public class RootsofQE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b,c;
		double r1,r2;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of coefficients a,b and c");
		a= scan.nextInt();
		b= scan.nextInt();
		c= scan.nextInt();
		r1 = (-b + (Math.sqrt(b*b - 4*a*c)))/2*a;
		r2 = (-b - (Math.sqrt(b*b - 4*a*c)))/2*a;
		System.out.println("The values of roots are "+r1+" and "+r2 );
	}

}
