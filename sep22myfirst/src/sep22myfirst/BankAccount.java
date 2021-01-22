package sep22myfirst;

public class BankAccount {
	public Long accountnumber=1234567890l;
	public String name="Eshienan";
	public int accountBalance=1000;
	public void GetBalance() {
		System.out.println("Balance is"+ accountBalance);
	}
	public void getAccountNumber() {
		System.out.println("Accont number is"  + accountnumber);
	}
	public void GetAccountName() {
		System.out.println("Account name is" + name);
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//ClassName ObjName=new ClassName();
		BankAccount Account=new BankAccount();
		Account.GetBalance();
		Account.getAccountNumber();
		Account.GetAccountName();

	}

}
