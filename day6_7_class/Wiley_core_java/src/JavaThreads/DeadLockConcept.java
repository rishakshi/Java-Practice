package JavaThreads;

public class DeadLockConcept {
	
	public static Object Lock1 = new Object();
	public static Object Lock2 = new Object();
	
	private static class LockThread extends Thread{
		@Override
		public void run() {
			synchronized (Lock1) {
				System.out.println("Thread one hold : lock 1");
				try {
					Thread.sleep(5000);
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				
			}
			
			System.out.println("Thread 1 is waiting for lock 2");
			
			synchronized (Lock2) {
				System.out.println("Thread one hold : lock 2");
			}
		}
	}
	
	public static void main(String[] args) {
		
		LockThread lt1 = new LockThread();
		lt1.start();
		
	}

}
