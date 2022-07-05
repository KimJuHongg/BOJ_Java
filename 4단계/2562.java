import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        FastReader fr = new FastReader();
        int[] arr = new int[9];
        int max;
        int count = 0;
      
        for(int i = 0; i < 9; i++) {
          arr[i] = fr.nextInt();
        }
        max = arr[0];
        for(int i = 0; i < 9; i++) {
          if (max < arr[i])
            max = arr[i];
        }
        for(int i = 0; i < 9; i++) {
          if(max == arr[i])
            count = i;
        }
        System.out.println(max);
        System.out.println(count+1);
        
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
