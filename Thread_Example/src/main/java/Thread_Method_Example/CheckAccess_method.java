package Thread_Method_Example;

	public class CheckAccess_method extends Thread {
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
			CheckAccess_method e1=new CheckAccess_method();
			
			CheckAccess_method e2=new CheckAccess_method();
			e1.start();
			e2.start();
			//if e1 thread dont have access to modify --then it will through Security Exception
			//if its has acccess to modify --then it will excute the next codess.....
			e1.checkAccess();
			System.out.println(e1.getName()+" has access");
			e2.checkAccess();
			System.out.println(e2.getName()+" has access");
			
		}
	}

