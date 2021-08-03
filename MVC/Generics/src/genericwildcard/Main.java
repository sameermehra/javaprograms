package genericwildcard;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj=new A();
		B obj2=new B();
		ArrayList<Integer> integer=new ArrayList<Integer>();
		integer.add(12);
		integer.add(13);
		integer.add(14);
	
		ArrayList<Float> float1=new ArrayList<Float>();
		float1.add((float) 1.5);
		float1.add((float)133.45);
		float1.add((float)144.90);
		
		
		System.out.println("Showing INTEGER");
		obj.adddata(integer);
		System.out.println("Showing Float");
		obj.adddata(float1);
		
		System.out.println("CLASS B");
		obj2.adddata(integer);
		
		ArrayList<String> al1=new ArrayList<String>();
		al1.add("sameer");
		al1.add("prem mehra");
		al1.add("seema mehra");
		System.out.println("Showing the String from class B using Unbounded Wildcard");
		obj2.adddata(al1);
	}

}
