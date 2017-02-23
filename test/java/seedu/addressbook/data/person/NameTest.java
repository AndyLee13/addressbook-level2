package seedu.addressbook.data.person;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import seedu.addressbook.data.exception.IllegalValueException;

public class NameTest {

	@Test
	public void testIsSimilar() throws IllegalValueException{
		Name name1 = new Name("Anthony");
		Name name2 = new Name("Anthony");
		assertEquals(true, name1.isSimilar(name2));
		
		Name fullname1 = new Name("Anthony Davis");
		assertTrue(fullname1.isSimilar(name1));
		assertTrue(name1.isSimilar(fullname1));
	}

}
