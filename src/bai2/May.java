package bai2;

import java.io.Serializable;
import java.util.Scanner;

public class May implements Serializable, Comparable<May> {
	private String nhanHieu;
	private NhaSanXuat nhaSanXuat;
	private int giaThanh;

	/**
	 * @param nhanHieu
	 * @param nhaSanXuat
	 * @param giaThanh
	 */
	public May(String nhanHieu, NhaSanXuat nhaSanXuat, int giaThanh) {
		super();
		this.nhanHieu = nhanHieu;
		this.nhaSanXuat = nhaSanXuat;
		this.giaThanh = giaThanh;
	}

	/**
	 * 
	 */
	public May() {
		super();
	}

	public String getNhanHieu() {
		return nhanHieu;
	}

	public void setNhanHieu(String nhanHieu) {
		this.nhanHieu = nhanHieu;
	}

	public NhaSanXuat getNhaSanXuat() {
		return nhaSanXuat;
	}

	public void setNhaSanXuat(NhaSanXuat nhaSanXuat) {
		this.nhaSanXuat = nhaSanXuat;
	}

	public int getGiaThanh() {
		return giaThanh;
	}

	public void setGiaThanh(int giaThanh) {
		this.giaThanh = giaThanh;
	}

	public void Nhap() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Nhap Nhan Hieu :");
		this.nhanHieu = sc.nextLine();

		NhaSanXuat sx = new NhaSanXuat();
		this.setNhaSanXuat(sx.input());

		System.out.println("Nhap Gia Thanh :");
		this.giaThanh = Integer.parseInt(sc.nextLine());

	}

	@Override
	public int compareTo(May o) {
		if (this.getGiaThanh() < o.giaThanh) {
			return 0;
		}
		return -1;
	}

}
