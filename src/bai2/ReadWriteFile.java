package bai2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteFile {
	public static boolean ghiFile(List<MayTinh> list, String Path) {

		try {

			FileOutputStream fos = new FileOutputStream(Path);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(list);

			oos.flush();
			oos.close();
			fos.close();

			return true;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}

	public static List<MayTinh> docFile(String path) {
		List<MayTinh> listMT = new ArrayList<>();

		try {

			FileInputStream fis = new FileInputStream(path);
			ObjectInputStream ois = new ObjectInputStream(fis);
			Object data = ois.readObject();
			listMT = (List<MayTinh>) data;

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return listMT;
	}
}
