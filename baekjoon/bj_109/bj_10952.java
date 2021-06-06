package bj_109;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// public class Main {
public class bj_10952 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] tmp;
		int A,B;
		while(true) {
			tmp = br.readLine().split(" ");
			A = Integer.parseInt(tmp[0]);
			B = Integer.parseInt(tmp[1]);
			if(A==0||B==0)
				break;
			
			bw.append((A+B)+"\n");
		}
		bw.flush();
		bw.close();
	}

}

