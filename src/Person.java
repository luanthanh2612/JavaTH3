import java.io.Serializable;

public class Person implements Serializable {
	private String hoTen;
	private String namSinh;
	private String queQuan;

	/**
	 * @param hoTen
	 * @param namSinh
	 * @param queQuan
	 */
	public Person(String hoTen, String namSinh, String queQuan) {
		super();
		this.hoTen = hoTen;
		this.namSinh = namSinh;
		this.queQuan = queQuan;
	}

	/**
	 * 
	 */
	public Person() {
		super();
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getNamSinh() {
		return namSinh;
	}

	public void setNamSinh(String namSinh) {
		this.namSinh = namSinh;
	}

	public String getQueQuan() {
		return queQuan;
	}

	public void setQueQuan(String queQuan) {
		this.queQuan = queQuan;
	}

	@Override
	public String toString() {
		return "Person [hoTen=" + hoTen + ", namSinh=" + namSinh + ", queQuan=" + queQuan + "]";
	}

}
