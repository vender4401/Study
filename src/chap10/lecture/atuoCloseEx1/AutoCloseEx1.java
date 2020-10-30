package chap10.lecture.atuoCloseEx1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class AutoCloseEx1 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("file.txt");

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		// new version
		// try-with-resources
		try(FileInputStream fis1 = new FileInputStream("file.txt")) {
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
