package Bus_Reservation;

public class Ticekt_Handler implements Runnable {

	private Ticket_Counter counter;
	private String passangerName;
	private int noOfSeats;
	
	Ticekt_Handler(Ticket_Counter counter ,String passangerName,int noOfSeats)
	{
		this.counter=counter;
		this.passangerName=passangerName;
		this.noOfSeats=noOfSeats;
	}
	@Override
	public void run() {
		bookticket();
	}
	private  void bookticket() {
		
			counter.bookticket(passangerName ,noOfSeats);
	}
	
	
}
