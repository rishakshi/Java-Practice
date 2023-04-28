package JavaThreads;

import java.util.concurrent.*;

class WeddingCardWrap extends Thread{

	@Override
	public void run() {
		System.out.println("Thread Name: " + Thread.currentThread().getName());
	}
	
}

public class RishavWeddingCard {
	public static void main(String[] args) {
//		ExecutorService exe = Executors.newFixedThreadPool(4);
//		ExecutorService exe = Executors.newCachedThreadPool();
		
//		for(int i=1; i<=100; i++) {
//			exe.execute(new WeddingCardWrap());
//		}
		
//		--> Taking 3 seconds to execute, executing only once
		ScheduledExecutorService exe1 = Executors.newScheduledThreadPool(3);
//		exe1.schedule(new WeddingCardWrap(), 3, TimeUnit.SECONDS);
		
//		--> Starts with 3 second delay and delay 1 second between every thread
		exe1.scheduleAtFixedRate(new WeddingCardWrap(), 3, 1, TimeUnit.SECONDS);
		
		exe1.scheduleWithFixedDelay(new WeddingCardWrap(), 3, 2, TimeUnit.SECONDS);
		
	}
}
