import java.util.Scanner;

public class Kysu extends Person {

	private String ngayHoc;
	private int namTotNghiep;

	/**
	 * @param hoTen
	 * @param namSinh
	 * @param queQuan
	 * @param ngayHoc
	 * @param namTotNghiep
	 */
	public Kysu(String hoTen, String namSinh, String queQuan, String ngayHoc, int namTotNghiep) {
		super(hoTen, namSinh, queQuan);
		this.ngayHoc = ngayHoc;
		this.namTotNghiep = namTotNghiep;
	}

	/**
	 * 
	 */
	public Kysu() {
		super();
	}

	public String getNgayHoc() {
		return ngayHoc;
	}

	public void setNgayHoc(String ngayHoc) {
		this.ngayHoc = ngayHoc;
	}

	public int getNamTotNghiep() {
		return namTotNghiep;
	}

	public void setNamTotNghiep(int namTotNghiep) {
		this.namTotNghiep = namTotNghiep;
	}

	@Override
	public String toString() {
		return this.getHoTen() + "\t" + this.getNamSinh() + "\t" + this.getQueQuan() + "\t" + this.getNgayHoc() + "\t"
				+ this.getNamTotNghiep();
	}

	public void Nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("----Nhap Danh Sach Ky Su-----");
		System.out.println("Nhap ho ten :");
		this.setHoTen(sc.nextLine());

		System.out.println("Nhap Ngay Sinh :");
		this.setNamSinh(sc.nextLine());

		System.out.println("Nhap Que Quan :");
		this.setQueQuan(sc.nextLine());

		System.out.println("Nhap Ngay Hoc :");
		this.ngayHoc = sc.nextLine();

		System.out.println("Nhap Nam Tot Nghiep :");
		this.namTotNghiep = Integer.parseInt(sc.nextLine());

	}

}
