import java.util.*;


public class Main {
    
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      
      int n = scanner.nextInt();
      
      int count = n;
      for(int i = 0; i < n; i++) {
        String str = scanner.next();
        boolean arr[] = new boolean[26];

        for(int j = 0; j < str.length() - 1; j++) {
          if(str.charAt(j) != str.charAt(j+1)) {
            if(arr[str.charAt(j+1) - 97] == true) {
              count--;
              break;
            }
          }
          arr[str.charAt(j) - 97] = true;
        }
      }
      System.out.println(count);
  }
}
