package Encapsulation;

public class AtmDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Atms a=new Atms();
		a.setLoc("Srikalahasti");
		a.setAmount_withdraw(4000);
		a.setAtm_name("SBI");
		System.out.println(a.getLoc());
		System.out.println(a.getAmount_withdraw());
		System.out.println(a.getAtm_name());
	

	}

}
