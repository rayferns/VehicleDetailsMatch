package test.java;

import java.net.FileNameMap;
import java.net.URLConnection;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.Writer;
import java.util.concurrent.*;


import org.apache.tika.Tika;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.digest.InputStreamDigester;

public class FileUtils {
	
	
//
//	public static String getMimeType(String fileUrl)
//		      throws java.io.IOException
//		    {
//		      FileNameMap fileNameMap = URLConnection.getFileNameMap();
//		      String type = fileNameMap.getContentTypeFor(fileUrl);
//
//		      return type;
//		    }
//
//		    public static void main(String args[]) throws Exception {
//		      System.out.println(FileUtils.getMimeType("file://c:/temp/test.TXT"));
//		      // output :  text/plain
//	   }

//	 static String inpath = "C:\\Container\\Automation\\Udemy_Training\\Selenium_with_Java\\Samples\\VehicleDetailsMatch\\TestProject\\src\\test\\resources";
//	 static String outpath = "C:\\Container\\Automation\\Udemy_Training\\Selenium_with_Java\\Samples\\VehicleDetailsMatch\\TestProject\\src\\test\\resources\\output.txt";
	static String inpath = "src\\test\\resources";
	//static String outpath = "src\\test\\resources\\output.txt";
	//static final Pattern PATTERN = Pattern.compile("(.*)\\.(.*)");
		
	public static void main(String[]args) throws IOException{
	        File Folder = new File(inpath);
	        File files[];
	        files = Folder.listFiles();
	        if(files.length>1)
	        {
	            for(int i = 0;i<files.length; i++){
	                //System.out.println("reading...");
	                System.out.println(files[i]);
	                Reader in = new FileReader(files[i]);
	                
	                // Get File mime type
	                Tika tika = new Tika();
	                String mimeType = tika.detect(files[i]);
	                System.out.println("mimeType: "+ mimeType);
	                System.out.println("File path: "+ files[i].getAbsoluteFile());
	                System.out.println("File extension: "+ getFileExtension(files[i]));
	                System.out.println("File name: "+ files[i].getName() + '\n');
	                
	                
	                in.close();
	                //out.close(); 
	            }
	        }
	        else{
	            System.out.println("found only one file...");
	            System.out.println(files);
	        }

	 }
	private static String getFileExtension(File file) {
		String fileName = file.getName();
        if(fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0)
        return fileName.substring(fileName.lastIndexOf(".")+1);
        else return "";
	}
}
