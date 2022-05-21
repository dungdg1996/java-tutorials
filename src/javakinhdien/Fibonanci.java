package javakinhdien;

import java.util.Scanner;

public class Fibonanci {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap n = ");
		int n = scanner.nextInt();
		int[] fibo = new int[n];
		for (int i = 0; i < fibo.length; i++) {
			if(i == 0) {
				fibo[i] = 0;
			} else if (i == 1) {
				fibo[i] = 1;
			} else {
				fibo[i] = fibo[i-1] + fibo[i-2];
			}
		}
		
		for (int i = 0; i < fibo.length; i++) {
			System.out.print(fibo[i] +" ");
			
		}
	}
}
