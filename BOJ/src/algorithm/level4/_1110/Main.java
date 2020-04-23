package algorithm.level4._1110;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp = n;
		int count = 0;
		while(true) {
			int a = temp/10;
			int b = temp%10;
			
			temp = b*10+((a+b)%10);
			
			count ++;
			if(temp == n) {
				break;
			}
		}
		System.out.println(count);
	}
}
