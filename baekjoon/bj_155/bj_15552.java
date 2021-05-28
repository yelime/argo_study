import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class bj_15552 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] arr = new String[2];
		int T = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= T; tc++) {
			arr = br.readLine().split(" ");
			bw.write(Integer.parseInt(arr[0])+Integer.parseInt(arr[1])+"\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}

}
