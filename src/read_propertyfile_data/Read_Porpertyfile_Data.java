package read_propertyfile_data;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Read_Porpertyfile_Data {

	public static void main(String[] args) throws IOException
	{
                   FileInputStream fis = new FileInputStream("./data/config.properties");
                   
                   
                 Properties prop = new Properties();
                 prop.load(fis);
                String data = prop.getProperty("username");
                System.out.println(data); 
                 
                 
	}

}
