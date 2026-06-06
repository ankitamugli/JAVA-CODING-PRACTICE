package constructoroverloading;

public class BankAccount {
	static String backName="dore";
	static double minimumBalance=1000;
	String accountHolderName;
	double amount;
	String accounttype;
	BankAccount(){
		accountHolderName="unknown";
		amount=minimumBalance;
		accounttype="savings";
	}
		BankAccount(String accountHolderName){
			this.accountHolderName=accountHolderName;
			this.amount=minimumBalance;
			this.accounttype="savings";			
		}
		BankAccount(String accountHolderName,double amount){
			this.accountHolderName=accountHolderName;
			this.amount=amount;
			this.accounttype="savings";	
		}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount b1 = new BankAccount();
        BankAccount b2 = new BankAccount("Ankita");
        BankAccount b3 = new BankAccount("Abhishek", 5000);

        System.out.println("Bank Name : " + backName);
        System.out.println("Account Holder : " + b1.accountHolderName);
        System.out.println("Balance : " + b1.amount);
        System.out.println("Account Type : " + b1.accounttype);
        


	}

}
