public class LostCalculation implements Calculate {

    /**
     * This class is showcasing the
     *
     * \\\\\\\\\\\\\\\\\\\\\\\
     * STRATEGY DESIGN PATTERN
     *\\\\\\\\\\\\\\\\\\\\\\\\
     *
     * this class is implementing the Calculate Interface
     * which is referenced by composition in the Abstract Ticket class
     *
     * @author Eric Albor 2019
     * */



    /**
     * Calculates the cost of a LostTicket
     **@param entry the time of entry
     * @param exit the time of exit
     * @param type what type of Ticket object is using the method
     *
     * @return the standard flat rate of a lost ticket
     * */
    @Override
    public int calculateCost(int entry, int exit, String type) {

        //Ternary statement.
            //If the ticket is indeed
        return 25;
    }
}
