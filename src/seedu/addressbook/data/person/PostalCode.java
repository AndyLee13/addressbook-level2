package seedu.addressbook.data.person;

class PostalCode{
	private String value;
	
	public PostalCode(String postalCode){
		value = postalCode;
	}
	
	public String getValue(){
		return value;
	}
}
