import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws Exception {
        FastReader fr = new FastReader();
        String str = fr.nextLine(); 
        String[] M_arr = str.split("\\-");
        int sum = 0;
        for(int i = 0; i < M_arr.length; i++) {
          String[] P_arr = M_arr[i].split("\\+");
          for (int j = 0; j < P_arr.length; j++) {
            if(i == 0) {
              sum += Integer.parseInt(P_arr[j]);
            }
            else {
              sum -= Integer.parseInt(P_arr[j]);
            }
          }
        }  
        System.out.print(sum);
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
