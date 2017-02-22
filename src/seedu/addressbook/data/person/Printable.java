package seedu.addressbook.data.person;
/**
 * A read-only immutable interface for printables in the addressbook.
 */
public interface Printable {
	String toString();
	default String getPrintableString(){
		return this.toString();
	}
}
