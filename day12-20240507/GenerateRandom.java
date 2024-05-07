import java.util.Scanner;
public class GenerateRandom {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int N = input.nextInt(); // generate N random numbers

		int A = 10;
		int B = 15;
		int C = 23;
		int r = 0;
	
		for(int i = 1; i <= N; i ++) {
			r = (r * A + B) % C;
			
			System.out.println(r);
		}
		
		
		// use the generated random numbers r to create random password of length N
	}
}

