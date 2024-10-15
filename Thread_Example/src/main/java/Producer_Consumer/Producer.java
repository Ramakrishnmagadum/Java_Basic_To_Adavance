package Producer_Consumer;

public class Producer extends Thread{
    company c;
    Producer(company c)
    {
    	this.c=c;
    }
    
	@Override
	public void run() {
		int i=1;
		while(true)
		{
		try {
			this.c.Produced_item(i);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				
			}
			i++;
		}
	}
}
