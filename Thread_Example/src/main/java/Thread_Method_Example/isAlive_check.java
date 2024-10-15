package Thread_Method_Example;

public class isAlive_check extends Thread {
	@Override
	public void run() {
	for (int i = 0; i < 6; i++) {
		System.out.println("index -> "+ i);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	}
	
	public static void main(String[] args) {
		isAlive_check e1=new isAlive_check();
		System.out.println("before starting the thread - > "+ e1.isAlive());
		e1.start();
		System.out.println("after starting the thread - > "+ e1.isAlive());
		
		
	}
}
