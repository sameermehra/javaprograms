package genericwildcard;
import java.util.*;
public class A {
	
	
	public void adddata(List<? extends Number> list)
	{
		
		//now we will retrieve the data
		for(Number s:list)
		{
			System.out.println(s);
		}
		
	}

}
