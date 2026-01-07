import java.io.*;
import java.util.*;

public class Main {

    static FastScanner fs = new FastScanner();
    static StringBuilder out = new StringBuilder();

    static void solve() throws Exception {
        long n = fs.nextLong(), k = fs.nextLong(), x = fs.nextLong();
        long minSum = (k*(k+1))/2;
        long maxSum = (n*(n+1))/2 - ((n-k)*(n-k+1))/2;
        
        if(x>= minSum && x<= maxSum){
            out.append("YES").append("\n");
            return;
        }
        out.append("NO").append("\n");
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
