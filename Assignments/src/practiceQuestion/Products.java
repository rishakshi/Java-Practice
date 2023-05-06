package practiceQuestion;

import java.io.*;
import java.util.*;

public class Products {

	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader(
				"D:\\Wiley Edge Training\\Java Practice\\day6_7_class\\Wiley_core_java\\data\\products.csv");

		BufferedReader br = new BufferedReader(fr);
		
//		Scanner sc = new Scanner(fr);
//		String str = sc.nextLine();
		
		String str = br.readLine();
        StringTokenizer st = null;
        ArrayList<ArrayList<String>> list = new ArrayList<>();
        
        while ( str!= null) {
        	ArrayList<String> l = new ArrayList<>();
            st = new StringTokenizer(str, ",");
            while (st.hasMoreTokens()) {
            	l.add(st.nextToken());
            }
            str = br.readLine();
            list.add(l);
        }
        
        for(int i=0; i<list.size(); i++) {
        	System.out.print("Name : " + list.get(i).get(0) + ",\t\t");
        	System.out.print("Price : " + list.get(i).get(1) + ",\t\t");
        	System.out.print("Type : " + list.get(i).get(2) + ",\t\t");
        	System.out.println("Rating : " + list.get(i).get(3));
        }
        
		fr.close();
		br.close();

	}

}
