package logical;

public class PA2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//duplicate number
		int a[]= {10,20,25,30,45,10};
		for (int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println("Found the duplicate :" +a[i]);
				
			}
			
				
			}
		}
	}
}


	


