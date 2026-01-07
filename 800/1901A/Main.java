import java.io.*;
import java.util.*;

public class Main {

    static FastScanner fs = new FastScanner();
    static StringBuilder out = new StringBuilder();

    static void solve() throws Exception {
        int n = fs.nextInt();
        int x = fs.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n ; i++) arr[i] = fs.nextInt();

        int minVol = arr[0];

        for(int i = 0; i < n-1; i++){
            minVol = Math.max(minVol, arr[i+1] - arr[i]);
        }

        minVol = Math.max(minVol , 2*(x - arr[n-1]));

        out.append(minVol).append('\n');
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