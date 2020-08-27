import java.util.*;
public class InputFromUser {
	
    public ArrayList<String[]> readCSV(String filePath)  {
    
    	ArrayList<String[]> arrayList = new ArrayList<String[]>();
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        String line = br.readLine();
        while (line != null) {
            arrayList.add(line.split(","));
            line = br.readLine();
        }
        br.close();
        return arrayList;
        
    }
}