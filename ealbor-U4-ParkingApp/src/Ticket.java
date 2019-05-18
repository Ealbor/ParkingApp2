public abstract class Ticket {

    /**
     *This Class is showcasing the
     *
     * ///////////////////////////
     * STRATEGY DESIGN PATTERN
     * \\\\\\\\\\\\\\\\\\\\\\\\\\\
     *
     * the reference to the Calculate interface is composition
     * which is inherited by subclass extending this class
     *
     * @Author Eric Albor 2019
     */


    //Needed for Summary Report
    protected int ticketId;

    //Needed for calculation
    protected int entryTime;
    protected int exitTime;

    //Needed for calculating specific cost
    protected String type;


    //This nameRefers to the Class it will be instantiating
    protected Calculate typeOfCalc;


    /**
     * Ticket object constructor
     * Creates a ticket object with set properties
     *
     * @param ticketId is the generated TicketId
     * @param entryTime is the time of simulated entry
     * @param exitTime is the time of simulated exit
     *
     * @return a Ticket object
     * */
    Ticket(int ticketId, int entryTime, int exitTime)
    {
        this.ticketId = ticketId;
        this.entryTime = entryTime;
        this.exitTime = exitTime;
    }



    /**
     * This method sets a constructed Ticket object to a Lost Ticket
     * It does so by reset its properties to 0
     * and the type to LOST
     *
     * */
    protected void setToLostTicket()
    {
        this.entryTime = 0;
        this.exitTime = 0;
        this.type = "LOST";
        setTypeOfCalculation(new LostCalculation());
    }


    /**
     * USING STRATEGY DESIGN PATTERN
     *
     * This method dynamically changes the type of calculation needed for a Ticket Object
     *
     * @param newCalcType is the {name of class}Calculation that is desired to be set to
     */
    //Used to change the kind of calculation used on the ticket
    protected abstract void setTypeOfCalculation(Calculate newCalcType);


    /**
     * Getters
     * */
    protected  abstract int calc();
    protected  abstract int getEntryTime();
    protected  abstract int getExitTime();
    protected  abstract int getTicketId();
    protected  abstract String getTicketType();

}
