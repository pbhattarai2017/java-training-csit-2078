import java.util.Scanner;

public class Multiplication {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int m = keyboard.nextInt();
	
		for(int i = 1; i <= 10; i ++) {
			System.out.printf("%d x %d = %d\n", m, i, m * i);
		}
	}
}

