import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //prompt user to input a number
        int n = input.nextInt();
        
        String name = input.next();
        
        int f = 1;
        for(int i = 1; i <= n; i ++) {
            f = f * i;
        }
        System.out.printf("%d! = %d\n", ... );
        
        int i = 1;
        while(i <= n) {
            f = f * i;
            i ++;
        }
        
        name,
        -> Hello name!
        
    }
}
