import java.util.Scanner;

public class Calculate {
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		String[] operators = { "+", "-", "/", "x", "*", "^" };
		
		String token;
		
		double[] stack = new double[100];
		int sp = -1;
		boolean isOperator;
		
		while(true) {
			isOperator = false;
			
			token = input.next();
			
			if(token.equals("$")) {
				System.out.println(stack[sp]);
				break;
			}
			
			for(int i = 0; i < operators.length; i ++) {
				if(token.equals(operators[i])) {
					double result = evaluate(stack[sp - 1], stack[sp], token);
					sp --;
					stack[sp] = result;
					isOperator = true;
					break;
				}
			}
			if(!isOperator) {
				sp ++;
				stack[sp] = Double.parseDouble(token);
			}	
		}
	}
	
	
	public static double evaluate(double a, double b, String operator) {
		double result = 1.0;
		switch(operator) {
			case "+":
				result = a + b;	
				break;
			case "-":
				result = a - b;	
				break;
			case "/":
				result = a / b;	
				break;
			case "*":
			case "x":
				result = a * b;	
				break;
			case "^":
				result = Math.pow(a, b);
				break;
		}
		
		return result;
	}
	
}

