import java.util.Scanner;

public class PalindromeNumberSolution {
	
	public boolean isPalindrome(int x) {
        int reversed = 0, temp = x;
        while (x > 0) {
            reversed = reversed * 10 + x % 10;
            x = x / 10;
        } 
        return temp == reversed;
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int number = sc.nextInt();
		PalindromeNumberSolution sol = new PalindromeNumberSolution();
		System.out.println("Number is Palindrome: " + sol.isPalindrome(number));
		sc.close();
	}
}
