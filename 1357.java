import java.util.Scanner;
 
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        
        System.out.println(rev(rev(num1)+rev(num2)));
 
    }
    
    public static int rev(int num){
        
        int result = 0;
            while (num > 0) {
            result = result * 10 + num % 10;
            num /= 10;
        }

       return result; 
    }
}
