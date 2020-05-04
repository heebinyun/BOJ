package algorithm.level8._10809;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String str = br.readLine();
			
			for(char c='a'; c<='z'; c++) {
				System.out.print(str.indexOf(c) + " ");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
