package streams;

public class Student {

	private int Id, problems_solved;
	private String name;
	private double grade;

	public Student(int id, int problems_solved, String name, double grade) {
		super();
		Id = id;
		this.problems_solved = problems_solved;
		this.name = name;
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student [Id=" + Id + ", problems_solved=" + problems_solved + ", name=" + name + ", grade=" + grade
				+ "]";
	}
	
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public int getProblems_solved() {
		return problems_solved;
	}

	public void setProblems_solved(int problems_solved) {
		this.problems_solved = problems_solved;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}

}
