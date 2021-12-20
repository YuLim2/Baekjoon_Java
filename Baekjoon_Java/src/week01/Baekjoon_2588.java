package week01;

import java.util.Scanner;

public class Baekjoon_2588 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n1 = in.nextInt(); 
		String n2 = in.next();
		
		System.out.println(n1 * (n2.charAt(2) - '0'));
		System.out.println(n1 * (n2.charAt(1) - '0'));
		System.out.println(n1 * (n2.charAt(0) - '0'));
		System.out.println(n1 * Integer.parseInt(n2));
	}

}
