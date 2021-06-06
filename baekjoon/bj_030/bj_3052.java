package bj_030;

import java.util.Scanner;

public class bj_3052 {
// public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] his = new int[42];
		int[] idx = new int[10];
		int best = 0;

		for (int i = 0; i < 10; i++) {
			idx[i] = sc.nextInt()%42;
			his[idx[i]]++;
		}
		for (int i = 0; i < 42; i++) {
			if(his[i] !=0 )
				best++;
		}
		System.out.println(best);

	}

}
