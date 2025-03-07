package multitheard;

public class MultitheardDemo extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		System.out.println(currentThread());
		System.out.println(getId());
		System.out.println(getName());
	}

} 
