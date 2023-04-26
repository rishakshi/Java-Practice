package ioStream;

import java.io.*;
import java.util.*;

public class StudentRecordReader {

	DataInputStream dataInput;

	public StudentRecordReader(String inputFile) throws FileNotFoundException {
		dataInput = new DataInputStream(new FileInputStream(inputFile));
	}

	public List<Student> readAll() throws IOException {
		List<Student> list = new ArrayList<>();

		try {
			while (true) {
				String name = dataInput.readUTF();
				boolean gender = dataInput.readBoolean();
				int age = dataInput.readInt();
				float grade = dataInput.readFloat();

				System.out.println("Name : " + name);

				Student student = new Student(name, gender, age, grade);

				list.add(student);
			}
		} catch (Exception e) {
//			e.printStackTrace();
		}

		dataInput.close();
		return list;
	}

	public static void main(String[] args) {

//		if(args.length < 1) {
//			System.out.println("Please provide output file");
//			System.exit(0);
//		}

		String inputfile = "D:\\Wiley Edge Training\\Java Practice\\day4_5_class\\Wiley_core_java\\data\\student1.dat";
		try {
			StudentRecordReader reader = new StudentRecordReader(inputfile);
			
			List<Student> lst = reader.readAll();
			
			for(Student stu : lst) {
				System.out.print(stu.getName() + "\t");
				System.out.print(stu.getGender() + "\t");
				System.out.print(stu.getAge() + "\t");
				System.out.println(stu.getGrade());

			}
		}
		catch(Exception e) {
			// TODO
			e.printStackTrace();
		}
		
	}

}
