import java.util.*;


public class Main {
    
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
    
      String str = scanner.next();
      String arr[] = {"c=", "c-", "dz=", "d-","lj", "nj", "s=", "z="};

      for(int i = 0; i < arr.length; i++) {
        if(str.contains(arr[i])) {
          str = str.replace(arr[i], "0");
        }
      }
      System.out.print(str.length());
  }
}
