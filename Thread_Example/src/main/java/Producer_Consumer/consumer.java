package Producer_Consumer;

public class consumer extends Thread {
	
	company c;
	
	consumer(company c)
	{
		this.c=c;
	}
	
	@Override
	public void run() {
		while(true)
		{
			try {
				this.c.consumed_item();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				Thread.sleep(200);
			}catch(Exception e) {
				
			}
		}
	}
}
