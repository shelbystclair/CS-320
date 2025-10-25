package contact.contactService;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ContactServiceTest {
	private ContactService contactService;
	
	//used the BeforeEach call to create a test contact for each case to reference
	@BeforeEach
	void contactServiceCreation() {
		contactService = new ContactService();
		contactService.addContact(new Contact("123456", "Clarice", "Starling", "7777777777", "123 Sesame Street"));
	}
	
	@Test
	/* test to add a new contact
	 * created a new contact and a duplicate contact
	 * test should pass for the new contact, fail for the duplicate contact
	 */
	void testAddContact() {
		Contact newContact1 = new Contact("12345678", "Sidney", "Prescott", "7775558888", "34 Apple St");
		Contact dupContact = new Contact("123456", "Clarice", "Starling", "7777777777", "123 Sesame Street");
		Assertions.assertTrue(contactService.addContact(newContact1));
		Assertions.assertFalse(contactService.addContact(dupContact));
	}
	
	/* test to delete an existing contact
	 * test should pass when deleting the existing 123456 contact
	 * test should fail when deleting the 123 contact
	 */
	@Test
	void testDeleteContact() {
		Assertions.assertTrue(contactService.deleteContact("123456"));
		Assertions.assertFalse(contactService.deleteContact("123"));
	}
	
	/* test to update a contact's first name
	 * test should pass when updating the 123456 contact
	 * test should fail when updating the 123 contact
	 */
	@Test
	void testFirstNameUpdate() {
		Assertions.assertTrue(contactService.updateContactFirstName("123456", "Nancy"));
		Assertions.assertFalse(contactService.updateContactFirstName("123", "Hannibal"));
	}
	
	/* test to update a contact's last name
	 * test should pass when updating the 123456 contact
	 * test should fail when updating the 333 contact
	 */
	@Test
	void testLastNameUpdate() {
		Assertions.assertTrue(contactService.updateContactLastName("123456", "Myers"));
		Assertions.assertFalse(contactService.updateContactLastName("333", "Bates"));
	}
	
	/* test to update a contact's phone number
	 * test should pass when updating the 123456 contact
	 * test should fail when updating the 333 contact
	 */
	@Test
	void testPhoneNumberUpdate() {
		Assertions.assertTrue(contactService.updateContactPhoneNumber("123456", "1112223333"));
		Assertions.assertFalse(contactService.updateContactPhoneNumber("333", "2223334444"));
	}
	
	/* test to update a contact's home address
	 * test should pass when updating the 123456 contact
	 * test should fail when updating the 333 contact
	 */
	@Test
	void testHomeAddressUpdate() {
		Assertions.assertTrue(contactService.updateContactHomeAddress("123456", "321 Lettuce Rd"));
		Assertions.assertFalse(contactService.updateContactHomeAddress("333", "545 Carrot Dr"));
	}
	
}
