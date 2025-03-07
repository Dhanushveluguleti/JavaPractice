package logical;

public class PA4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//common elements
		int a[]= {20,10,30,50,100};
		int b[]= {60,70,90,45,100};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					System.out.println(a[i]);
				}
			}
		}

	}

}
