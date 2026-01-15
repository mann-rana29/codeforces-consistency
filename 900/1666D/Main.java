import java.io.*;
import java.util.*;

public class Main {

    static FastScanner fs = new FastScanner();
    static StringBuilder out = new StringBuilder();

    static void solve() throws Exception {
        String s = fs.next();
        String t = fs.next();
        if(s.equals(t)){
            out.append("YES").append("\n");
            return;
        }

        int n = s.length();
        int m = t.length();

        int[] freq = new int[26];
        for(int i = 0; i < m; i++) freq[t.charAt(i) - 'A']++;
        
        StringBuilder str = new StringBuilder();

        for(int i = n-1; i >= 0; i--){
            if(freq[s.charAt(i) - 'A'] > 0){
                freq[s.charAt(i) - 'A']--;
                str.append(s.charAt(i));
            }
        }

        str.reverse();

        if(str.toString().equals(t)){
            out.append("YES").append("\n");
        }else{
            out.append("NO").append("\n");
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