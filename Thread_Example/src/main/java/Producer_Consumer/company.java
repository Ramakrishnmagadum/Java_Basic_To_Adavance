package Producer_Consumer;

public class company {
	int n;
	boolean flag=false;
synchronized void Produced_item(int n) throws Exception {
	if(flag) {
	wait();
	}
	
	this.n=n;
	System.out.println("Produced :- "+ this.n);
	flag=true;
	notify();
	
}

synchronized int consumed_item() throws Exception {
	if(!flag) {
	wait();
	}
	System.out.println("Consumed :- "+ this.n);
	flag=false;
	notify();
      return this.n;
       
}
}
