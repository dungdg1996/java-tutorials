package baitap;

import java.util.Scanner;

public class Bai2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		int kq = 1;
		for (int i = 1; i <= n; i++) {
			kq = kq * i;
		}
		
		System.out.println(kq);
		
	}
}
