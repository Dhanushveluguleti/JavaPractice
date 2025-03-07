package Encapsulation;

public class Banking {
	 private String Bank_name;
	 private String Acc_holder;
	 private long Acc_num;
	 private double balance;
	public String getBank_name() {
		return Bank_name;
	}
	public void setBank_name(String bank_name) {
		Bank_name = bank_name;
	}
	public String getAcc_holder() {
		return Acc_holder;
	}
	public void setAcc_holder(String acc_holder) {
		Acc_holder = acc_holder;
	}
	public long getAcc_num() {
		return Acc_num;
	}
	public void setAcc_num(long acc_num) {
		Acc_num = acc_num;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	 
	
	
	

}
