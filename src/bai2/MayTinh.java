package bai2;

import java.util.Scanner;

public class MayTinh extends May {
	private int tocDo;
	private int dungLuongRam;
	private int dungLuongHDD;

	/**
	 * @param nhanHieu
	 * @param nhaSanXuat
	 * @param giaThanh
	 * @param tocDo
	 * @param dungLuongRam
	 * @param dungLuongHDD
	 */
	public MayTinh(String nhanHieu, NhaSanXuat nhaSanXuat, int giaThanh, int tocDo, int dungLuongRam,
			int dungLuongHDD) {
		super(nhanHieu, nhaSanXuat, giaThanh);
		this.tocDo = tocDo;
		this.dungLuongRam = dungLuongRam;
		this.dungLuongHDD = dungLuongHDD;
	}

	/**
	 * 
	 */
	public MayTinh() {
		super();
	}

	public int getTocDo() {
		return tocDo;
	}

	public void setTocDo(int tocDo) {
		this.tocDo = tocDo;
	}

	public int getDungLuongRam() {
		return dungLuongRam;
	}

	public void setDungLuongRam(int dungLuongRam) {
		this.dungLuongRam = dungLuongRam;
	}

	public int getDungLuongHDD() {
		return dungLuongHDD;
	}

	public void setDungLuongHDD(int dungLuongHDD) {
		this.dungLuongHDD = dungLuongHDD;
	}

	@Override
	public String toString() {
		return this.getNhanHieu() + "\t" + this.getNhaSanXuat().getTenNSX() + "\t" + this.getNhaSanXuat().getDiaChi()
				+ "\t" + this.getGiaThanh() + "\t" + this.getTocDo() + "\t" + this.getDungLuongRam() + "\t"
				+ this.getDungLuongHDD();

	}

	@Override
	public void Nhap() {
		super.Nhap();
		Scanner sc = new Scanner(System.in);

		System.out.println("Nhap Toc Do :");
		this.tocDo = Integer.parseInt(sc.nextLine());

		System.out.println("Nhap Dung Luong Ram :");
		this.dungLuongRam = Integer.parseInt(sc.nextLine());

		System.out.println("Nhap Dung Luong HDD :");
		this.dungLuongHDD = Integer.parseInt(sc.nextLine());

	}
}
