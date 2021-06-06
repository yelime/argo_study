package bj_024;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

// public class Main {
    
public class bj_2439 {
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.close();
		for(int i=1;i<=T;i++) {
			for(int j = i;j<T;j++)
				bw.write(" ");
			for(int j= 0;j<i;j++)
				bw.write("*");
			bw.write("\n");
		}
		bw.flush();
		bw.close();
	}

}
