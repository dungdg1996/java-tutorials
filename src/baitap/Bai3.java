package baitap;

import java.util.Scanner;

public class Bai3 {
	
	static void inDaySo(int[] a) {
		System.out.print("Dãy số bạn đã nhập là: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// Nhap
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập số lượng phần tử: ");
		int n = scanner.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Nhập số thứ " + i + " : ");
			a[i] = scanner.nextInt();
		}
		inDaySo(a);
		
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if(a[i] > max) {
				max = a[i];
			}
		}
		
		System.out.println("Max của dãy số là: " + max);

	}

}
