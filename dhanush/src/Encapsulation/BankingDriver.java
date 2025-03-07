package Encapsulation;

public class BankingDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Banking b=new Banking();
		b.setBank_name("HDFC");
		b.setAcc_num(202020992837838l);
		b.setAcc_holder("Dhanush");
		b.setBalance(2547.76);
		System.out.println("---WelCome To HDFC Bank---");
		System.out.println("Bank Name is :"+b.getBank_name());
		System.out.println("Account number is  : "+b.getAcc_num());
		System.out.println("Account holder name :"+b.getAcc_holder());
		System.out.println( "Bank Balance:"+b.getBalance());
		System.out.println("---Thanks Visit Again--");
		

	}

}
