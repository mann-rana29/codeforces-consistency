import java.io.*;
import java.util.*;

public class Main {

    static FastScanner fs = new FastScanner();
    static StringBuilder out = new StringBuilder();

    static void A() throws Exception {
        int n = fs.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n ; i++){
            arr[i] = fs.nextInt();
        }
        if(arr[0] == 1 || arr[n- 1] == 1){
            out.append("Alice").append("\n");
            return;
        }
        out.append("Bob").append("\n");
    }

    static void C() throws Exception{
        long n = fs.nextLong() , m = fs.nextLong() , k = fs.nextLong();

        long left = k - 1;     
        long right = n - k;      

        long maxReach = Math.min(m, Math.max(left, right));
        long ans = Math.min(n, 1 + maxReach);

        out.append(ans).append('\n');
    }

    public static void main(String[] args) throws Exception {
        int t = fs.nextInt();
        while (t-- > 0) {
            C();
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