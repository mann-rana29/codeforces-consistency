import java.io.*;
import java.util.*;

public class Main {

    static FastScanner fs = new FastScanner();
    static StringBuilder out = new StringBuilder();

    static int[] dx = {-1, 1, -1, 1};
	static int[] dy = {-1, -1, 1, 1};
    static void solve() throws Exception {
        int a = fs.nextInt();
        int b = fs.nextInt();
        int xK = fs.nextInt();
        int yK = fs.nextInt();
        int xQ = fs.nextInt();
        int yQ = fs.nextInt();
        
        HashSet<Pair> king = new HashSet<>();
        HashSet<Pair> queen = new HashSet<>();
        
        for(int i = 0; i < 4; i++){
            king.add(new Pair(xK + dx[i]*a, yK + dy[i]*b));
            king.add(new Pair(xK + dx[i]*b, yK + dy[i]*a));

            queen.add(new Pair(xQ + dx[i]*a, yQ + dy[i]*b));
            queen.add(new Pair(xQ + dx[i]*b, yQ + dy[i]*a));
        }
        
        int ans = 0;
        for(Pair k : king){
            if(queen.contains(k)) ans++;
        }

        out.append(ans).append("\n");
    }

    static class Pair{
        int x;
        int y;
        Pair(int a , int b){
            x = a;
            y = b;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pair p = (Pair) o;
            return x == p.x && y == p.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
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