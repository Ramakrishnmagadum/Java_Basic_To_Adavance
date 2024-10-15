package Thread_Method_Example;

public class Implementing_Runnable implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 4; i++) {
			System.out.println("index -> "+ i);
			try {
				System.out.println(Thread.currentThread());
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
	
	
	public static void main(String[] args) {
		Implementing_Runnable i1=new Implementing_Runnable();
		Thread t1=new Thread(i1);
		//after excuting the start method it calls internally run method -- so this is one thread 1
		t1.start();
		//it will call one more time --so this is thread 2
		//thread1 and thread2 excute at same time...........
		t1.run();
		
		//it is thread 3 -- it will excute after completing the two threadsss...
		t1.run();
		
		//it is thread 4 -- it will excute after completing the three threadsss...
		t1.run();
	}

}
