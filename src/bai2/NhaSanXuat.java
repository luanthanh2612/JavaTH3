package bai2;

import java.io.Serializable;
import java.util.Scanner;

public class NhaSanXuat implements Serializable {
	private String tenNSX;
	private String diaChi;

	// private static NhaSanXuat Instance;
	//
	// private NhaSanXuat(){
	//
	// }
	// public static NhaSanXuat getInstance(){
	// if(Instance == null){
	// Instance = new NhaSanXuat();
	// }
	// return Instance;
	// }
	// public void Nhap(){
	// Scanner sc = new Scanner(System.in);
	//
	// System.out.println("Nhap Ten Nha San Xuat :");
	// tenNSX = sc.nextLine();
	//
	// System.out.println("Nhap Dia Chi :");
	// diaChi = sc.nextLine();
	//
	// }
	public NhaSanXuat input() {
		NhaSanXuat sx = new NhaSanXuat();

		Scanner sc = new Scanner(System.in);

		System.out.println("Nhap Ten Nha San Xuat :");
		String tenNSX = sc.nextLine();
		sx.setTenNSX(tenNSX);

		System.out.println("Nhap Dia chi :");
		String DiaChi = sc.nextLine();
		sx.setDiaChi(DiaChi);

		return sx;

	}

	public String getTenNSX() {
		return tenNSX;
	}

	public void setTenNSX(String tenNSX) {
		this.tenNSX = tenNSX;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

}
