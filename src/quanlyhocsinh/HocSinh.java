package quanlyhocsinh;

public class HocSinh {
	private String hoVaTen;
	private int namSinh;
	private double trungBinhMon;
	private String xepLoai; // G K TB Y
	
	public HocSinh(String hoVaTen, int namSinh, double trungBinhMon) {
		super();
		this.hoVaTen = hoVaTen;
		this.namSinh = namSinh;
		this.trungBinhMon = trungBinhMon;
	}

	public String getHoVaTen() {
		return hoVaTen;
	}

	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}

	public int getNamSinh() {
		return namSinh;
	}

	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}

	public double getTrungBinhMon() {
		return trungBinhMon;
	}

	public void setTrungBinhMon(double trungBinhMon) {
		this.trungBinhMon = trungBinhMon;
	}

	public String getXepLoai() {
		if(trungBinhMon > 8) {
			return "Giỏi";
		} else if (trungBinhMon > 6.5) {
			return "Khá";
		} else if (trungBinhMon > 5) {
			return "TB";
		} else {
			return "Yếu";
		}
	}
	
}
