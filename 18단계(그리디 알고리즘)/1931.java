import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws Exception {
        FastReader fr = new FastReader();
        int n = fr.nextInt(); 
        int[][] arr = new int[n][2];
        int count = 0;
        int end = 0;
        for(int i = 0; i < n; i++) {
          arr[i][0] = fr.nextInt();
          arr[i][1] = fr.nextInt();
        }  
      // 끝나는 시간을 기준으로 정렬하기 위해 compare 재정의 
    		Arrays.sort(arr, new Comparator<int[]>() {
    			
    			@Override
    			public int compare(int[] o1, int[] o2) {
    	
    				if(o1[1] == o2[1]) {
    					return o1[0] - o2[0];
    				}
    				return o1[1] - o2[1];
    			}
    		});
        for(int i = 0; i < n; i++) {
          if(arr[i][0] >= end) {
            end = arr[i][1];
            count++;
          }
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
