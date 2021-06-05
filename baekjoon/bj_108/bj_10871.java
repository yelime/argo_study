package bj_108;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class bj_10871 {

// public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] tmp = br.readLine().split(" ");
        int N =Integer.parseInt(tmp[0]);
        int X =Integer.parseInt(tmp[1]);
        
        tmp = br.readLine().split(" ");
        int num;
        for(int i = 0;i<N;i++) {
            num = Integer.parseInt(tmp[i]);
            if(X>num)
                bw.write(num+" ");
        }
        bw.flush();
        bw.close();
    }

}
    