package Math;

import java.util.Scanner;

public class BJ_Math2_11653 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int i=2;
				while(i<=N) {
					if(N%i==0) {
						System.out.println(i);
						N/=i;
					} else i++;
			}
				
//		for(int i=2;i<=N;i++) {
//			while(N%i==0) {
//				System.out.println(i);
//				N/=i;
//			}
//		}
	}
}
