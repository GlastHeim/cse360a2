package cse360assign2;

/**
 *
 * @author debra calliss
 * @editor kyle benda
 * @asuid 1207502981
 * @classid 85141
 * @description This is the adding machine class, meant to give us (the students of cse360)
 * practice with version control.
 */
public class AddingMachine {

	private int total;
        private String logStr;
	
    /**
     * Constructor for AddingMachine. Sets total and logstr to 0.
     */
    public AddingMachine () {
		total = 0;  // not needed - included for clarity
                logStr = "0"; //needed - not included for clarity
	}
	
    /**
     *
     * @return returns the current total
     */
    public int getTotal () {
		return total;
	}
	
    /**
     *
     * @param value value to add to total
     */
    public void add (int value) {
		total += value;
                logStr += "+"+Integer.toString(value);
	}
	
    /**
     *
     * @param value value to subtract from total
     */
    public void subtract (int value) {
		total -= value;
                logStr += "-"+Integer.toString(value);
	}
		
    /**
     *
     * @return a String detailing the history of additions and subtracts performed.
     * ie "add 2, subtract 1" would return 0+2-1 (as total was 0 to start with).
     */
    public String toString () {
		return logStr;
	}

    /**
     * Purpose of this method unclear. No description or use case given in assignment
     * documentation.
     */
    public void clear() {
	
	}
}