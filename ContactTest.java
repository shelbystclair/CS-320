package contact.contactService;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.api.Assertions;

class ContactTest {
	
	//created test cases for contact details
	@Test
	void testContact() {
		Contact contact = new Contact("123456", "Freddy", "Krueger", "7777777777", "123 Sesame Street");
		assertTrue(contact.getContactID().equals("123456"));
		assertTrue(contact.getFirstName().equals("Freddy"));
		assertTrue(contact.getLastName().equals("Krueger"));
		assertTrue(contact.getPhoneNumber().equals("7777777777"));
		assertTrue(contact.getHomeAddress().equals("123 Sesame Street"));
	}
	
	//parameterized test to ensure contact ID cannot be null or longer than 10 characters
	@ParameterizedTest
	@ValueSource(strings = {"1234567890123"})
	@NullSource
	void testInvalidContactID(String contactID) {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(contactID, "Freddy", "Krueger", "7777777777", "123 Sesame Street");
		});
	}
	
	//parameterized test to ensure contact first name cannot be null or longer than 10 characters
	@ParameterizedTest
	@ValueSource(strings = {"JasonVorhees"})
	@NullSource
	void testInvalidFirstName(String firstName) {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("123456", firstName, "Krueger", "7777777777", "123 Sesame Street");
		});
	}
	
	//parameterized test to ensure contact last name cannot be null or longer than 10 characters
	@ParameterizedTest
	@ValueSource(strings = {"KrugerDreams"})
	@NullSource
	void testInvalidLastName(String lastName) {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("123456", "Freddy", lastName, "7777777777", "123 Sesame Street");
		});
	}
	
	//parameterized test to ensure contact phone number cannot be null or not equal to 10 characters
	@ParameterizedTest
	@ValueSource(strings = {"777", "7777777777777777"})
	@NullSource
	void testInvalidPhoneNumber(String phoneNumber) {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("123456", "Freddy", "Krueger", phoneNumber, "123 Sesame Street");
		});
	}
	
	//parameterized test to ensure contact home address cannot be null or longer than 30 characters
	@ParameterizedTest
	@ValueSource(strings = {"123 Sesame Street Cincinnati, OH 45213"})
	@NullSource
	void testInvalidHomeAddress(String homeAddress) {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("123456", "Freddy", "Krueger", "7777777777", homeAddress);
		});
	}
}
