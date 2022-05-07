package baitap;

public class Scope {
	static int a = 15;
	
	
	
	public static void main(String[] args) {
		int tong = 0;
		for (int i = 0; i < 10; i++) {
			tong = tong + i;
		}
		System.out.println(tong);
		
	}
	
	static void inBienA() {
		System.out.println("a = " + a);
	}
}
