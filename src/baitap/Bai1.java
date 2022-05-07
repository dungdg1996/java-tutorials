package baitap;

import java.util.Scanner;

public class Bai1 {
	
	public static void main(String[] args) {
		// Bài 1: Nhập N, in số chẳn từ 1 -> N
		// Vd: N = 10, Kq: 2 4 6 8 10
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		// 1. 1-> N
		// 2. là số chẳn thì in ra
		
		for (int i = 1; i <= n; i++) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}
		
	}
}
