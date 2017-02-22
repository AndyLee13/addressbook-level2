package seedu.addressbook.data.tag;
import seedu.addressbook.data.person.Person;
import java.util.ArrayList;
/**
 * Association Class 
 * represent an adding or deleting of a tag 
 * for a specific person that happened during a specific session
 * @author LiChengcheng
 *
 */
public class Tagging {
	public enum TaggingType {ADD, DELETE};
	
	private Person _person;
	private Tag _tag;
	private TaggingType _taggingType;
    public static ArrayList<Tagging> Taggings;
    
	public Tagging(Person person, Tag tag, TaggingType taggingType){
		_person = person;
		_tag = tag;
		_taggingType = taggingType;
        Taggings.add(this);
	}
}
