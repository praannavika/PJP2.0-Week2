public class Output {
	public void getFinalReport(String fileName, ArrayList<Income> result) throws Exception {
        BufferedWriter br = new BufferedWriter(new FileWriter(fileName));
        for (Income i : result) {
            String arraylist = "";
            if (!i.getCountry().equals("")) record += i.getCountry();
            else arraylist += i.getCity();
            record += "," + i.getGender() + "," + i.getAmountInDollars() + "\n";
            writer.write(arraylist);
        }
        writer.close();
    }
}