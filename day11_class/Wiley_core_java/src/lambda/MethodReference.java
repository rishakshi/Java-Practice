package lambda;

interface GetInfo {
	Info getMsg(String str)
;}

class Info {
	Info(String msg){
		System.out.println(msg);
	}
}

interface Sayable{
	void say();
}

public class MethodReference {
	
	public void hello() {
		System.out.println("hello");
	}
	
	public static void processSomething() {
		System.out.println("processing");
	}
	
	public static void saySomething() {
		System.out.println("Hello, This is static");
	}
	
	public static void main(String[] args) {
		
		GetInfo info = Info::new;
		info.getMsg("My msg");
		
		MethodReference mt = new MethodReference();
		Sayable isv = mt::hello;
		isv.say();
		
		Sayable s = MethodReference::saySomething;
		s.say();
		
		Thread t1 = new Thread(MethodReference::processSomething);
		t1.start();
		
	}

}
