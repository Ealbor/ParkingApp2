public class SpecialEventCalculation implements Calculate {

    /**
     * This class is showcasing the
     *
     * STRATEGY DESIGN PATTERN
     *
     * this class is implementing the Calculate Interface
     * which is referenced by composition in the Abstract Ticket class
     *
     * @author Eric Albor 2019
     * */






    /**
     * Calculates the cost of a SpecialTicket
     * Special Ticket is a standard rate
     *
     **@param entry the time of entry
     * @param exit the time of exit
     * @param type what type of Ticket object is using the method
     *
     * @return the cost of the ticket
     * */

    @Override
    public int calculateCost(int entry, int exit, String type) {

       return 20;

    }
}
