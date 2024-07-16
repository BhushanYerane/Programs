package newbasicjava;

public class Address {
	
	String street,city,state,country; 
	
	public Address(String street, String city, String state, String country) 
	{  
	    this.street=street;
		this.city = city;  
	    this.state = state;  
	    this.country = country;  
	}  
	
	public String toString()
	{
		return street+" "+city+" "+state+" "+country;
	}
}
