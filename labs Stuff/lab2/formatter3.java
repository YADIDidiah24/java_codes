package lab2;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class formatter3 {
	private String str;
	
	public String getStr()
    {
        return str;
    }
    
    public void setStr(String str1)
    {
    	  SimpleDateFormat ft = new SimpleDateFormat(str1); //(*)
    	   str = ft.format(new Date());     // (*)
    }
	public static void main(String args[])
	        throws ParseException
	    {
			
	        // Formatting as per given pattern in the argument
	      
	        formatter3 fmtStr = new formatter3();
	        String str1 = "dd-MM-yyyy";
	        fmtStr.setStr(str1);
	        
	        System.out.println("Formatted Date : " + fmtStr.getStr());
	 
	        // parsing a given String
	        String str2 = "02/18/1995";
	        SimpleDateFormat ft = new SimpleDateFormat("dd/MM/yyyy");
	        
	        Date date = ft.parse(str2);
	 
	        // this will print the date as per parsed string
	        System.out.println("Parsed Date : " + date);
	    }
	

}
