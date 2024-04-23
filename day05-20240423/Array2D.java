public class Array2D {
    public static void main(String[] args) {
    
        //int[][] arr = new int[<size1>][<size2>];
        // ask user for two 2x2 matrix and print
        // A + B
        // A - B
        // A * B
        
//         arr[0][0] = 2;
//         arr[0][1] = 3;
//         arr[1][0] = 4;
//         arr[1][1] = 5;
        System.out.println("Enter 2x2 matrix A:");
        int[][] arrA = new int[2][2];
        for(int i = 0; i < 2; i ++) {
            for(int j = 0; j < 2; j ++) {
                arrA[i][j] = input.nextInt();
            }
        }
        System.out.println("Enter 2x2 matrix B:");
        // take inputs for arrB as well
        int[][] arrB = new int[2][2];
        for(int i = 0; i < 2; i ++) {
            for(int j = 0; j < 2; j ++) {
                arrB[i][j] = input.nextInt();
            }
        }
        
        // PRINT arrA
        for(int i = 0; i < 2; i ++) {
            for(int j = 0; j < 2; j ++) {
                System.out.print(arrA[i][j]);
            }
            System.out.println();
        }
        // PRINT arrB
        for(int i = 0; i < 2; i ++) {
            for(int j = 0; j < 2; j ++) {
                System.out.print(arrB[i][j]);
            }
            System.out.println();
        }
        
        //TODO: arrA + arrB
        //TODO: arrA - arrB
        //TODO: arrA x arrB
    }
}
