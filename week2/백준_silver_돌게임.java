package week2;

import java.io.*;

public class 백준_silver_돌게임 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        bw.write(N % 2 == 0 ? "CY" : "SK");
        bw.close();
    }
}
