import java.util.Scanner;
class MiniMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n = 5;
        /*
        * int only holds 32-bit data
        * long can hold 64-bit data
        */
        long[] arr = new long[n];
        
        // get 5 integers from input
        for(int i = 0; i < n; i ++) {
            arr[i] = input.nextLong();
        }
        
        // find the min & max elements
        long min = arr[0];
        long max = arr[0];
        for(int i = 0; i < n; i ++) {
            if(arr[i] > max) max = arr[i];
            if(arr[i] < min) min = arr[i];
        }
        
        // get total sum of arr
        long sum = 0;
        for(int i = 0; i < n; i ++) {
            sum = sum + arr[i];
        }
        
        System.out.printf("%d %d\n", sum - max, sum - min);
    }
}
