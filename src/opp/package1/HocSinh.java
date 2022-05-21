package opp.package1;

public class HocSinh {
	private String hoVaTen;
	private int tuoi;
	private int namSinh;
	double diemToan;
	
	public HocSinh() {
		this.hoVaTen = "Contructor 0";
	}
	
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
		this.namSinh = 2022 - tuoi;
	}
	
	public int getTuoi() {
		return this.tuoi;
	}
	
	public int getNamSinh() {
		return this.namSinh;
	}
	
	public String getHoVaTen() {
		return hoVaTen;
	}
	
	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}

}
