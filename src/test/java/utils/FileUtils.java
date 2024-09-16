package utils;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import constants.FileConstants;

public class FileUtils {
	
	public static String readLoginPageCFTestData(String testdata) throws IOException {
		
		FileInputStream f=new FileInputStream(FileConstants.LOGINTEST_DATA_FILE_PATH);
		Properties p=new Properties();
		p.load(f);
		return p.getProperty(testdata);
		
	}

}
