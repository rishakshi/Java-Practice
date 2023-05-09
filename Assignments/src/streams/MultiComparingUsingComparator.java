package streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MultiComparingUsingComparator {
    public static void main(String[] args) {
        List<Student> listOfStudents = new ArrayList<>();
		listOfStudents.add(new Student(1, 97, "Dimple", 4.5));
		listOfStudents.add(new Student(1, 99, "Prachi", 3.5));
		listOfStudents.add(new Student(2, 96, "Krishna", 4.8));
		listOfStudents.add(new Student(2, 89, "Shakshi", 3.4));
		listOfStudents.add(new Student(4, 86, "Kritika", 4.7));
		listOfStudents.add(new Student(5, 98, "Filza", 4.6));
		listOfStudents.add(new Student(6, 87, "Sneha", 4.4));

        // Sort students by last name, then first name, then age, then GPA
        Comparator<Student> byName = Comparator.comparing(Student::getName);
        Comparator<Student> byProblemSolved = Comparator.comparingInt(Student::getProblems_solved);
        Comparator<Student> byId = Comparator.comparingInt(Student::getId);
        Comparator<Student> byGrade = Comparator.comparingDouble(Student::getGrade);

        listOfStudents.sort(byId.thenComparing(byProblemSolved).thenComparing(byName).thenComparing(byGrade));

        for (Student student : listOfStudents) {
            System.out.println(student);
        }
    }
}
