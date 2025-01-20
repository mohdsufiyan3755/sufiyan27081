package basicPrograms;

public class Incrementoperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Increment
		int x =5, y1,y2;
		y1= x++;
		System.out.println("value of x= "+x+" and value of y1= "+y1);
		y2= ++x;
		System.out.println("value of x= "+x+" and value of y2= "+y2);
		char k = 'a';
		k++;
		System.out.println(k);
		
//Decrement
		int a =6, b,c;
		b= a--;
		System.out.println("value of a= "+a+" and value of b= "+b);
		c= --a;
		System.out.println("value of a= "+a+" and value of c= "+c);
		char l = 'a';
		l--;
		System.out.println(l);
		--l;
		System.out.println(l);
	}

}
