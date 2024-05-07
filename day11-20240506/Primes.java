import java.util.Scanner;
public class Primes {
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);	
		int N = input.nextInt();
		
		boolean isPrime = true;
	
		for(int i = 2; i < N; i ++) {
			if(N % i == 0) {
				isPrime = false;
				break;
			}
		}
		
		if(N < 2) {
			isPrime = false;
		}
		
		if(isPrime) {
			System.out.println(N + " is prime");
		} else {
			System.out.println(N + " is not prime");
		}
	}
}

