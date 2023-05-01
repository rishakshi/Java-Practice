package JavaThreads;

class SupportClass extends Thread {
	
	@Override
	public void run() {
		
		if(Thread.currentThread().isDaemon()) {
			System.out.println("This is daemon");
		}
		else {
			System.out.println("This is not daemon");
		}
		
	}
	
}

public class DemonType {
	
	public static void main(String[] args) {
		
		SupportClass t1 = new SupportClass();
		SupportClass t2 = new SupportClass();
		SupportClass t3 = new SupportClass();
		
		t1.setDaemon(false);
		t2.setDaemon(true);
		t3.setDaemon(true);
		
		t1.start();
		t2.start();
		t3.start();
		
	}

}
