package chap18.textbook.exercise.p07;

import java.io.BufferedReader;
import java.io.FileReader;


public class AddLineNumberExample {
	public static void main(String[] args) throws Exception {
		// 정확한 경로를 수정하세요
		String filepath = "src/chap18/textbook/exercise/p07/AddLineNumberExample.java";
		FileReader fr = new FileReader(filepath);
		BufferedReader br = new BufferedReader(fr);
		
		String line;
		int lineNum = 0;
		while ((line = br.readLine()) != null) {
			lineNum++;
			System.out.println(lineNum + ":" + line);
		}
		

		br.close();
	}
}
