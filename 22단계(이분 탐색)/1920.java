import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws Exception {
        FastReader fr = new FastReader();
        StringBuilder sb = new StringBuilder();
        
        int n1 = fr.nextInt();
        int[] A = new int[n1];
        for(int i = 0; i < n1; i++) {
          A[i] = fr.nextInt();
        }
        Arrays.sort(A);
        int n2 = fr.nextInt();
        
        for(int i = 0; i < n2; i++) {
          if(binarySearch(A, fr.nextInt()) >= 0) {
            sb.append(1 + "\n");
          }
          else {
            sb.append(0 + "\n");
          }
        }
        System.out.println(sb);
    }
        
    public static int binarySearch(int[] A, int target) {
      int low = 0;
      int high = A.length - 1;

      while(low <= high) {
        int mid = (low + high) / 2;
        if(target < A[mid]) {
          high = mid - 1;
        }
        else if(target > A[mid]) {
          low = mid + 1;
        }
        else {
          return mid;
        }
      }
      return -1;
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
