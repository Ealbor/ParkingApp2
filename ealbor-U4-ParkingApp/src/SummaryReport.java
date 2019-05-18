import java.util.ArrayList;

/**
 * This is the backbone of the reports generated by the program
 *  It acts as the super class of the ReceiptReport class
 *
 *  By being abstract and extended by the Receipt Report class, we're practicing DIP
 *
 * This class will set up properties for subclass to inherit
 * This class will name abstract methods to be defined by extended subclasses
 *
 * @author Eric Albor
 * */

public abstract class SummaryReport {

    //This will hold the sum of ticket costs in an array
    protected int checkInSum = 0;

    //This will hold the number of type of tickets (# of MinMax tickets, # of SpecialEvent tickets, # of lost tickets)
    protected int numOfCheckIns = 0;

    //This will hold the grand total of all the lists (The sum of MinMax, Special, and lost tickets combined)
    protected int grandTotal = 0;



    //This is redundant, but this basic constructor reminds developer that we can use a basic constructor too
    SummaryReport(){}


     //This allows for polymorphism with subclass constructor
     SummaryReport(ArrayList<Ticket> listOfTickets){}



     /**
      * Methods to be defined in subclass ReceiptReport
      * */
    public abstract void checkOut(Ticket currentTicket);

    public abstract void closeGarage(SummaryReport mm, SummaryReport se, SummaryReport lt);

    //Will be used to return the sum in detailed report
    public abstract int getCheckInSum();

    //Will be used to get the number of tickets in an array of tickets
    public abstract int getNumOfCheckIns();

    //Will be used to return the total grand sum of all tickets in all arrays
    public abstract int getGrandTotalSum();



}
