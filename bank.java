public class bank {
	private String accountHolder;
	private double balance;

	public bank(String accountHolder, double openingBalance) {
		setAccountHolder(accountHolder);
		setBalance(openingBalance);
	}

	public void deposit(double amount) {
		if (amount > 0) {
			setBalance(getBalance() + amount);
			System.out.println("Deposited: " + amount);
		} else {
			System.out.println("Deposit amount must be greater than zero.");
		}
	}

	public void withdraw(double amount) {
		if (amount <= 0) {
			System.out.println("Withdrawal amount must be greater than zero.");
		} else if (amount > balance) {
			System.out.println("Insufficient balance."); 
		} else {
			setBalance(getBalance() - amount);
			System.out.println("Withdrawn: " + amount);
		}
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		if (balance >= 0) {
			this.balance = balance;
		}
	}

	public static void main(String[] args) {
		bank account = new bank("Dayashankar", 10000);

		System.out.println("Account holder: " + account.getAccountHolder());
		System.out.println("Opening balance: " + account.getBalance());
		account.deposit(2500);
		account.withdraw(3000);
		account.withdraw(15000);
		System.out.println("Final balance: " + account.getBalance());
	}
}
