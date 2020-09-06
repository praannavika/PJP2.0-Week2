import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Application {
	
	private static ArrayList<GetSet> Object;
	
   public static void main(String[] args) throws IOException {
	
	   	
	   	
	   	Dev dev=new Dev("cs2.csv");
	   	
	   	Object=dev.getList();
	   	
	   	System.out.println(Object.get(0).calc_fee());
	   	
	   	writeRes();
	   	
   }
   
   
   public static void writeRes() {
	   PrintWriter printWriter = null;
       try {
           printWriter = new PrintWriter(new File("C:\\Users\\classes\\res.csv"));
       } catch (FileNotFoundException e) {
           e.printStackTrace();
       }
       StringBuilder builder = new StringBuilder();
       String columnNamesList = "Client Id,Transaction Type,"
       		+ "Transaction Date,Priority,Processing Fee";
      
       builder.append(columnNamesList +"\n");
       
       for(GetSet x : Object) {
    	   builder.append(x.getClientId()+",");
    	   builder.append(x.getTransactionType()+",");
    	   builder.append(x.getTransactionDate()+",");
    	   builder.append(x.getPriorityFlag()+",");
    	   builder.append(x.calc_fee()+",");
    	   
    	   builder.append('\n');
    	   
       }
       
       
       
       printWriter.write(builder.toString());
       printWriter.close();
       System.out.println("done!");
   }

}