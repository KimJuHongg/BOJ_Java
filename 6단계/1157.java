import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        String str = scanner.next().toUpperCase();

        int [] arr = new int[26];
        int max = 0;
        char result = '?';
        for(int i = 0; i < str.length(); i++) {
          arr[str.charAt(i) - 65]++;
          if(max < arr[str.charAt(i) - 65]) {
            max = arr[str.charAt(i)-65];
            result = str.charAt(i);
          }
          else if (max == arr[str.charAt(i)- 65])
            result = '?';
        }        
      System.out.print(result);
  }
}
