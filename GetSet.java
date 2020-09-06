import java.util.*;
public class GetSet {
	
	private String clientId;
	private String securityId;
	private String transactionDate;
	private String transactionType;
	private String priorityFlag;
	
	public String getPriorityFlag() {
		return priorityFlag;
	}

	public void setPriorityFlag(String priorityFlag) {
		this.priorityFlag = priorityFlag;
	}



	private int processingFee=-1;
	
	public res() {
		
	}

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public String getSecurityId() {
		return securityId;
	}

	public void setSecurityId(String securityId) {
		this.securityId = securityId;
	}

	public String getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	
	
	
	public int calc_fee() {
		System.out.println(priorityFlag.trim());
		System.out.println(transactionType.trim());
		if(priorityFlag.toString().contains("Y")) {
			
			return 500;
			
		}else if(priorityFlag.toString().contains("N")) {
			
			if(transactionType.toString().contains("Sell and Withdraw")) {
				return 100;
			}else if(transactionType.toString().contains("Buy and Deposit")) {
				 return 50;
			}
			
			
		}
		return 0;
	}
	
	public int getFee() {
		return processingFee;
	}

}