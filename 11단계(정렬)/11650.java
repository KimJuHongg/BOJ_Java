import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        FastReader fr = new FastReader();
        int n = fr.nextInt();    
        int arr[][] = new int[n][2];
        
        for(int i=0; i < arr.length; i++) {
          for(int j = 0; j < arr[i].length; j++) {
            arr[i][j] = fr.nextInt();
          }
        }
        Arrays.sort(arr, new Comparator<int[]>() {

  		
    			public int compare(int[] o1, int[] o2) {
    				if(o1[0] == o2[0])
    					return o1[1] - o2[1];
    				else
    					return o1[0] - o2[0];
    			}
        });
  		  for(int i = 0; i < n; i++) {
  			  System.out.println(arr[i][0] + " " + arr[i][1]);
  		  }
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
