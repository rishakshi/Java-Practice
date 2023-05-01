package JavaThreads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class RequestProcessor {
	private ExecutorService threadPool;
	private ThreadGroup databseThreadGroup;
	private ThreadGroup reportThreadGroup;

	public RequestProcessor() {
		threadPool = Executors.newFixedThreadPool(10, new ThreadFactory() {

			@Override
			public Thread newThread(Runnable r) {
				return new Thread(r);
			}
		});

		databseThreadGroup = new ThreadGroup("Database Threads");
		reportThreadGroup = new ThreadGroup("Report Threads");
	}

	public void processRequest(Request request) {
		Runnable Task = new Runnable() {

			@Override
			public void run() {
				if (request.getType() == RequestType.DATABASE_QUERY) {
					
					Thread.currentThread().setThreadGroup(databseThreadGroup);
					performDatabaseQuery(request);

				} else if (request.getType() == RequestType.REPORT_GENERATION) {
					Thread.currentThread().setThreadGroup(reportThreadGroup);
					generateReport(request);
				}

			}
		};
		threadPool.submit(request);
	}
	
	private void performDatabaseQuery(Request request) {
		System.out.println("Processing database query request");
	}
	private void generateReport(Request request) {
		System.out.println("Processing report generation query request");
	}
	
	public void shutdown() {
		threadPool.shutdown();
	}

}

enum RequestType {
	DATABASE_QUERY, REPORT_GENERATION
}

class Request {
	private RequestType type;
	private String data;

	public Request(RequestType type, String data) {
		super();
		this.type = type;
		this.data = data;
	}

	public RequestType getType() {
		return type;
	}

	public void setType(RequestType type) {
		this.type = type;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
}