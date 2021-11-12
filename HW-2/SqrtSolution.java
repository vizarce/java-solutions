import java.util.Scanner;

public class SqrtSolution {
	public int mySqrt(int x) {
		if (x == 0 || x == 1) {
			return x;
        }
        long start = 1, end = x, res = 0;
        while (start <= end) {
        	long mid = (start + end) / 2;
        	if (mid * mid == x) {
        		return (int) mid;
        	}
        	if (mid * mid < x) {
        		start = mid + 1;
        		res = mid;
        	} else {
        		end = mid - 1;
        	}
        }
        return (int)res;
        
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		SqrtSolution mc = new SqrtSolution();
		System.out.println("The Sqrt of the number: " + mc.mySqrt(num));
		sc.close();

	}

}
