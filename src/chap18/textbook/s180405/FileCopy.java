package chap18.textbook.s180405;

import java.io.FileReader;
import java.io.FileWriter;

public class FileCopy {
	public static void main(String[] args) throws Exception{
		String src = "src/chap18/textbook/s180405/FileCopy.java";
		String des = "file-copy.txt";
		
		// Reader, Writer 사용
		FileReader fr = new FileReader(src);
		FileWriter fw = new FileWriter(des);
		
		int readNo = 0;
		char[] arr = new char[2];
		
		while((readNo=fr.read(arr)) != -1) {
			fw.write(arr, 0, readNo);
		}		
		
		
		fr.close();
		fw.close();
		System.out.println("파일 저장 완료");
		
	}
}
