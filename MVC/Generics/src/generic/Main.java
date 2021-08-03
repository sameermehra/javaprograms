package generic;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		int a;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Integer Value");
		a=s.nextInt();
		A<Integer> obj=new A<Integer>(a);
		System.out.println(obj.show());
		A<String> obj1=new A<String>("Welcome to Generics");
		System.out.println(obj1.show());
		
		
		System.out.println("********************");
		System.out.println("Class B Started");
		B <Integer,String> b=new B<Integer,String>(1,"sameer mehra");
		b.show();
		
		System.out.println("************************");
		System.out.println("Started C Class");
		C c=new C();
		Integer i[]= {1,2,3,4,5,6,7,8,9};
		System.out.println("Printing array objects");
		c.getData(i);
		String str[]= {"Hey","How","are","You"};
		System.out.println("Printing String objects");
		c.getData(str);
	}

}
