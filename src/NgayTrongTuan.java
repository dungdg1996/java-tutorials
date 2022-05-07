import java.util.Scanner;

public class NgayTrongTuan {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int ngay = scanner.nextInt();

		if (ngay == 1) {
			System.out.println("Chu Nhat");
		} else if (ngay == 2) {
			System.out.println("Thu 2");
		} else if (ngay == 3) {
			System.out.println("Thu 3");
		} else if (ngay == 4) {
			System.out.println("Thu 4");
		}
	}
}
