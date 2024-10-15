package Thread_Method_Example;

public class holdlock_method extends Thread {
	@Override
	public void run() {
		System.out.println("currently excuting thread ? " + Thread.currentThread().getName());
		System.out.println("Does the current thread holds the lock ? " + Thread.holdsLock(this));
		//synchonized key will lock the moniter and i wont allow to other threads to excute.....
		synchronized (this) {
			System.out.println("does the current thread holds the lock ? "+ Thread.holdsLock(this));
		}
	}

	public static void main(String[] args) {
		holdlock_method e1 = new holdlock_method();

		holdlock_method e2 = new holdlock_method();
		e1.start();
		e2.start();
	}
}
