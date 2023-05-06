package streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {

		List<Student> listOfStudents = new ArrayList<>();

		listOfStudents.add(new Student(1, 93, "Prachi", 4.5));
		listOfStudents.add(new Student(1, 92, "Shalu", 3.9));
		listOfStudents.add(new Student(1, 94, "Janavi", 4.5));
		listOfStudents.add(new Student(1, 90, "Nisha", 3.8));
		listOfStudents.add(new Student(1, 97, "Dimple", 4.5));
		listOfStudents.add(new Student(1, 99, "Prachi", 3.5));
		listOfStudents.add(new Student(2, 96, "Krishna", 4.8));
		listOfStudents.add(new Student(3, 89, "Shakshi", 3.4));
		listOfStudents.add(new Student(4, 86, "Kritika", 4.7));
		listOfStudents.add(new Student(5, 98, "Filza", 4.6));
		listOfStudents.add(new Student(6, 87, "Sneha", 4.4));
		
		Stream<Student> studentStream = listOfStudents.stream();
		List<Student> filteredData = studentStream.filter(n -> n.getProblems_solved() > 90).collect(Collectors.toList());
		System.out.println("Filtered Students by problems_solved:\n" + filteredData);
		
		studentStream = listOfStudents.stream();
		filteredData = studentStream.filter(n -> n.getProblems_solved() > 90).collect(Collectors.toList());
		System.out.println("\nFiltered Students by grades:\n" + filteredData);

		studentStream = listOfStudents.stream();
		filteredData = studentStream.filter(n -> n.getGrade() > 4.0)
				.sorted(Comparator.comparingDouble(Student::getGrade).reversed()).collect(Collectors.toList());
		System.out.println("\nFiltered Students by problems_solved and sorted in reversed order:\n" + filteredData);
		
		studentStream = listOfStudents.stream();
		filteredData = studentStream.filter(n -> n.getGrade() > 4.0)
				.sorted(Comparator.comparingDouble(Student::getGrade).reversed()).collect(Collectors.toList());
		System.out.println("\nFiltered Students by grades and sorted in reversed order:\n" + filteredData);
		
		studentStream = listOfStudents.stream();
		filteredData = studentStream.filter(n -> n.getGrade() > 4.0)
				.sorted(Comparator.comparingDouble(Student::getGrade).reversed()).limit(5).collect(Collectors.toList());
		System.out.println("\nFiltered Students by problems_solved and sorted in reversed order with limit 5 :\n" + filteredData);
		
		studentStream = listOfStudents.stream();
		filteredData = studentStream.filter(n -> n.getGrade() > 4.0)
				.sorted(Comparator.comparingDouble(Student::getGrade).reversed()).limit(5).collect(Collectors.toList());
		System.out.println("\nFiltered Students by grades and sorted in reversed order with limit 5 :\n" + filteredData);

	}

}
