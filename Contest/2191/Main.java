import java.io.*;
import java.util.*;

public class Main {

    static FastScanner fs = new FastScanner();
    static StringBuilder out = new StringBuilder();

    static void C() throws Exception {
        int n = fs.nextInt();
        String s = fs.next();

        char[] nums = s.toCharArray();
        ArrayList<Integer> arr = new ArrayList<>();
        int ops = 0;
        for(int i = 1 ; i < n; i++){
            if(nums[i] - '0' < nums[i-1] - '0'){
                ops++;
                arr.add(i);
                arr.add(i+1);
                while(i < n-1 && nums[i+1] == nums[i]){
                    arr.add(i+2);
                    i++;
                }
            }
        }

        if(ops % 2 == 0){
            out.append("Bob").append("\n");
            return;
        }

        out.append("Alice").append("\n");
        out.append(arr.size()).append("\n");
        for(int num : arr) out.append(num + " ");
        out.append("\n");
    }

    static void A() throws Exception {
        int n = fs.nextInt();
        int[] arr = new int[n];
        int[] num = new int[101];

        for(int i= 0; i < n; i++){
            arr[i] = fs.nextInt();
            if(i%2 == 0){
                num[arr[i]] = 2;
            }else{
                num[arr[i]] = 1;
            }
        }
        Arrays.sort(arr);
        for(int i = 1; i < n; i++){
            if(num[arr[i]] == num[arr[i-1]]){
                out.append("NO").append("\n");
                return;
            }
        }
        out.append("YES").append("\n");
    }

    static void B() throws Exception {
        int n = fs.nextInt();
        int[] arr = new int[n+1];

        for(int i= 1; i <= n; i++){
            arr[i] = fs.nextInt();
        }

        for(int i = 1; i <= n-1;i++){
            if(mex(1, i, arr) != mex(i+1, n, arr)){
                out.append("YES").append("\n");
                return;
            }
        }

        out.append("NO").append("\n");
    }
    static int mex(int start , int end, int[] arr){
        if(start == end){
            if(arr[start] == 0)return 1;
            return 0;
        }
        boolean[] num = new boolean[101];
        for(int k = start; k <= end; k++) num[arr[k]] = true;
        for(int i = 0; i < 101; i++){
            if(!num[i]) return i;
        }
        return 101;
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