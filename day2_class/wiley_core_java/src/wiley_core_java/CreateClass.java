package wiley_core_java;

public class CreateClass implements Cloneable {

	int a = 10;

	public void add() {
		System.out.println("Number Adding");
	}

	public static void main(String[] args)
			throws InstantiationException, 
			IllegalAccessException, 
			CloneNotSupportedException {

		// Create object with new keyword
		CreateClass cc = new CreateClass();
		cc.add();
		System.out.println(cc);

		// Create object with newInstance()
		try {
			Class c = Class.forName("wiley_core_java.CreateClass");
			CreateClass ci = (CreateClass) c.newInstance();
			ci.add();
			System.out.println(ci);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Create object with Object.clone()
		CreateClass objClone = (CreateClass) cc.clone();
		objClone.add();
		System.out.println(objClone);

	}

}
