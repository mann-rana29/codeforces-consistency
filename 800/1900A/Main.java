import java.io.*;
import java.util.*;

public class Main {

    static FastScanner fs = new FastScanner();
    static StringBuilder out = new StringBuilder();

    static void solve() throws Exception {
        int n = fs.nextInt();
        String s = fs.next();

        int ones = 0;
        int gap = 0;
        for(char c : s.toCharArray()){
            if(c == '.'){
                gap++;
                ones++;
                if(gap == 3){
                    out.append(2).append('\n');
                    return;
                }
            }
            else{
                gap = 0;
            }
        }

        out.append(ones).append('\n');
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