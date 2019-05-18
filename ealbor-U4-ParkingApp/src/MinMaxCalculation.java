public class MinMaxCalculation implements Calculate
{

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

    private final int MAX_CHARGE = 15;
    private final int MIN_CHARGE = 5;
    private final int LOST_TICKET_COST = 25;



    /**
     * Calculates the cost of a MinMaxTicket
     * based on predetermined Min and Max charges
     *
     **@param entry the time of entry
     * @param exit the time of exit
     * @param type what type of Ticket object is using the method
     *
     * @return the cost of the ticket
     * */
    @Override
    public int calculateCost(int entry, int exit, String type) {
        if (type.equals("STANDARD")) {
            int hoursParked = exit - entry;
            int cost = 0;

            if (hoursParked <= 3) {
                cost = MIN_CHARGE;
            } else if (hoursParked >= 4) {
                cost = MIN_CHARGE + (hoursParked - 3);
            }

            return cost <= 15 ? cost : MAX_CHARGE;
        } else {
            return LOST_TICKET_COST;
        }
    }


}

