public class Functions {
    public static void main(String[] args) {
     System.out.print("Enter # of x: ");
     int sizeX = input.nextInt();
     int[] x = new int[sizeX];
     int[] y = new int[sizeX];
     
     for(int i = 0; i < sizeX; i ++) {
        x[i] = input.nextInt();
        y[i] = line(2, x[i], 5);
     }

     // WRITE CODE TO GENERATE TABLE
     for(int i = 0; i < sizeX; i ++) {
        System.out.printf("%d ", x[i]);
     }
     System.out.printf("\n");
     for(int i = 0; i < sizeX; i ++) {
        System.out.printf("%d ", y[i]);
     }
    
    }
    x | 1 | 2 | 0
    y | 7 | 9 | 5
    
    Table of y = 2x + 5
    -------------------
    x | 1 | 2 | 0 | 
    y | ? | ? | ? |
    
    public static int line(int m, int x, int c) {
        return m * x + c;
    }
 
}
