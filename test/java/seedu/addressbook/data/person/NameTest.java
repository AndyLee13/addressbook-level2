package seedu.addressbook.data.person;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

import seedu.addressbook.data.exception.IllegalValueException;

public class NameTest {

	@Test
	public void testIsSimilar() throws IllegalValueException{
		Name name1 = new Name(" ");
		Name name2 = new Name(" ");
		assertEquals(true, name1.isSimilar(name2));
	}

}
