package ioStream;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class StudentRecordOutput {
	
	DataOutputStream dos;
	
	public StudentRecordOutput(String outputFile) throws FileNotFoundException {
		dos = new DataOutputStream(new FileOutputStream(outputFile));
	}
	
	public void writer(Student student) throws IOException {
		
//		dos.writeBytes(student.getName().toString() + " ");
//		dos.writeBytes((String.valueOf(student.getGender())).toString() + " ");	
//		dos.writeBytes((String.valueOf(student.getAge())).toString() + " ");	
//		dos.writeBytes((String.valueOf(student.getGrade())).toString() + "\n");
		
		dos.writeUTF(student.getName());
		dos.writeBoolean(student.getGender());
		dos.writeInt(student.getAge());
		dos.writeFloat(student.getGrade());
		
	}
	
	public void save() throws IOException {
		
		dos.close();
		
	}
	
	public static void main(String[] args) {
		
//		if(args.length < 1) {
//			System.out.println("Please provide output file");
//			System.exit(0);
//		}
		
//		String outputfile = args[0];
		
		String outputfile = "D:\\Wiley Edge Training\\Java Practice\\day4_5_class\\Wiley_core_java\\data\\student1.dat";
		
		List<Student> list = new ArrayList<>();
		
		list.add(new Student("Krishna", false, 21, 89.1f));
		list.add(new Student("Prachi", false, 20, 90.1f));
		list.add(new Student("Roohi", false, 19, 91.1f));
		list.add(new Student("Ridhi", false, 22, 80.1f));
		list.add(new Student("Harsh", true, 35, 97.1f));
		
		try {
			StudentRecordOutput outputWriter = new StudentRecordOutput(outputfile);
			
			for(Student stu : list) {
				outputWriter.writer(stu);
			}
			
			outputWriter.save();
			
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
