package genericwildcard;
import java.util.*;
public class B {
	
	
	public void adddata(List<?> list)
	{
		
		//now we will retrieve the data
		for(Object s:list)
		{
			System.out.println(s);
		}
		
	}

}
