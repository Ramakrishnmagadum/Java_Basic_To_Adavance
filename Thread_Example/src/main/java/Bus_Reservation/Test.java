package Bus_Reservation;

public class Test {
public static void main(String[] args) {
	Ticket_Counter counter=new Ticket_Counter();
	Ticekt_Handler handler=new Ticekt_Handler(counter,"Ram",2);
	Ticekt_Handler handler2=new Ticekt_Handler(counter,"Krishna",2);
	Thread t1=new Thread(handler);
	Thread t2=new Thread(handler2);
	
	t1.start();
	t2.start();
}
}
