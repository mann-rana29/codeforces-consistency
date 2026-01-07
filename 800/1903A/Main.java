//A. Halloumi Boxes https://codeforces.com/problemset/problem/1903/A

import java.io.*;
import java.util.*;

public class Main {

    static FastScanner fs = new FastScanner();
    static StringBuilder out = new StringBuilder();

    static void solve() throws Exception {
        int n = fs.nextInt();
        int k = fs.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n ; i++){
            arr[i] = fs.nextInt();
        }

        int copy[] = Arrays.copyOf(arr, n);
        Arrays.sort(copy);

        if(Arrays.equals(arr, copy) || k > 1){
            out.append("YES").append('\n');
        }else{
            out.append("NO").append('\n');
        }
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