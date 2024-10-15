package ATM_Joint_Account;

public class Account_Holder implements Runnable{
private Account account;
	Account_Holder(Account account)
	{
		this.account=account;
	}
	@Override
	public void run() {
		for (int i = 1; i < 5; i++) {
			withdrawing(1000);
		}
		
	}
	private synchronized void withdrawing(int amount) {
		if(account.getBalance()>=amount)
		{
			System.out.println(Thread.currentThread().getName()+" started withdrawing the money ");
			account.amountWithdrawn(amount);
			
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					
				}
				System.out.println("amount succesfully withdrawn "+ Thread.currentThread().getName()+" current balance "+account.getBalance() );
			
			
		}else {
			System.out.println(Thread.currentThread().getName()+" not having enough money "+" balance is "+account.getBalance());
		}
		
	}

}
