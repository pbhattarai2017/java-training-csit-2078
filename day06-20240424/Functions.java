public class Functions {
    public static void main(String[] args) {
        int value = 11;
                               
        int twoTimes = twiceNumber(value);
        System.out.println(twoTimes);
        
        System.out.println(twiceNumber(5));
        System.out.println(twiceNumber(1050));
        factorial(5) -> 120  (because 5! = 120)
        
        int s = sum(1,5);
        
    }
    
    public static int twiceNumber(int num) {
        int t = num * 2;
        return t;
    }
    
    public static int sum(int a, int b) {
        return a + b;
    }
    
    public static int factorial(int n) {
        int f = 1;
        for(int i = 1; i <= n; i ++) {
            ?? 
        }
        ??
    }
    
    Write a method to evaluate y = mx + c
    
    Table of y = 2x + 5
    -------------------
    x | 1 | 2 | 0 | 
    y | ? | ? | ? |
    
    public static int line(int m, int x, int c) {
        return m * x + c;
    }
    
    
    int[] arrX = new int[5];
    int[] arrY = new int[5];
    // fill this array with user's input
    
    for i
        int x = arrX[i];
        arrY[i] = line(2, x, 5);
    end for
    
    CHALLENGING
    -----------
    Plot the line in the terminal.
    m = 1, x, c = 0
                        .
                       .
                      .
                     .
                    .
                   .
                  .
                 .
                .
    /*
    method has:
        - return type (describes the type of output)
        - name (identifier)
        - parameters (list of values to be passed to method call)
        - body (implementation or details; how method works)
        - return statement (optional; if void not required)
        
    <return-type> <method-name>(<parameter-list>) {
        // method body
        <optional return statement>
    }
    */
}
