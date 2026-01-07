import java.io.*;
import java.util.*;

public class Main {

    static FastScanner fs = new FastScanner();
    static StringBuilder out = new StringBuilder();

    static void solve() throws Exception {
        long n = fs.nextLong();
        // List<Long> ans = new ArrayList<>();
        // for(long i = 1; i*i <= n; i++ ){
        //     if(n % i == 0){
        //         ans.add(i);
        //         ans.add(n/i);
        //     }
        // }

        // Collections.sort(ans);
        // long maxLen = 1;
        // long prev = ans.get(0);
        // int len = 1;
        // for(int i = 1; i < ans.size(); i++){
        //     if(ans.get(i) == prev + 1){
        //         len++;
        //         prev = ans.get(i);
        //     }
        //     else len = 0;

        //     maxLen = Math.max(maxLen, len);
        // }

        // out.append(maxLen).append("\n"); //got TLE on this
        int i = 1;
		while (n % i == 0) {
			i++;
		}
		System.out.println(i - 1);
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