import java.io.*;
import java.util.*;

public class Main {

    static FastScanner fs = new FastScanner();
    static StringBuilder out = new StringBuilder();

    static void solve() throws Exception {
        int n = fs.nextInt();
        int[] arr = new int[n];
        int answer = 0;

        for(int i = 0; i < n; i++){
            arr[i] = fs.nextInt();
        }
        answer = arr[n-1] - arr[0];
        for(int i = 1; i < n; i++){
            answer = Math.max(answer,arr[i] - arr[0]);
        }
        for(int i = 0; i < n-1; i++){
            answer = Math.max(answer, arr[i] - arr[i+1]);
        }
        for(int i = 0; i < n -1 ; i++){
            answer = Math.max(answer, arr[n-1] - arr[i]);
        }

        out.append(answer).append("\n");
    }

    public static void main(String[] args) throws Exception {
        int t = fs.nextInt();
        while (t-- > 0) {
            solve();
        }
        System.out.print(out.toString());
    }

    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String next() throws IOException {
            while (st == null || !st.hasMoreElements()) {
                st = new StringTokenizer(br.readLine());
            }
            return st.nextToken();
        }

        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        long nextLong() throws IOException {
            return Long.parseLong(next());
        }
    }
}