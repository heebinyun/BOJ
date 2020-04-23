package algorithm.level6._4344;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int tc = Integer.parseInt(br.readLine());
			for(int i=0; i<tc; i++) {
				double sum = 0;
				double count = 0;
				double avg = 0;
				StringTokenizer st = new StringTokenizer(br.readLine());
				int n = Integer.parseInt(st.nextToken());
				int arr[] = new int[n];
				for(int j=0; j<arr.length; j++) {
					arr[j] = Integer.parseInt(st.nextToken()); 
					sum += arr[j];
				}
				avg = sum/n;
				for(int j=0; j<arr.length; j++) {
					if(avg<arr[j]) {
						count++;
					}
				}
				System.out.println(String.format("%.3f", count/n*100)+"%");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
