package ioStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreams {

	public static void main(String[] args) throws IOException {

//		FileOutputStream fout = new FileOutputStream(
//				"D:\\Wiley Edge Training\\Java Practice\\day4_5_class\\Wiley_core_java\\data\\file.txt");
//
//		String str = "Wiley Fullstack project";
//
//		byte[] b = str.getBytes();
//
//		fout.write(b);
//		fout.flush();
//		fout.close();

		FileInputStream fin = new FileInputStream(
				"D:\\Wiley Edge Training\\Java Practice\\day4_5_class\\Wiley_core_java\\data\\file.txt");

		int i;
		while ((i = fin.read()) != -1) {
			System.out.println((char) i);
		}

		fin.close();

	}

}
