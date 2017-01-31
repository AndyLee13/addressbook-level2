package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

/**
 * Represents a Person's address in the address book.
 * Guarantees: immutable; is valid as declared in {@link #isValidAddress(String)}
 */
public class Address {

    public static final String EXAMPLE = "123, some street";
    public static final String MESSAGE_ADDRESS_CONSTRAINTS = "Person addresses can be in any format";
    public static final String ADDRESS_VALIDATION_REGEX = ".+";
    
    
    private Block block;
    private Street street;
    private Unit unit;
    private PostalCode postalCode;
    private boolean isPrivate;

    /**
     * Validates given address.
     *
     * @throws IllegalValueException if given address string is invalid.
     */
    public Address(String address, boolean isPrivate) throws IllegalValueException {
        String trimmedAddress = address.trim();
        this.isPrivate = isPrivate;
        if (!isValidAddress(trimmedAddress)) {
            throw new IllegalValueException(MESSAGE_ADDRESS_CONSTRAINTS);
        }
        String[] addressArray = trimmedAddress.split(",");
        block = new Block(addressArray[0].trim());
        street = new Street(addressArray[1].trim());
        unit = new Unit(addressArray[2].trim());
        postalCode = new PostalCode(addressArray[3].trim());
    }

    /**
     * Returns true if a given string is a valid person email.
     */
    public static boolean isValidAddress(String test) {
        return test.matches(ADDRESS_VALIDATION_REGEX);
    }

    @Override
    public String toString() {
        return block.getValue()+", " + street.getValue() + ", "
        			+ unit.getValue() + ", " + postalCode.getValue();
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Address // instanceof handles nulls
                && this.toString().equals(((Address) other).toString())); // state check
    }

    @Override
    public int hashCode() {
        return this.toString().hashCode();
    }

    public boolean isPrivate() {
        return isPrivate;
    }
    
    class Block{
    	private String value;
    	
    	public Block(String block){
    		value = block;
    	}
    	
    	private String getValue(){
    		return value;
    	}
    }
    
    class Street{
    	private String value;
    	
    	public Street(String street){
    		value = street;
    	}
    	
    	private String getValue(){
    		return value;
    	}
    }
    
    class Unit{
    	private String value;
    	
    	public Unit(String unit){
    		value = unit;
    	}
    	
    	private String getValue(){
    		return value;
    	}
    }
    
    class PostalCode{
    	private String value;
    	
    	public PostalCode(String postalCode){
    		value = postalCode;
    	}
    	
    	private String getValue(){
    		return value;
    	}
    }
}
