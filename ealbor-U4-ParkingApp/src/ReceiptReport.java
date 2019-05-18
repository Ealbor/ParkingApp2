import java.util.ArrayList;

    /**
     * Subclass of SummaryReport Abstract Class
     * This class is responsible for the closing the garage and generating receipts
     * for each ticket that checks out successfully.
     *
     * @author Eric Albor 2019
     * */

public class ReceiptReport extends SummaryReport {


    /**
     * a Constructor for class
     * It accepts an ArrayList of type Ticket
     * iterates through the arraylist, and populates class
     * inherited properties found in the SummaryReport class
     *
     * @param listOfTickets the specific ArrayList that needs to be iterated through
     * */
    ReceiptReport(ArrayList<Ticket> listOfTickets){

        for(Ticket i : listOfTickets)
        {
            //gets the sum of Checked in/out tickets
            this.checkInSum += i.calc();
            this.grandTotal =+ this.checkInSum;
        }
         this.numOfCheckIns = listOfTickets.size();
    }

    /**
     * basic constructor
     * */
    ReceiptReport(){}



   /**
    * Abstract method gained from superclass
    * It accepts a ticket and generates a report based on the
    * calculated properties of the Ticket
    * @param currentTicket is the ticket at moment
    * */
    @Override
    public void checkOut(Ticket currentTicket) {
        //UI screen for checkoutScreen

            System.out.println("Best Value Parking Garage");
            System.out.println("=========================");
            System.out.println("Receipt for vehicle id " + currentTicket.getTicketId() + "\n");
            System.out.println((currentTicket.getExitTime() - currentTicket.getEntryTime())+ " hours parked " + currentTicket.getEntryTime() + "am - " + (currentTicket.getExitTime() == 0? 0:currentTicket.getExitTime()-12) + "pm\n");
            System.out.println();
            System.out.println(currentTicket.getTicketType() + " TICKET");
            System.out.println("$" + currentTicket.calc() + "\n");
            System.out.println();   //Extra space on console;

    }



    /**
     * This method is responsible for generating the report
     * that sums all of collected tickets during program
     * run time.
     *
     * @param mm stands for the SummaryReport of MinMax tickets
     * @param se stands for the SummaryReport of SpecialEvent tickets
     * @param lt stands for the SummaryReport of LostTicket tickets
     * */

    public void closeGarage(SummaryReport mm, SummaryReport se, SummaryReport lt) {
        System.out.println();
        System.out.println("Best Value Parking Garage");
        System.out.println("=========================");
        System.out.println("Activity to Date\n\n");
        System.out.println("$" + mm.getCheckInSum() + " was collected from " +
                mm.getNumOfCheckIns()+ " Check Ins");
        System.out.println("$" + se.getCheckInSum() + " was collected from " +
                se.getNumOfCheckIns() + " Special Event check Ins");
        System.out.println("$" + lt.getCheckInSum()+ " was collected from " +
                lt.getNumOfCheckIns() + " Lost Tickets\n\n");
        System.out.println("$" + (mm.getGrandTotalSum()+ se.getGrandTotalSum() + lt.getGrandTotalSum()) + " was collected overall");
        System.exit(1);
    }


    /**
     * Getters
     * */

    @Override
    public int getCheckInSum() {
        return this.checkInSum;
    }

    @Override
    public int getNumOfCheckIns() {
        return this.numOfCheckIns;
    }

    @Override
    public int getGrandTotalSum() {
        return this.grandTotal;
    }

}
