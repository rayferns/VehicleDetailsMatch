package test.utility;

import java.net.FileNameMap;
import java.net.URLConnection;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.Writer;
import java.util.concurrent.*;
import java.util.stream.Stream;

import org.apache.tika.Tika;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.digest.InputStreamDigester;

/* Part 1 of the task
 * 
 * */
public class FileUtils {

	static String inpath = "src/test/resources";
		
	public static void main(String[]args) throws IOException{
	        File Folder = new File(inpath);
	        File files[];
	        files = Folder.listFiles();
	        if(files.length>1)
	        {
	            for(int i = 0;i<files.length; i++){
	                System.out.println(files[i]);
	                Reader in = new FileReader(files[i]);
	                long fileSizeInBytes = files[i].length();
	                // Get File mime type
	                Tika tika = new Tika();
	                String mimeType = tika.detect(files[i]);
	                System.out.println("mimeType: "+ mimeType);
	                System.out.println("File path: "+ files[i].getAbsoluteFile());
	                System.out.println("File extension: "+ getFileExtension(files[i]));
	                System.out.println("File name: "+ files[i].getName());
	                System.out.println("File Size: "+ fileSizeInBytes / 1024 + '\n');
               	    	                
	                in.close(); 
	            }
	        }
	        else{
	            System.out.println("found only one file...");
	            System.out.println(files);
	        }
	        
	    	final File folder = new File(inpath);
	    	listFilesForFolder(folder);

}
	private static String getFileExtension(File file) {
		String fileName = file.getName();
        if(fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0)
        return fileName.substring(fileName.lastIndexOf(".")+1);
        else return "";   
        
	}
	public static void listFilesForFolder(final File folder) {
	    for (final File fileEntry : folder.listFiles()) {
	        if (fileEntry.isDirectory()) {
	            listFilesForFolder(fileEntry);
	        } else {
	            System.out.println(fileEntry.getName());
	            
	        }
	    }
	}
}
