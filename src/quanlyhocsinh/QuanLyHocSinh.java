package quanlyhocsinh;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLyHocSinh {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// khởi tạo danh sách học sinh
		List<HocSinh> danhSachHs = new ArrayList<>();
		
		int luaChon = 0;
		while (luaChon != 7) {
			inMenu();
			luaChon = Integer.valueOf(scanner.nextLine());
			HocSinh hs;
			switch (luaChon) {
			case 1:
				// Nhập
				System.out.println("Nhập học sinh");
				System.out.print("- Họ và tên	: ");
				String hoVaTen = scanner.nextLine();
				System.out.print("- Năm sinh	: ");
				int namSinh = Integer.valueOf(scanner.nextLine());
				System.out.print("- TBM		: ");
				double trungBinhMon = Double.valueOf(scanner.nextLine());
				// Khởi tạo học sinh mới
				hs = new HocSinh(hoVaTen, namSinh, trungBinhMon);
				danhSachHs.add(hs);
				break;
			case 2:
				System.out.println("Danh sách học sinh:");
				for(HocSinh hocSinh: danhSachHs) {
					System.out.println(hocSinh.getHoVaTen() + "	" + hocSinh.getNamSinh() + "	" + hocSinh.getTrungBinhMon() + "	" + hocSinh.getXepLoai());
				}
				break;
			case 3:
				System.out.print("Bạn muốn xóa hs thứ mấy:");
				int stt = Integer.valueOf(scanner.nextLine());
				if(stt > danhSachHs.size()) {
					System.out.print("Không tìm thấy");
				} else {
					hs = danhSachHs.get(stt- 1);
					System.out.println("Đã xóa học sinh " + hs.getHoVaTen());
					danhSachHs.remove(stt - 1);
					for(HocSinh hocSinh: danhSachHs) {
						System.out.println(hocSinh.getHoVaTen() + "	" + hocSinh.getNamSinh() + "	" + hocSinh.getTrungBinhMon() + "	" + hocSinh.getXepLoai());
					}
				}
				break;
			case 4:
				// sắp xếp
				danhSachHs.sort((hs1, hs2) -> {
					if(hs1.getTrungBinhMon() > hs2.getTrungBinhMon()) {
						return 1;
					}
					return -1;
				});
				for(HocSinh hocSinh: danhSachHs) {
					System.out.println(hocSinh.getHoVaTen() + "	" + hocSinh.getNamSinh() + "	" + hocSinh.getTrungBinhMon() + "	" + hocSinh.getXepLoai());
				}
				break;
			case 5:
				System.out.println("Bạn đã chọn 5");
				break;
			case 6:
				System.out.println("Bạn đã chọn 6");
				break;

			default:
				System.out.println("Chương trình kết thúc");
				break;
			}
			
			//scanner.nextLine();
		}

	}

	public static void inMenu() {
		// in menu
		System.out.println("1. Nhập học sinh");
		System.out.println("2. In danh sách");
		System.out.println("3. Xóa học sinh");
		System.out.println("4. Sắp xếp theo TBM");
		System.out.println("5. Tìm điểm cao nhất");
		System.out.println("6. Tìm điểm TB");
		System.out.println("7. Thoát");
	}

}
