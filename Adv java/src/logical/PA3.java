package logical;

public class PA3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {50,70,25,43,100};
		int max=a[0];
		int min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(max<a[i])
			{
				max=a[i];
				
			}
			else if(min>a[i])
			{
				min=a[i];
			}
		}
		System.out.println("Largest number is "+max);
		System.out.println("Smallest number is "+min);

			

	}

}
