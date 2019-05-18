public  class TicketFactory {

   /**
    * This class utilizes the
    *
    * \\\\\\\\\\\\\\\\\\\\\\
    * FACTORY DESIGN PATTERN
    * \\\\\\\\\\\\\\\\\\\\\\
    *
    * It pumps out the subclass of Abstract Ticket class as the user decides
    *
    * */

    //These are the references made to the Interfaces needed to create tickets
    protected TimeGenerate timeGenerate;
    protected IdGenerate id;


    /**
     * The class constructor
     * defines the TimeGenerate and IdGenerate interface type classes
     * that are needed to create tickets
     * */
    public TicketFactory()
    {
        //factory instantiation instantiates other variables
        timeGenerate = new RandomTimeGenerator();
        id = new RandomIdGenerator();
    }


    /**
     * Creates tickets based on user arguments
     * and FACTORY PATTERN
     *
     * @param newTicketType is the String decided by the user input
     * */

    public Ticket createTicket(String newTicketType)
    {

        if(newTicketType.equals("MinMax"))
        {
            return new MinMaxTicket(id.generateId(),timeGenerate.generateEntry(),timeGenerate.generateExit());
        } else
            if(newTicketType.equals("Special"))
            {
                return new SpecialEventTicket(id.generateId(),timeGenerate.generateEntry(),timeGenerate.generateExit());
            }

            else return null;
    }

}
