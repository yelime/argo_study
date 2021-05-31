import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class bj_11021 {
    // public class Main {
    
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        String[] tmp;
        int A,B;
        for(int tc = 1; tc <= T;tc++) {
            tmp = br.readLine().split(" ");
            A = Integer.parseInt(tmp[0]);
            B = Integer.parseInt(tmp[1]);
            bw.write("Case #" + tc+": "+(A+B)+"\n");
            
        }
        bw.flush();
        bw.close();
    }

}
    