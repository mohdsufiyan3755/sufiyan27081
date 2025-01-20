package basicPrograms;

import java.util.Scanner;

public class Urltype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the URL");
		String url = scan.nextLine();
		//Taking out protocol part
		String protocol = url.substring(0, url.indexOf(":"));
		if(protocol.equals("http")) {
			System.out.println("Hypertext Transfer Protocol");
		}
		else if(protocol.equals("https")) {
			System.out.println("Hypertext Transfer Protocol (secured)");
		}
		else if(protocol.equals("ftp")) {
			System.out.println("File Transfer Protocol");
		}
		else {
			System.out.println("Invalid Protocol");
		}
		//Taking out extension part
		String ext = url.substring(url.lastIndexOf("."));
		if(ext.equals(".com")) {
			System.out.println("Commercial");
		}
		else if(ext.equals(".org")) {
			System.out.println("Organisation");
		}
		else if(ext.equals(".net")) {
			System.out.println("Network");
		}
		else {
			System.out.println("Invalid Extension");
		}
	}

}
