package algorithm.level7._4673;

public class Main {
	public static void main(String[] args) {
		int nonSelfNumber[] = new int[10001];
		for(int i=1; i<10000; i++) {
			int dn = dn(i);
			if(dn <= 10000) {
				nonSelfNumber[dn]++;
			}
		}
		
		for(int i=1; i<nonSelfNumber.length; i++) {
			if(nonSelfNumber[i] == 0) {
				System.out.println(i);
			}
		}
	}
	public static int dn(int n) {
		int dn = n;
		while(n>0) {
			dn += n%10;
			n /= 10;
		}
		return dn;
	}
}
