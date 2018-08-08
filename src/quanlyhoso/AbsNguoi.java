package quanlyhoso;

import java.util.Scanner;

public abstract class AbsNguoi implements ImpNguoi {
	private String hoTen;
	private int tuoi;
	private int namSinh;
	private String queQuan;

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	public int getNamSinh() {
		return namSinh;
	}

	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}

	public String getQueQuan() {
		return queQuan;
	}

	public void setQueQuan(String queQuan) {
		this.queQuan = queQuan;
	}

	public AbsNguoi() {
		super();
	}

	public AbsNguoi(String hoTen, int tuoi, int namSinh, String queQuan) {
		super();
		this.hoTen = hoTen;
		this.tuoi = tuoi;
		this.namSinh = namSinh;
		this.queQuan = queQuan;
	}

	@Override
	public void nhapThongTin() {
		System.out.println("Nhap ho ten:");
		this.hoTen = new Scanner(System.in).nextLine();

		System.out.println("Nhap tuoi:");
		this.tuoi = new Scanner(System.in).nextInt();

		System.out.println("Nhap nam sinh:");
		this.namSinh = new Scanner(System.in).nextInt();

		System.out.println("Nhap que quan :");
		this.queQuan = new Scanner(System.in).nextLine();

	}

	@Override
	public void hienThi() {
		System.out.println("Ho ten:" + this.getHoTen());
		System.out.println("Tuoi:" + this.getTuoi());
		System.out.println("Nam sinh:" + this.getNamSinh());
		System.out.println("Que quan:" + this.getQueQuan());

	}
}
