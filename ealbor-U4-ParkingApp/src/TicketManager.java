import java.util.ArrayList;

public class TicketManager {

    /**
     * This class is responsible for managing the ArrayLists of the types of Ticket
     * sub classes
     *
     * @author Eric Albor 2019
     * */


    //ArrayLists needed
    private ArrayList<Ticket> allStandardTickets;
    private ArrayList<Ticket> allSpecialEventTickets;
    private ArrayList<Ticket> allLostTickets;

    /**
     * The constructor defines the ArrayListProperties
     * and readies them for population
     * */
    TicketManager()
    {
        allStandardTickets = new ArrayList();
        allSpecialEventTickets = new ArrayList();
        allLostTickets = new ArrayList();
    }


    /**
     * Method that saves ticket to arrayList of
     * lost tickets
     * @param  ticket current Ticket Object
     * */
    public void saveToLostList(Ticket ticket){
        (this.allLostTickets).add(ticket);
    }

    /**
     * Method that saves ticket to arrayList of
     * Standard/MinMax tickets
     * @param  ticket current Ticket Object
     * */
    public void saveToStandardList(Ticket ticket){
        (this.allStandardTickets).add(ticket);
    }

    /**
     * Method that saves ticket to arrayList of
     * Special Event Tickets
     * @param  ticket current Ticket Object
     * */
    public void saveToSpecialList(Ticket ticket){
        (this.allSpecialEventTickets).add(ticket);
    }

    /**
     * Getters that return the arrayLists
     * */
    public ArrayList<Ticket> getStandardList(){
        return this.allStandardTickets;
    }

    public ArrayList<Ticket> getLostList(){
        return this.allLostTickets;
    }

    public ArrayList<Ticket> getSpecialList(){
        return this.allSpecialEventTickets;
    }


}
