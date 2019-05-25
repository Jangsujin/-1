package bank;

class BankAccount {
	int accountNumber;
	String owner;
	int balance;
	void deposit(int amount) {
		balance += amount;
	}
	void withdraw(int amount) {
		balance -= amount;
	}
	public void transfer(int amount , BankAccount otherAccount) {
		withdraw(amount); // 함수 사용해서 사용할 수 있다!
		otherAccount.deposit(amount);
	}
	public String toString() {
		return "현재 잔액은 " + balance + "입니다.";
	}
}

public class BankAccountTest {
	public static void main(String args[]) {
		BankAccount myAccount = new BankAccount();
		BankAccount yourAccount = new BankAccount();
		myAccount.deposit(12000);
		System.out.println("myAccount의 "+ myAccount);
		myAccount.withdraw(8000);
		System.out.println("myAccount의 "+myAccount);
		myAccount.transfer(1000, yourAccount);
		System.out.println("myAccount의 "+myAccount);
		System.out.println("yourAccount의 "+yourAccount);
	}

}
