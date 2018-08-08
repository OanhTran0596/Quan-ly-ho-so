package quanlyhoso;

import java.util.Scanner;

public class Quanlyhoso extends HoSoHocSinh {
	public static final int NHAP_DANH_SACH_HOC_SINH = 1;
	public static final int HIEN_THI_DANH_SACH = 2;
	public static final int HIEN_THI_HS_SINH_NAM_2002 = 3;
	public static final int COUNT = 4;
	public static final int EXIT = 5;
	 int luaChon = 0;

	static HoSoHocSinh[] danhSach = null;

	public void showMainApp() {

		System.out.println("----------------------------------------------------------------");
		System.out.println(NHAP_DANH_SACH_HOC_SINH + ".Nhap danh sach hoc sinh");
		System.out.println(HIEN_THI_DANH_SACH + ".Hien thi danh sach hoc sinh");
		System.out.println(HIEN_THI_HS_SINH_NAM_2002+ ".Hien thi danh sach hoc sinh sinh nam 2002");
		System.out.println(COUNT+ ".Dem so hoc sinh sinh nam 2002 va que ha tinh");
		System.out.println(EXIT + ".Thoat chuong trinh");
		System.out.println("----------------------------------------------------------------");

	}
	public void runMainApp(){
		do {
			do {
				System.out.println("Nhap vao lua chon:");
				luaChon = new Scanner(System.in).nextInt();
				if (luaChon < 0 || luaChon > 5) {
					System.out.println("Nhap sai lua chon. Moi nhap lai!");
				}
			} while (luaChon < 0 || luaChon > 5);
			switch (luaChon) {
			case NHAP_DANH_SACH_HOC_SINH: {
				int n;
				do {
					System.out.println("Nhap vao so luong hoc sinh:");
					n = new Scanner(System.in).nextInt();
					if (n < 0) {
						System.out.println("So luong hoc sinh phai lon hon 0.");
					}
				} while (n < 0);
				danhSach = new HoSoHocSinh[n];
				for (int i = 0; i < danhSach.length; i++) {
					danhSach[i] = new HoSoHocSinh();
					System.out.println("Nhap thi sinh thu " + (i + 1));
					danhSach[i].nhapThongTin();
					System.out.println("  ");
				}
			}
				break;
			case HIEN_THI_DANH_SACH: {
				if (danhSach != null) {
					for (int i = 0; i < danhSach.length; i++) {
						System.out.println(i + 1 + ".");
						danhSach[i].hienThi();
						System.out.println("  ");
					}
				} else {
					System.out.println("Danh sach khong co hoc sinh!");
				}
			}
				break;
			case HIEN_THI_HS_SINH_NAM_2002: {
				if (danhSach != null) {
					for (int i = 0; i < danhSach.length; i++) {
						if (danhSach[i].getNamSinh() == 2002) {
							danhSach[i].hienThi();
							System.out.println("  ");
						}
					}
				}else {
					System.out.println("Danh sach khong co hoc sinh!");
				}
			}
				break;
			case COUNT: {
				int dem = 0;
				if (danhSach != null) {
					for (int i = 0; i < danhSach.length; i++) {
						if ((danhSach[i].getNamSinh() == 2002)
								&& (danhSach[i].getQueQuan()
										.equalsIgnoreCase("ha noi"))) {
							dem++;
						}
					}
				}else {
					System.out.println("Danh sach khong co hoc sinh!");
				}
				System.out.println("So luong hoc sinh sinh nam 2002 va que o ha noi la:"
								+ dem);
			}
				break;
			case EXIT:
				System.exit(0);
				break;
			default:
				break;
			}

		} while (luaChon != 5);
	
	}
	
}