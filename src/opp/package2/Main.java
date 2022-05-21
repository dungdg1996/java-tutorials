package opp.package2;

import java.util.ArrayList;

public class Main {

	static double dienTich(HinhTron hinhTron) {
		return 3.14 * hinhTron.r * hinhTron.r;
	}

	static double dienTich(HinhVuong hinhVuong) {
		return hinhVuong.chieuDai * hinhVuong.chieuDai;
	}

	public static void main(String[] args) {
		HinhTron hinhTron = new HinhTron();
		hinhTron.r = 3;

		HinhVuong hv = new HinhVuong();
		hv.chieuDai = 10;
	

		System.out.println(dienTich(hv));
	}
}
