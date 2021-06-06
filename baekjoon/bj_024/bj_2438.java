package bj_024;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class bj_2438 {

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.close();
		for(int i=1;i<=T;i++) {
			for(int j = 0;j<i;j++)
				bw.write("*");
			bw.write("\n");
		}
		bw.flush();
		bw.close();
	}

}
