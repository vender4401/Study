package chap18.textbook.s180502;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedOutputStreamExample {
	public static void main(String[] args) throws Exception{
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		int data = -1;
		long start = 0;
		long end = 0;
		long start2 = 0;
		long end2 = 0;
		
		
		fis = new FileInputStream("jennie.jpg");
		bis = new BufferedInputStream(fis);
		fos = new FileOutputStream("copy01. jennie.jpg");
		start = System.nanoTime();
		start2 = System.currentTimeMillis();
		while ((data = bis.read()) != -1) {
			fos.write(data);
		}
		fos.flush();
		end = System.nanoTime();
		end2 = System.currentTimeMillis();
		fos.close();
		bis.close();
		fis.close();
		System.out.println("사용하지 않았을때: " + (end-start) + "ns");
		System.out.println("사용하지 않았을때: " + (end2-start2) + "ms");
		
		System.out.println("---------------------------------------");
		
		fis = new FileInputStream("jennie.jpg");
		bis = new BufferedInputStream(fis);
		fos = new FileOutputStream("copy01. jennie.jpg");
		bos = new BufferedOutputStream(fos);
		start = System.nanoTime();
		start2 = System.currentTimeMillis();
		while ((data = bis.read()) != -1) {
			bos.write(data);
		}
		fos.flush();
		end = System.nanoTime();
		end2 = System.currentTimeMillis();
		fos.close();
		bis.close();
		fis.close();
		System.out.println("사용했을 때: " + (end-start) + "ns");
		System.out.println("사용했을 때: " + (end2-start2) + "ms");
		
	}
}
