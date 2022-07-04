import java.util.*;

class Main {
  public static void main(String[] args) {
      int a, b;
      Scanner scanner = new Scanner(System.in);
  
      a = scanner.nextInt();  //시
      b = scanner.nextInt();  //분
      
      if(b < 45) {
        b = 60 - (45 - b);
        if ( a == 0 )
          a = 23;  
        else 
          a--;
        System.out.print(a + " " + b);
      }
      else {
        b = b - 45;
        System.out.print(a + " " + b);
      }
  }
}
