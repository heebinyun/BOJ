package algorithm.level6._3052;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt()%42;
		}
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			boolean flag = true;
			for(int j=0; j<i; j++) {
				if(arr[i]==arr[j]) {
					flag = false;
					break;
				}
			}
			if(flag) {
				count++;
			}
		}
		System.out.println(count);
	}
}
