package contact.contactService;

//created public class to hold contact details
public class Contact {
	private String contactID;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String homeAddress;
	
	//created arguments for contact parameters
	public Contact(String contactID, String firstName, String lastName, String phoneNumber, String homeAddress) {
		
		//error message will populate if contact ID is null or longer than 10 characters
		if(contactID == null || contactID.length() > 10) {
			throw new IllegalArgumentException("Invalid contact ID - please try again");
		}
		
		//error message will populate if contact first name is null or longer than 10 characters
		if(firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("Invalid first name - please try again");
		}
		
		//error message will populate if contact last name is null or longer than 10 characters
		if(lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Invalid last name - please try again");
		}
		
		//error message will populate if contact phone number is null or not equal to 10 characters
		if(phoneNumber == null || phoneNumber.length()!= 10) {
			throw new IllegalArgumentException("Invalid phone number - please try again");
		}
		
		//error message will populate if contact home address is null or longer than 30 characters
		if(homeAddress == null || homeAddress.length() > 30) {
			throw new IllegalArgumentException("Invalid home address - please try again");
		}
		
		//created local variables
		this.contactID = contactID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.homeAddress = homeAddress;
	}
	
	//created setters and getters for all contact details
	//only included a getter for the contact ID as it cannot be changed
	public String getContactID() {
		return contactID;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String newFirstName) {
		if(firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("Invalid first name - please try again");
		}
		else {
			this.firstName = newFirstName;
		}
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String newLastName) {
		if(lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Invalid last name - please try again");
		}
		else {
			this.lastName = newLastName;
		}
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(String newPhoneNumber) {
		if(phoneNumber == null || phoneNumber.length() != 10) {
			throw new IllegalArgumentException("Invalid phone number - please try again");
		}
		else {
			this.phoneNumber = newPhoneNumber;
		}
	}
	
	public String getHomeAddress() {
		return homeAddress;
	}
	
	public void setHomeAddress(String newHomeAddress) {
		if(homeAddress == null || homeAddress.length() > 30) {
			throw new IllegalArgumentException("Invalid home address - please try again");
		}
		else {
			this.homeAddress = newHomeAddress;
		}
	}
}
