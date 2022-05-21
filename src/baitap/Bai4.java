package baitap;

import java.util.Scanner;

public class Bai4 {
	
	static void inDaySo(int[] a) {
		System.out.print("Dãy số bạn đã nhập là: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
	
	static int min(int[] a) {
		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			if(a[i] < min) {
				min = a[i];
			}
		}
		return min;
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
		
		System.out.println("Min của dãy số là: " + min(a));
	}

}
