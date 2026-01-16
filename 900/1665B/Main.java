import java.io.*;
import java.util.*;

public class Main {

    static FastScanner fs = new FastScanner();
    static StringBuilder out = new StringBuilder();

    static void solve() throws Exception {
        int n = fs.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) arr[i] = fs.nextInt();
        if(n == 1){
            out.append(0).append("\n");
            return;
        }

        Arrays.sort(arr);
        int maxSame = 1;
        int curr = 1;
        int res = 0;
        for(int i = 0; i < n-1; i++){
            if(arr[i] == arr[i+1]){
                curr++;
            }else curr = 1;

            maxSame = Math.max(maxSame, curr);
        }
        int remaining = n - maxSame;

        while(maxSame <= remaining){
            res+=1;
            res+=maxSame;
            remaining -= maxSame;
            maxSame = maxSame*2;
        }

        if(remaining > 0) res+= remaining + 1;

        out.append(res).append("\n");
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