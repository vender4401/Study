package chap18.lecture.filterstream;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class InputStreamReaderEx3 {
	public static void main(String[] args) throws Exception{
		String path = "outputstreamReader.txt";
		FileOutputStream fos = new FileOutputStream(path);
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		
//		fos.write('한');
		osw.write('한');
		
//		fos.close();
		osw.close();
		
		
	}
}
