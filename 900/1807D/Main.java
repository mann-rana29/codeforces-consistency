import java.io.*;
import java.util.*;

public class Main {

    static FastScanner fs = new FastScanner();
    static StringBuilder out = new StringBuilder();

    static void solve() throws Exception {
        int n = fs.nextInt();
        int q = fs.nextInt();     
        int[] arr = new int[n];
        int[] pre = new int[n];
        int sum = 0;
        for(int i = 0; i < n; i++){
            arr[i] = fs.nextInt();
            sum += arr[i];
        }
        pre[0] = arr[0];
        for(int i = 1; i < n; i++){
            pre[i] = arr[i] + pre[i-1];
        }
        while(q-- > 0){
            int l =fs.nextInt(), r = fs.nextInt(), k = fs.nextInt();
            int diff = r-l+1;
            int left = 0;
            if(l == 1){
                left = 0;
            }else{
                left = pre[l-2];
            }
            int remove = pre[r-1] - left;
            int newSum = sum - remove + diff*k;
            if((newSum) % 2 == 0){
                out.append("NO").append("\n");
            }else{
                out.append("YES").append("\n");
            }
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

