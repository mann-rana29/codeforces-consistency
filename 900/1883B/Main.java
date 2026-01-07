import java.io.*;
import java.util.*;

public class Main {

    static FastScanner fs = new FastScanner();
    static StringBuilder out = new StringBuilder();

    static void solve() throws Exception {
        int n = fs.nextInt();
        int k = fs.nextInt();
        String s = fs.next();
        int[] alp = new int[26];
        for(char c : s.toCharArray()) alp[c - 'a']++;
        
        long cnt = 0;
        for(int i = 0; i < 26; i++){
            if(alp[i] % 2 != 0) cnt++;
        }
        if(cnt-k <= 0 || cnt-k == 1){
            out.append("YES").append("\n");
            return;
        }
        else{
            out.append("NO").append("\n");
            return;
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