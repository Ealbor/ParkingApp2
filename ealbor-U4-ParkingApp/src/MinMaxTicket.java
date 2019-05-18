public class MinMaxTicket extends Ticket{

    /**
     * This is a subclass of the TICKET abstract
     * It is the Ticket instance of MINMAX
     *
     * @author Eric Albor 2019
     * */

    /**
     * Constructor for the object
     * Instantiation of this class defines the Calculate Type reference
     * found within parent Ticket Class
     *
     * @param ticketId generated id
     * @param entryTime generated time of entry
     * @param entryTime generated time of exit
     * */
    MinMaxTicket(int ticketId, int entryTime, int exitTime){
        super(ticketId,entryTime,exitTime);


        this.ticketId = ticketId;
        this.entryTime = entryTime;
        this.exitTime = exitTime;
        this.type = "STANDARD";
        typeOfCalc = new MinMaxCalculation();
    }



    /**
     * Abstract method from parent class
     * utilizes this Class' defined Calculate-type's class
     * to perform unique calculation
     *
     * @return cost of ticket
     * */
    @Override
    public int calc()
    {
        return typeOfCalc.calculateCost(this.entryTime, this.exitTime, this.type);

    }

    /**
     * Methods defined in parent class TICKET
     * */
    @Override
    public void setTypeOfCalculation(Calculate newCalcType) {
        typeOfCalc = newCalcType;
    }

    /**
     * Class getters
     * */
    @Override
    protected int getEntryTime() {
        return this.entryTime;
    }

    @Override
    protected int getExitTime() {
        return this.exitTime;
    }

    @Override
    protected int getTicketId() {
        return this.ticketId;
    }

    @Override
    protected String getTicketType() {
        return this.type;
    }


}
