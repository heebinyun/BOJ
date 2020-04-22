package algorithm.level3._10950;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int a = 0;
		int b = 0;
		int sum[] = new int[count];
		for(int i = 0; i<count; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			sum[i] = a+b;
		}
		for(int j = 0; j<sum.length; j++) {
			System.out.println(sum[j]);
		}
	}
}
