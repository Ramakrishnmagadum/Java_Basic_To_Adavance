package Thread_Method_Example;

public class join_method extends Thread {

	public static void main(String[] args) {
		first f1=new first();
		
		//after starting the method , once we call join method for this thread ....
		//all other threads will waits for completion of the thread excution............
		f1.start();
		try {
			f1.join();
		} catch (InterruptedException e) {}
		
		
		second f2=new second();
		f2.start();
		third f3=new third();
		f3.start();
	}
}

class first extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("index -> "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class second extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("index -> "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}	
}

class third extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("index -> "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}	
}