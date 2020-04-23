package algorithm.level6._8958;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int tc = Integer.parseInt(br.readLine());
			String sArr[] = new String[tc];
			for(int i=0; i<tc; i++) {
				sArr[i] = br.readLine();
			}
			for(int i=0; i<tc; i++) {
				int count = 0;
				int sum = 0;
				for(int j=0; j<sArr[i].length(); j++) {
					if(sArr[i].charAt(j)=='O') sum += ++count;
					else count = 0;
				}
				System.out.println(sum);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
