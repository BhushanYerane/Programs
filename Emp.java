package newbasicjava;

public class Emp {  
	int id;  
	String name;  
	Address address;  
	  
	public Emp(int id, String name,Address address) {  
	    this.id = id;  
	    this.name = name;  
	    this.address=address;  
	}  
	  
	  public String toString()
	  {
		  return id+" "+name+" "+address;
	  }
	  
	public static void main(String[] args) {  
	Address address1=new Address("qaz","gzb","UP","india");  
	Address address2=new Address("wsc","gno","UP","india");  
	  
	Emp e=new Emp(111,"varun",address1);  
	Emp e2=new Emp(112,"arun",address2);  
	      
	System.out.println(e);
	System.out.println(e2);
	      
	}  
	}  