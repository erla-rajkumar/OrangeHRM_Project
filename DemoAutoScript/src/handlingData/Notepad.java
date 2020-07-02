package handlingData;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Notepad {

	@Test
	public void readwriteProperty() throws IOException
	{
		FileInputStream fis=new FileInputStream("./data/notepad.properties");
		Properties pro=new Properties();
		pro.load(fis);
		System.out.println(pro.getProperty("username"));
		pro.setProperty("capgemini", "selenium");
		FileOutputStream fos=new FileOutputStream("./data/notepad.properties");
		pro.store(fos, "new update");
		fis.close();
		fos.close();
	}
	
	
}
	
	
	
	

