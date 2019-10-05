import com.cg.bank.*;


public class TestBank {
	public static void main(String[] args) {
		//Person p1 = new Person("Isha", 22);
		//Person p2 = new Person("Rachel", 25);
		
		//Account a1 = new Account();
		/*a1.deposit(2000);
		a1.setHolder("Yadav");
		a1.setPerson(p1);
		a1.summary();*/
		
		//s1 here is the reference to bank 
		Bank s1 = AccountFactory.OpenAccount("Monica", "saving");
		s1.summary();

		//SavingAccount s1 = new SavingAccount("Isha");
		s1.deposit(10000);
		s1.withdraw(2000);
		s1.deposit(3000);
		s1.deposit(5000);
		s1.withdraw(102);
		s1.deposit(10000);
		s1.withdraw(2000);
		s1.deposit(3000);
		s1.withdraw(1000);

		s1.summary();
		s1.statement();
		
		CurrentAccount c1 = new CurrentAccount("Rachel");
		c1.withdraw(3000);
		c1.withdraw(7000);
		c1.deposit(4000);
		c1.deposit(5000);
		c1.summary();
		c1.statement();
		
		Bank sb = AccountFactory.OpenAccount("savings", "Polo");
		//sb.deposit(120000);
		try{
			sb.deposit(120);
		} finally{
			System.out.println("Deposit done");
		}
		try {
			System.out.println("Before exception");
			sb.withdraw(2000);
			System.exit(0);
			System.out.println("After exception");
		} catch (BankException e) {
			//e.printStackTrace();//Developers - trouble shoot
			//System.out.println(e); // Logging - audit behaviour
			System.out.println(e.getMessage()); // End users
		} finally{
			System.out.println("Finally block");
		}
		
	}
}
