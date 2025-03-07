package inheritance;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;
import java.util.Vector;



public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String>l=new TreeSet<String>();
		l.add("Sanuju");
		l.add("Dhanush");
		l.add("Dhenush");
		l.add("Vinoth");
		l.add("Keerthi");
		System.out.println(l);
		Iterator<String>n=l.iterator();
		while(n.hasNext())
		{
			System.out.println(n.next());
		}


	}

}
