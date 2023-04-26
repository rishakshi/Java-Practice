package ioStream;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class Student {
	private String name;
	private String gender;
	private int age;
	private float grade;
	
	public Student(String name, String gender, int age, float grade) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
	
}

public class StudentRecordOutput {
	
	DataOutputStream dos;
	
	public StudentRecordOutput(String outputFile) throws FileNotFoundException {
		dos = new DataOutputStream(new FileOutputStream(outputFile));
	}
	
	public void writer(Student student) throws IOException {
		
		dos.writeUTF(student.getName());
		dos.writeUTF(student.getGender());
		dos.writeInt(student.getAge());
		dos.writeFloat(student.getGrade());
		dos.writeUTF("\n\n");
		
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
		
		String outputfile = "D:\\Wiley Edge Training\\Java Practice\\day4_class\\Wiley_core_java\\data\\student.txt";
		
		List<Student> list = new ArrayList<>();
		
		list.add(new Student("Krishna", "Female", 21, 89.1f));
		list.add(new Student("Prachi", "Female", 20, 90.1f));
		list.add(new Student("Roohi", "Female", 19, 91.1f));
		list.add(new Student("Ridhi", "Female", 22, 80.1f));
		list.add(new Student("Harsh", "Male", 35, 97.1f));
		
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
