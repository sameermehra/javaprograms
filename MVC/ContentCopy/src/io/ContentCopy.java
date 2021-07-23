package io;
import java.io.*;
public class ContentCopy {

	public void readAndWrite()
	{
		//reading of File
		try
		{
	FileInputStream fileinput=new FileInputStream("k:\\mvc\\file1.txt");
	FileOutputStream fileoutput=new FileOutputStream("k:\\mvc\\file2.txt");
	int i=fileinput.read();
	System.out.println("Reading of File Begin");
	while((i=fileinput.read())!=-1)
	{
		
		System.out.print((char)i);
		//Now Writing the File
		fileoutput.write(i);
		
	}
		}catch(Exception e)
		{
			System.out.println(e);
		}

	}
}
