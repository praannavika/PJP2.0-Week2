import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Dev {
	
	private String path1,absolutePath;
	private BufferedReader br = null;
	
	private ArrayList<GetSet> getset=new ArrayList<GetSet>();
	
	
	public Dev(String s) throws IOException {
		
		path1 = s;
		read();
		}

	
	private void read() throws IOException {
		
		
		int iterator=0;
		
		ClassLoader classLoader = getClass().getClassLoader();
		File file = new File(classLoader.getResource(path1).getFile());
		absolutePath=file.getAbsolutePath();
		System.out.println("Tha path is "+file.getAbsolutePath());
		
		
		br = new BufferedReader(new FileReader(absPath));
		
		 String line="";
		 String splitBy = ",";
		
		while ((line = br.readLine()) != null)    
		{  
			if(iterator!=0) {
			GetSet getSet=new GetSet();
		
			String[] data = line.split(splitBy);    
			
			getSet.setClientId(data[2]);
			getSet.setSecurityId(data[3]);
			getSet.setTransactionDate(data[5]);
			getSet.setTransactionType(data[4]);
			getSet.setPriorityFlag(data[7]);
			
			
			
			getset.add(ob1);
			}
			itr++;
		}  
		
		
	}
	
	
	public ArrayList<GetSet> getList(){
		return getset;
	}
	
}