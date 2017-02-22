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
	
	public static final String ADD_TAGGING_EXPRESSION = "+";
	public static final String DELETE_TAGGING_EXPRESSION = "-";

	public Tagging(Person person, Tag tag, TaggingType taggingType){
		_person = person;
		_tag = tag;
		_taggingType = taggingType;
	}

	/**
	 * @return the _person
	 */
	public Person get_person() {
		return _person;
	}

	/**
	 * @return the _tag
	 */
	public Tag get_tag() {
		return _tag;
	}

	/**
	 * @return the _taggingType
	 */
	public TaggingType get_taggingType() {
		return _taggingType;
	}
	
	private String getTypeExpression(){
		if(this.get_taggingType().equals(TaggingType.ADD)){
			return ADD_TAGGING_EXPRESSION;
		}
		return DELETE_TAGGING_EXPRESSION;
	}
	
	public String toString(){
		return this.getTypeExpression()+ " " + this.get_person().getName() + " " 
				+ this.get_tag();
	}
}
