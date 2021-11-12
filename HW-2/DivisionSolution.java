import java.util.Scanner;

public class DivisionSolution {
	public int divide(int dividend, int divisor) {
		long dividendL = Math.abs((long) dividend);
		long divisorL = Math.abs((long) divisor);
		
		int counter = 0;
		while (dividendL >= divisorL) {
			dividendL = dividendL - divisorL;
			counter++;
		}
		if (counter <= Integer.MIN_VALUE) {
            		counter = Integer.MIN_VALUE;
        	}
        	if (counter >= Integer.MAX_VALUE) {
            		counter = Integer.MAX_VALUE - 1;
       		}
		int x;
		if ((dividend < 0) & (divisor < 0)) {
			x = counter;
		} else if ((dividend < 0) | (divisor < 0)) {
			x = -counter; 
		} else {
			x = counter;
		}
        return x; 
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int x = sc.nextInt();
		System.out.println("Enter second number: ");
		int y = sc.nextInt();
		DivisionSolution ds = new DivisionSolution();
		System.out.println("Result of division: " + ds.divide(x, y));
		sc.close();

	}

}
