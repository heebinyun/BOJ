package algorithm.level3._15552;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			int tc = Integer.parseInt(br.readLine());
			int a ,b, sum;
			for(int i = 0; i<tc; i++) {
				String[] temp = br.readLine().split(" ");
				a = Integer.parseInt(temp[0]);
				b = Integer.parseInt(temp[1]);
				sum = a+b;
				bw.write(sum+"\n");
			}
			bw.flush();
			bw.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
