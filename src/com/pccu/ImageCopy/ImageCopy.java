package com.pccu.ImageCopy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageCopy {
	
	public static void Copy(String i, String o) {
		if (i == o) {
			System.out.println();
			return;
		}
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream("src/"+i);
			fos = new FileOutputStream("src/"+o);
			int flag = 0;
			while((flag = fis.read()) != -1) {
				fos.write(flag);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fis != null) fis.close();
				if (fos != null) fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("Copy completed.");
		}
	}
	
	public static void main(String[] args) {
		
		Copy("documents/abstract1.txt",
			 "documents/abstract1(1).txt"
		);
		
	}

}
