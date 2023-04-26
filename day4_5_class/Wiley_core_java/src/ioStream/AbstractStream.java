package ioStream;

import java.io.*;

public class AbstractStream {
	
	public static void main(String[] args) throws IOException {
		
		OutputStream fout = new FileOutputStream("D:\\Wiley Edge Training\\Java Practice\\day4_5_class\\Wiley_core_java\\data\\file.txt");
		
		String str = "Wiley Edge Training ILT";
		
		byte[] b = str.getBytes();
		
		fout.write(b);
		fout.flush();
		fout.close();
		
	}

}
