package seedu.addressbook.ui;

import static seedu.addressbook.common.Messages.*;
import java.lang.StringBuilder;

public class Formatter {

    /** A decorative prefix added to the beginning of lines printed by AddressBook */
    private static final String LINE_PREFIX = "|| ";

    /** A platform independent line separator. */
    private static final String LS = System.lineSeparator();

    private static final String DIVIDER = "===================================================";

    /** Format of indexed list item */
    private static final String MESSAGE_INDEXED_LIST_ITEM = "\t%1$d. %2$s";
    
    /** Shows message(s) to the user */
    public String showToUser(String... message) {
    	StringBuilder stringForDisplay = new StringBuilder();
        for (String m : message) {
            stringForDisplay.append(LINE_PREFIX + m.replace("\n", LS + LINE_PREFIX));
            stringForDisplay.append("\r\n");
        }
        return stringForDisplay.toString();
    }
    
    public String showUserCommand(String fullCommand){
    	return showToUser("[Command entered:" + fullCommand + "]");	
    }
    
    public String showWelcomeMessage(String version, String storageFileInfo){
    	return showToUser(
            DIVIDER,
            DIVIDER,
            MESSAGE_WELCOME,
            version,
            MESSAGE_PROGRAM_LAUNCH_ARGS_USAGE,
            storageFileInfo,
            DIVIDER);
    	}
    
    public String showGoodbyeMessage(){
    	return showToUser(MESSAGE_GOODBYE, DIVIDER, DIVIDER);
    }
    
    public String showInitFailedMessage() {
        return showToUser(MESSAGE_INIT_FAILED, DIVIDER, DIVIDER);
    }
    
    public String showResultToUser(String result){
    	return showToUser(result, DIVIDER);
    }
}
