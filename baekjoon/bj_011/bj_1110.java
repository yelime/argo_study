package bj_011;

import java.util.Scanner;

// public class Main {
public class bj_1110 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		int result=0;
		int tmp;
		int M = N;
		while(true) {
			tmp = N/10 + N%10;
			tmp = (N%10)*10+tmp%10; 
			N = tmp;
			result++;
			if(M==N)
				break;
		}
		System.out.println(result);
	}
}
