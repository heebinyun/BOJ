package algorithm.level8._2675;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int tc = Integer.parseInt(br.readLine());
			
			for(int i=0; i<tc; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				int r = Integer.parseInt(st.nextToken());
				String str = st.nextToken();
				
				for(int j=0; j<str.length(); j++) {
					for(int k=0; k<r; k++) {
						System.out.print(str.charAt(j));
					}
				}
				System.out.println();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
