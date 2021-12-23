package week01;

import java.util.Scanner;

public class Baekjoon_2609 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i, sum = 1;
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int min = (n1 < n2) ? n1 : n2;
		
		for(i=1; i<=min; i++) {
			if((n1%i == 0) && (n2%i == 0)) {
				sum = i;
			}
		}
		System.out.println(sum);
		System.out.println((n1*n2)/sum);
	}

}