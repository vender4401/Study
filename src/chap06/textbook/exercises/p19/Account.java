package chap06.textbook.exercises.p19;

public class Account {
	static final int MIN_BALANCE = 0;
	static final int MAX_BALANCE = 1000000;
	
	private int balance;
	
	
	public int getBalance() {
		return this.balance;
	}
	
	
	public void setBalance(int balance) {
		if(balance <= 0) { 
			this.balance = MIN_BALANCE;
			return;
		} else {
			this.balance = balance;
		}
		if(balance >= 1000000) {
			this.balance = MAX_BALANCE;
			return;
		}
		
	}
}
	


