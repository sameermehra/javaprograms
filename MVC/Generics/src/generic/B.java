package generic;

public class B <T,U>{
	
	T obj;
	U obj1;
	//Declaring the constructor B
	B(T obj,U obj1)
	{
		
		
		this.obj=obj;
		this.obj1=obj1;
	}
public void show()
	{
		
		System.out.print(obj+" "+obj1);
		//System.out.println(obj1);
	}

}
