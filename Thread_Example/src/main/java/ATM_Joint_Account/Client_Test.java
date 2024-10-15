package ATM_Joint_Account;

public class Client_Test {
public static void main(String[] args) {
	Account account=new Account();
	Account_Holder holder=new Account_Holder(account);
	Thread t1=new Thread(holder);
	Thread t2=new Thread(holder);
	
	t1.setName("Ram");
	t2.setName("Krishna");

	t1.start();
	t2.start();
	
}
}
