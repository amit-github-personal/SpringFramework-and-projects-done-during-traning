package SpringAggreation.com.springagreegation;

public class Address {
	
	private int house_no;
	private String Colony;
	private String City;
	private String State;
	
	public Address(int house_no, String colony, String city, String state) {
		super();
		this.house_no = house_no;
		Colony = colony;
		City = city;
		State = state;
	}

	@Override
	public String toString() {
		return "Address [house_no=" + house_no + ", Colony=" + Colony + ", City=" + City + ", State=" + State + "]";
	}
	
	
	
	

}
