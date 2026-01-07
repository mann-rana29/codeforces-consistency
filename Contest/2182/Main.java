import java.io.*;
import java.util.*;

public class Main {

    static FastScanner fs = new FastScanner();
    static StringBuilder out = new StringBuilder();

    static void A() throws Exception {
        int n = fs.nextInt();
        String s = fs.next();

        if(s.contains("2026")){
            out.append(0).append("\n");
            return;
        }
        else if(!s.contains("2025")){
            out.append(0).append("\n");
            return;
        }else{
            out.append(1).append("\n");
            return;
        }

    }
    static void B() throws Exception{
        int a = fs.nextInt();
        int b = fs.nextInt();

        
        return;
    }

    public static void main(String[] args) throws Exception {
        int t = fs.nextInt();
        while (t-- > 0) {
            A();
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