package algorithm.level6._1546;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double arr[] = new double[n];
		double sum = 0;
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		Arrays.sort(arr);
		double max = arr[arr.length-1];
		System.out.println((double)sum/max*100/n);
	}
	/* 정렬 사용 안하고 풀기
	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double arr[] = new double[n];
		double max = 0;
		double sum = 0;
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
			if(max<arr[i]) {
				max = arr[i];
			}
			sum += arr[i];
		}
		double avg = sum/max*100/n;
		System.out.println(avg);
	}*/
}
