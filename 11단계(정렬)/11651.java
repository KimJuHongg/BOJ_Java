import java.util.*;
       
          public class Main {
        
              public static void main(String[] args) {
        
                  Scanner sc = new Scanner(System.in);
        
                  StringBuilder sb = new StringBuilder(); // 출력이 많으므로 사용합니다.
                  int N = sc.nextInt();
        
                  int [][]arr = new int[N][2];
        
        
                  for(int i=0; i<N; i++){
                      arr[i][0] = sc.nextInt(); // x 좌표
                      arr[i][1] = sc.nextInt(); // y 좌표
                  }
                  Arrays.sort(arr, new Comparator<int[]>(){
                      
                      public int compare(int[] a, int[] b) {
                          if(a[1] != b[1])
                              return a[1] - b[1]; // y좌표가 다르면 y 비교  
                          return a[0] - b[0]; // 아니면 x비교
                      }
                  });
                  for (int[] is : arr)
                      sb.append(is[0] + " " + is[1] + "\n");
                  System.out.print(sb);
              }
          
          }
