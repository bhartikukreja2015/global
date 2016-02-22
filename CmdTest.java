
import java.io.*;

public class CmdTest {
    public static void main(String[] args) throws Exception {
    	String line=null;
    	String source="C:\\Users\\Administrator\\Desktop\\mix-text.jpg";
    	try
    	{
        ProcessBuilder builder = new ProcessBuilder(
        		     "cmd.exe", "/c", "cd \"C:\\Users\\Administrator\\Downloads\\tesseract-sw\" && tesseract "+source+"  C:\\Users\\Administrator\\Desktop\\bharti6Out -l eng");
        builder.redirectErrorStream(true);
        Process p = builder.start();
        BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
        
        while (true) 
        {
            line = r.readLine();
            if (line == null) { break; }
            System.out.println(line);
            Exception exception =new Exception("file path not correct or processing error");
        	if(line.contentEquals("Tesseract Open Source OCR Engine v3.05.00dev with Leptonica"))
        	{
        		System.out.println("ok");
        	}
        	else
        		throw exception;
        	}
        }
    	
        catch(Exception e)
        {
        	System.out.println("exception occured while converting image"+ e);
        	System.out.println("exception on command prompt"+line);
        }
    	finally
    	{
    		System.out.println("action completed");
    	}
    }
}
