package JavaThreads;

class Parent {
	public void m1() {
		System.out.println("m1 method");
	}
}

class T1 extends Thread{

	@Override
	public void run() {
		System.out.println("By Thread Class");
	}
	
}

//class T2 extends Parent implements Runnable{
class T2 extends Parent implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		m1();
		System.out.println("By Runnable interface");
		
	}
	
	
}

public class ThreadConcept {
	
	public static void main(String[] args) {
		
		T1 t1 = new T1();
		t1.start();
		
		T2 t2 = new T2();
		Thread trd = new Thread(t2);
		trd.start();
		
	}

}
