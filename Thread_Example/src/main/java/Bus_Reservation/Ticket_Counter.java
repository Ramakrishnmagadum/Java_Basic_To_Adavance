package Bus_Reservation;

public class Ticket_Counter {

	private int avilableSeats=3;

	synchronized  void bookticket(String passangerName, int noOfSeats) {
		  System.out.println(passangerName +" Please wait your ticket is fetching ");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
			}

		if(avilableSeats >=noOfSeats && noOfSeats >0)
		{
			avilableSeats=avilableSeats-noOfSeats;
			
			System.out.println(passangerName + " Congrs You got the tickets");
		}else {
			System.out.println("Hi "+passangerName +" Tickets are not avaliable " );
		}
	}
	
	
}
