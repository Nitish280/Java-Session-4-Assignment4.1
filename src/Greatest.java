import java.util.Scanner;

public class Greatest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		System.out.println("Input first number: ");
		int a = in.nextInt();

		System.out.println("Input second number: ");
		int b = in.nextInt();

		System.out.println("Input third number: ");
		int c = in.nextInt();

		int max=0;
		if (a > b && a > c) {
			max = a;
		}
		if (b > a && b > c) {
			max = b;
		}

		if (c > a && c > b) {
			max = c;
		}
		
		
		System.out.println("the greatest no is:" + max);

	}

}
