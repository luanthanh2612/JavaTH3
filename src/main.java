import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

	private static final String PATH = "Documents:\\text.rtf";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nhap();
		Xuat();

	}

	public static void Nhap() {
		int n;
		List<Kysu> listKS = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so ky su: ");
		n = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < n; i++) {
			Kysu ks = new Kysu();
			ks.Nhap();
			listKS.add(ks);
		}

		boolean kiemtra = ReadWriteFile.ghiFile(listKS, PATH);
		if (kiemtra) {
			System.out.println("Ghi Thanh Cong");
		} else {
			System.out.println("Ghi That Bai");
		}
	}

	public static void Xuat() {
		int maxNam = -1;

		List<Kysu> listks = ReadWriteFile.docFile(PATH);

		for (Kysu ks : listks) {
			if (ks.getNamTotNghiep() > maxNam)
				maxNam = ks.getNamTotNghiep();
		}
		System.out.println("Danh Sach Ky Su :");
		System.out.println("Ho ten \t Ngay Sinh \t Que Quan \t Ngay hoc \t Nam Tot Nghiep ");
		for (Kysu ks : listks) {
			if (ks.getNamTotNghiep() == maxNam)
				System.out.println(ks);
		}
	}

}
