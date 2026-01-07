import java.io.*;
import java.util.*;

public class Main {

    static FastScanner fs = new FastScanner();
    static StringBuilder out = new StringBuilder();

    static void solve() throws Exception {
        long a = fs.nextLong(), b = fs.nextLong();
        int n = fs.nextInt();
        long[] arr = new long[n];
        for(int i = 0; i < n; i++) arr[i] = fs.nextLong();

        long maxi  = b;
        for(int i = 0; i < n; i++) maxi += Math.min(arr[i],a-1);

        out.append(maxi).append("\n");

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