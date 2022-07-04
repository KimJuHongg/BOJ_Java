import java.util.*;

class Main {
  public static void main(String[] args) {
    int year;
    Scanner scanner = new Scanner(System.in);

    year = scanner.nextInt();
    
    if ( year % 4 == 0) {
      if (year % 400 == 0)
        System.out.print("1");
      else if ( year % 100 == 0)
        System.out.print("0");
      else
        System.out.print("1");
    }
    else
      System.out.print("0");
  }
}
