package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

public class Contact {

    public static final String EXAMPLE = "dummy";
    public static final String MESSAGE_CONTACT_CONSTRAINTS = "dummy";
    public static final String CONTACT_VALIDATION_REGEX = "dummy";
	
    public final String value;
    protected boolean isPrivate;
    
    /**
     * Validates given Contact.
     *
     * @throws IllegalValueException if given Contactc string is invalid.
     */
    
    public Contact(String value, boolean isPrivate) throws IllegalValueException {
        this.isPrivate = isPrivate;
        String trimmedContact = value.trim();
        if (!isValidContact(trimmedContact)) {
            throw new IllegalValueException(MESSAGE_CONTACT_CONSTRAINTS);
        }
        this.value = trimmedContact;
    }
    
    /**
     * Checks if a given string is a valid person Contact.
     */
    public static boolean isValidContact(String test) {
        return test.matches(CONTACT_VALIDATION_REGEX);
    }

    public String toString() {
        return value;
    }

    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Contact // instanceof handles nulls
                && this.value.equals(((Contact) other).value)); // state check
    }

    public int hashCode() {
        return value.hashCode();
    }

    public boolean isPrivate() {
        return isPrivate;
    }
}
