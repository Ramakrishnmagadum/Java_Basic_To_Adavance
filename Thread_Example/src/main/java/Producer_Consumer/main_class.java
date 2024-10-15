package Producer_Consumer;

public class main_class {

	public static void main(String[] args) {
		company c=new company();
		Producer p=new Producer(c);
		consumer comp=new consumer(c);
		p.start();
		comp.start();
		
	}
}
