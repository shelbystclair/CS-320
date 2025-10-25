package contact.contactService;

import java.util.HashMap;
import java.util.Map;

public class ContactService {
	
	//created a hash map to hold contact details
	private Map<String, Contact> contacts = new HashMap<>();
	
	//getter to pull contact by contact ID
	public Contact getContact(String contactID) {
		return contacts.get(contactID);
	}
	
	/* public boolean to add a new contact
	 * error message will print if contact ID already exists
	 * otherwise a new contact will be created
	 * confirmation message will print upon successful contact creation
	 */
	public boolean addContact(Contact contact) {
		if(contacts.containsKey(contact.getContactID())) {
			System.out.println("Contact ID already exists - cannot add new contact");
		}
		if(!contacts.containsKey(contact.getContactID())) {
			contacts.put(contact.getContactID(), contact);
			System.out.println("Contact successfully added");
			return true;
		}
		else {
			return false;
		}
	}
	
	/* public boolean to delete an existing contact
	 * if the contact ID is found, the contact will be deleted
	 * confirmation message will print upon successful contact deletion
	 * otherwise an error message will print if the ID is not found
	 */
	public boolean deleteContact(String contactID) {
		if(contacts.containsKey(contactID)) {
			contacts.remove(contactID);
			System.out.println("Contact successfully deleted");
			return true;
		}
		else {
			System.out.println("Contact not found, cannot be deleted. Please try again");
		}
		return false;
	}
	
	/*public boolean to update contact first name
	 * if the contact ID is not found, an error message will print
	 * otherwise, the new first name will be set and the contact will be updated
	 * confirmation message will print upon successful update
	 */
	public boolean updateContactFirstName(String contactID, String firstName) {
		Contact contact = contacts.get(contactID);
		if(!contacts.containsKey(contactID)) {
			System.out.println("Contact not found, cannot update first name. Please enter a different ID");
		}
		else {
			contact.setFirstName(firstName);
			System.out.println("Contact first name updated successfully");
			return true;
		}
		return false;
	}
	
	/*public boolean to update contact last name
	 * if the contact ID is not found, an error message will print
	 * otherwise, the new last name will be set and the contact will be updated
	 * confirmation message will print upon successful update
	 */
	public boolean updateContactLastName(String contactID, String lastName) {
		Contact contact = contacts.get(contactID);
		if(!contacts.containsKey(contactID)) {
			System.out.println("Contact not found, cannot update last name. Please enter a different ID");
		}
		else {
			contact.setLastName(lastName);
			System.out.println("Contact last name updated successfully");
			return true;
		}
		return false;
	}
	
	/*public boolean to update contact phone number
	 * if the contact ID is not found, an error message will print
	 * otherwise, the new phone number will be set and the contact will be updated
	 * confirmation message will print upon successful update
	 */
	public boolean updateContactPhoneNumber(String contactID, String phoneNumber) {
		Contact contact = contacts.get(contactID);
		if(!contacts.containsKey(contactID)) {
			System.out.println("Contact not found, cannot update phone number. Please enter a different ID");
		}
		else {
			contact.setPhoneNumber(phoneNumber);
			System.out.println("Contact phone number updated successfully");
			return true;
		}
		return false;
	}
	
	/*public boolean to update contact home address
	 * if the contact ID is not found, an error message will print
	 * otherwise, the new home address will be set and the contact will be updated
	 * confirmation message will print upon successful update
	 */
	public boolean updateContactHomeAddress(String contactID, String homeAddress) {
		Contact contact = contacts.get(contactID);
		if(!contacts.containsKey(contactID)) {
			System.out.println("Contact not found, cannot update home address. Please enter a different ID");
		}
		else {
			contact.setHomeAddress(homeAddress);
			System.out.println("Contact home address updated successfully");
			return true;
		}
		return false;
	}
}
