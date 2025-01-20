package basicPrograms;

public class SwapTwoVariablesWithoutThirdVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a= 5;
		int b= 6;
		System.out.println("Value of a before swap "+a);
		System.out.println("Value of b before swap "+b);
		a= a*b;
		b= a/b;
		a=a/b;
		System.out.println("Value of a after swap "+a);
		System.out.println("Value of b after swap "+b);
	}

}
