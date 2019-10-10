package cse360assign2;

/**
 *
 * @author debra calliss
 * @editor kyle benda
 * @asuid 120750???
 * @description This is the adding machine class, meant to give us (the students of cse360)
 * practice with version control.
 */
public class AddingMachine {

	private int total;
	
    /**
     * Constructor for AddingMachine. Sets total to 0. Nothing else.
     */
    public AddingMachine () {
		total = 0;  // not needed - included for clarity
	}
	
    /**
     *
     * @return returns the current total
     */
    public int getTotal () {
		return 0;
	}
	
    /**
     *
     * @param value value to add to total
     */
    public void add (int value) {
		
	}
	
    /**
     *
     * @param value value to subtract from total
     */
    public void subtract (int value) {
		
	}
		
    /**
     *
     * @return a String detailing the history of additions and subtracts performed.
     * ie "add 2, subtract 1" would return 0+2-1 (as total was 0 to start with).
     */
    public String toString () {
		return "";
	}

    /**
     * Purpose of this method unclear. No description or use case given in assignment
     * documentation.
     */
    public void clear() {
	
	}
}