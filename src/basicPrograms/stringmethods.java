package basicPrograms;

public class stringmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String s1 = " We are Learning JAVA ";
	String s2 = " Learning Selenium is Easy ";
	String s3 = "SUFIYAN";
	String s4 = "sufiyan";
	System.out.println(s1.concat(s2));
	System.out.println(s1+s2);
	int length=s1.length();
	System.out.println(length);
	System.out.println(s1.compareTo(s2));
	System.out.println(s3.compareTo(s4));
	System.out.println(s1.compareToIgnoreCase(s2));
	System.out.println(s3.compareToIgnoreCase(s4));
	System.out.println(s1.equals(s2));
	System.out.println(s3.equals(s4));
	System.out.println(s1.startsWith(s2));
	System.out.println(s3.startsWith(s4));
	System.out.println(s4.endsWith("n"));
	System.out.println(s1.indexOf("JAVA"));
	System.out.println(s1.lastIndexOf("JAVA"));
	System.out.println(s2.replace("e", "p"));
	System.out.println(s3.substring(3));
	System.out.println(s2.substring(10, 18));
	System.out.println(s3.toLowerCase());
	System.out.println(s4.toUpperCase());
	System.out.println(s1.trim());
	String[] arr=s1.split(" ");
//	System.out.println(arr[0]);
//    System.out.println(arr[1]);
//	System.out.println(arr[2]);
//	System.out.println(arr[3]);
//	System.out.println(arr[4]);
	for (int i=0; i<arr.length; i++) {
		System.out.println(arr[i]);
	}
		char[] array= new char[20];
		s1.getChars(8, 15, array, 3);
		System.out.println(array[0]);
		System.out.println(array[3]);
	
	
	
	}
	

}
