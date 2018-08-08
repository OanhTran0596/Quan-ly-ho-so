package quanlyhoso;

import java.util.Scanner;

public class HoSoHocSinh extends AbsNguoi {
	private String lop;
	private String khoaHoc;
	private int kyHoc;

	public String getLop() {
		return lop;
	}

	public void setLop(String lop) {
		this.lop = lop;
	}

	public String getKhoaHoc() {
		return khoaHoc;
	}

	public void setKhoaHoc(String khoaHoc) {
		this.khoaHoc = khoaHoc;
	}

	public int getKyHoc() {
		return kyHoc;
	}

	public void setKyHoc(int kyHoc) {
		this.kyHoc = kyHoc;
	}

	public HoSoHocSinh() {
		super();
	}

	public HoSoHocSinh(String lop, String khoaHoc, int kyHoc) {
		super();
		this.lop = lop;
		this.khoaHoc = khoaHoc;
		this.kyHoc = kyHoc;
	}
	@Override
	public void nhapThongTin() {
		// TODO Auto-generated method stub
		super.nhapThongTin();
		System.out.println("Nhap vao ten lop:");
		this.lop = new Scanner(System.in).nextLine();
		
		System.out.println("Nhap vao khoa hoc:");
		this.khoaHoc = new Scanner(System.in).nextLine();
		
		System.out.println("Nhap vao ky hoc:");
		this.kyHoc = new Scanner(System.in).nextInt();
		
	}
	@Override
	public void hienThi() {
		// TODO Auto-generated method stub
		super.hienThi();
		System.out.println("Lop:"+this.getLop());
		System.out.println("Khoa hoc:"+ this.getKhoaHoc());
		System.out.println("ky hoc:"+ this.getKyHoc());
	}
}
