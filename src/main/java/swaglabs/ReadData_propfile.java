package swaglabs;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadData_propfile {

	
	
	public String readdatafrompropfile(String key) throws IOException {
		FileInputStream fileInputStream = new FileInputStream(IAutoConstants.PROPFILEPATH);
		Properties properties = new Properties();
		properties.load(fileInputStream);
		String value=properties.getProperty(key);
		return value;

	}
	
}
