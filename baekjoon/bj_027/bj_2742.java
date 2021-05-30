import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

// public class Main {
public class bj_2742 {

	public static void main(String[] args) throws IOException  {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		for(int i = N; i>0;i--) {
			bw.write(i+"\n");
		}
		bw.flush();
		bw.close();
	}

}
