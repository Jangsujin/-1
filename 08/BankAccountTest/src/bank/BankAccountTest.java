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
		withdraw(amount); // �Լ� ����ؼ� ����� �� �ִ�!
		otherAccount.deposit(amount);
	}
	public String toString() {
		return "���� �ܾ��� " + balance + "�Դϴ�.";
	}
}

public class BankAccountTest {
	public static void main(String args[]) {
		BankAccount myAccount = new BankAccount();
		BankAccount yourAccount = new BankAccount();
		myAccount.deposit(12000);
		System.out.println("myAccount�� "+ myAccount);
		myAccount.withdraw(8000);
		System.out.println("myAccount�� "+myAccount);
		myAccount.transfer(1000, yourAccount);
		System.out.println("myAccount�� "+myAccount);
		System.out.println("yourAccount�� "+yourAccount);
	}

}
