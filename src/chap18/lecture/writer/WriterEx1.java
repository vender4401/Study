package chap18.lecture.writer;

import java.io.FileWriter;
import java.io.Writer;

public class WriterEx1 {
	public static void main(String[] args) throws Exception {
		String path = "writer.txt";
		Writer writer = new FileWriter(path);
		
		
		writer.write('한');
		
		char[] arr = new char[5];
		arr[0] = '자';
		arr[1] = '바';
		arr[2] = '최';
		arr[3] = '윤';
		arr[4] = '관';
		
		writer.write(arr);
		writer.write(arr, 2, 3);
		writer.write("\n이것이 자바여~");
		
		writer.close();
		
		
		
	}
}
