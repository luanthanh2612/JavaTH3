package bai2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class main {
	public static final String PATH = "Documents:\\maytinh.rtf";
	static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int chon = 0;
		sc = new Scanner(System.in);

		System.out.println("---------Menu---------");

		System.out.println("1. Thêm sản sản phẩm");

		System.out.println("2. Hiển thị danh sách sản phẩm");

		System.out.println("3. Hiển thị danh sách sản phẩm theo nhà sản xuất");

		System.out.println("0. Thoát");

		do {
			System.out.print("Chọn thao tác: ");

			chon = Integer.parseInt(sc.nextLine());

			switch (chon)

			{

			case 0:

				System.out.println("Thoát!");

				break;

			case 1:

				Nhap();

				break;

			case 2:

				System.out.println("---Danh sách sản phẩm---");
				Xuat();
				break;

			case 3:

				System.out.print("Nhập nhà sản xuất: ");

				String nhaSanXuat = sc.nextLine();

				inDS(nhaSanXuat);

				break;

			default:

				System.out.println("Bạn chọn sai thao tác!");

				break;

			}
			;

			System.out.println();

		} while (chon != 0);

	}

	private static void inDS(String nhaSanXuat) {

		List<MayTinh> list = ReadWriteFile.docFile(PATH);

		// System.out.println("Danh Sach May Tinh:");
		System.out.println("Danh Sach May Tinh:");
		System.out.println("Nhan Hieu\tNha San Xuat\tDia Chi\tGia Thanh\tToc Do\tDung Luong Ram\tDung Luong HDD");
		Collections.sort(list);
		for (MayTinh MT : list) {
			if (MT.getNhaSanXuat().getTenNSX().equals(nhaSanXuat)) {
				System.out.println(MT);
			} else {
				System.out.println("Khong Tim Thay Nha San Xuat");
				return;
			}
		}

	}

	public static void Nhap() {
		int n;
		List<MayTinh> list = new ArrayList<>();
		sc = new Scanner(System.in);
		System.out.println("Nhap so may tinh :");
		n = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < n; i++) {

			System.out.println("----Nhap Danh Sach May Tinh----");
			MayTinh mt = new MayTinh();
			mt.Nhap();
			list.add(mt);

		}

		boolean check = ReadWriteFile.ghiFile(list, PATH);
		if (check) {
			System.out.println("Ghi Thanh Cong");
		} else {
			System.out.println("Ghi That Bai");
		}

		// for (MayTinh MT : list) {
		// System.out.println(MT);
		// }

	}

	public static void Xuat() {

		List<MayTinh> list = ReadWriteFile.docFile(PATH);

		// System.out.println("Danh Sach May Tinh:");
		System.out.println("Danh Sach May Tinh:");
		System.out.println("Nhan Hieu\tNha San Xuat\tDia Chi\tGia Thanh\tToc Do\tDung Luong Ram\tDung Luong HDD");
		Collections.sort(list);

		for (MayTinh mt : list) {
			System.out.println(mt);
		}

	}

}
