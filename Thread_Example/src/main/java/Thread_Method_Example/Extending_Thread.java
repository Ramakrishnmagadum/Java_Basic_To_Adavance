package Thread_Method_Example;

import java.util.Iterator;

public class Extending_Thread extends Thread{

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
		Extending_Thread e1=new Extending_Thread();
		e1.start();
		//if we call the start method more than one times
		//it thorws the IllegalThreadstateException and it wont stop the excution......
//		e1.start();
	}
}
