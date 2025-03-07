package pack3;

public class Bank {
	String Holder_name;
	long Acc_num;
	double balance;
	
	public Bank(String Holder_name,long Acc_num,double balance)
	{
		this.Holder_name=Holder_name;
		this.Acc_num=Acc_num;
		this.balance=0.0;
		
	}
	public void deposit(double balance)
	{
		System.out.println();
	}
	public void withdraw(double amount)
	{
		System.out.println();
	}

	
	public double getBalance() {
		return balance;
	
	}
	

	}


