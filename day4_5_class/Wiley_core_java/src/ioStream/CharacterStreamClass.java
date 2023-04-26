package ioStream;

import java.io.*;

public class CharacterStreamClass {
	
	public static void main(String[] args) throws IOException {
		
		Writer out = new OutputStreamWriter(System.out);
		Writer fw = new FileWriter("D:\\Wiley Edge Training\\Java Practice\\day4_5_class\\Wiley_core_java\\data\\file.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("I like programming, what to do");
		
		bw.flush();
		bw.close();
		fw.close();
		
		Reader fr = new FileReader("D:\\Wiley Edge Training\\Java Practice\\day4_5_class\\Wiley_core_java\\data\\file.txt");
		BufferedReader br = new BufferedReader(fr);
		
		int i;
		
		while((i = br.read()) != -1) {
			System.out.println((char) i);
		}
		
		br.close();
		fr.close();
		
		
		
	}

}
