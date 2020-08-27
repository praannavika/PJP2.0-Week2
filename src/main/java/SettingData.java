import java.util.*;
public class SettingData {
	private String city;
    private String country;
    private String gender;
    private String currency;
    private Double amount;
    private Double amountInDollars;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public Double getAmountInDollars() {
		return amountInDollars;
	}
	public void setAmountInDollars(Double amountInDollars) {
		this.amountInDollars = amountInDollars;
	}
}