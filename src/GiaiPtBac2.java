import java.util.Scanner;

public class GiaiPtBac2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double a, b, c;
		double delta;
		double x1, x2;
		
		System.out.println("Nhap a: ");
		a = scanner.nextDouble();
		System.out.println("Nhap b: ");
		b = scanner.nextDouble();
		System.out.println("Nhap c: ");
		c = scanner.nextDouble();
		
		delta = b * b - 4 * a * c;
		
		if(delta < 0) {
			System.out.println("Phuong trinh vo nghiem");
		} else if (delta == 0) {
			x1 = - b / (2 * a);
			System.out.println("Phuong trinh co nghiem kep x1 = x2 = " + x1);
		} else {
			x1 = (-b + Math.sqrt(delta)) / (2 * a);
			x2 = (-b - Math.sqrt(delta)) / (2 * a);
			
			System.out.println("x1 = " + x1);
			System.out.println("x2 = " + x2);
		}
		
		
	}
}
