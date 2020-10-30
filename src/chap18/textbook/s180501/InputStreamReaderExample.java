package chap18.textbook.s180501;

import java.io.InputStreamReader;
import java.io.Reader;
import java.io.InputStream;

public class InputStreamReaderExample {
	public static void main(String[] args) throws Exception {
		InputStream is = System.in;
		Reader reader = new InputStreamReader(is);
		
		int readCharNo;
		char[] arr = new char [100];
		while((readCharNo=reader.read(arr)) != -1) {
			String data = new String(arr, 0, readCharNo);
		}
		
		reader.close();
		
	}
}
