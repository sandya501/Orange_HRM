package FAQS;

import java.io.File;


import org.apache.commons.io.FileUtils;
import org.testng.annotations.Test;

public class HTML_REPORTING {
	

	
    @Test
    public void setBaseURL() throws Exception
  	{
    	
    	File f1= new File("C://Users//sudhakar//Desktop//w3 css table//HtmlReport1.txt");
    	File f4= new File("C://Users//sudhakar//Desktop//w3 css table//HtmlReport4.txt");

    	
        FileUtils.copyFile(f1, f4);
        
   	 
	}                                   
}