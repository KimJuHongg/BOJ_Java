import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws Exception {
        FastReader fr = new FastReader();
        int n = fr.nextInt(); // 데이터 개수
        int k = fr.nextInt();
        int[] arr = new int[n];
        int count = 0;
      
        for(int i = 0; i < n; i++) {
          arr[i] = fr.nextInt();
        }  
        for(int i = arr.length-1; i >= 0; --i) {
          if(arr[i] <= k)
            count += (k / arr[i]);
            k = k % arr[i];
        }
        System.out.print(count);
    }
    public static class FastReader {
        BufferedReader br;
        StringTokenizer st;
        public FastReader() { br = new BufferedReader(new InputStreamReader(System.in)); }
        public FastReader(String s) throws FileNotFoundException { br = new BufferedReader(new FileReader(new File(s))); }
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try { st = new StringTokenizer(br.readLine()); }
                catch (IOException e) { e.printStackTrace(); }
            }
            return st.nextToken();
        }
        int nextInt() { return Integer.parseInt(next()); }
        long nextLong() { return Long.parseLong(next()); }
        double nextDouble() { return Double.parseDouble(next()); }
        String nextLine() {
            String str = "";
            try { str = br.readLine(); }
            catch (IOException e) { e.printStackTrace(); }
            return str;
        }
    }
}
