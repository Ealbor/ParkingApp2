import org.junit.Test;

import static org.junit.Assert.*;

public class GeneralTest {

    @Test
    public void testTicket()
    {
        Ticket testTicket = new SpecialEventTicket(1, 1, 1) {
            @Override
            public void setTypeOfCalculation(Calculate newCalcType) {

            }

            @Override
            public int calc() {
                return 0;
            }

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
        };
        assertTrue(testTicket.getEntryTime()==1);
        assertTrue(testTicket.calc()==0);
        assertTrue(testTicket.getEntryTime()==1);
        assertTrue(testTicket.getExitTime()==1);

    }


//    //Demoing the factory.
//        //It works
//    TicketFactory tf = TicketFactory.getInstance();
//
//    //Tested out "1" for minMax, tested out "2" for special event, test "3"
//    Ticket testTicket = tf.createTicket("1");
//
//    //Viewing the cost
//    System.out.println(testTicket.calc());




//
//    //Viewing the iD
//    System.out.println(testTicket.getTicketId());
//
//    //Creation of demo report (no parameter)
//    SummaryReport demoReport = new ReceiptReport();
//
//    //Set the ticket to lost
//     testTicket.setToLostTicket();
//
//    //CheckOut option of the second Option menu
//     demoReport.checkOut(testTicket);


    //I need a SummaryReport Reference
//    SummaryReport reference = new ReceiptReport();
//
//    //Starting up our array
//    ArrayList<Ticket> standardTickets = new ArrayList();
//    ArrayList<Ticket> specialTickets = new ArrayList();
//    ArrayList<Ticket> lostTickets = new ArrayList();
//
//    //Creation of 3 tickets
//    Ticket standardTicket = new MinMaxTicket(100, 10, 17);
//    Ticket standardTicketLost = new MinMaxTicket(100, 10, 13);
//    Ticket specialTicket = new SpecialEventTicket(100, 10, 13);
//
//    //Setting one to lost, as they cannot be instantiated.
//    standardTicketLost.setToLostTicket();
//
//    //Add tickets to the array
//        standardTickets.add(standardTicket);
//        specialTickets.add(specialTicket);
//        lostTickets.add(standardTicketLost);
//
//    //Creating the summary reports that contain the arrays
//    SummaryReport mm = new ReceiptReport(standardTickets);
//    SummaryReport se = new ReceiptReport(specialTickets);
//    SummaryReport lt = new ReceiptReport(lostTickets);
//    //Create some demo tickets
//
//    //closeGarageMethod will deliver report of sum
//    reference.closeGarage(mm, se, lt);


    //SUCCESS!!!
    //What we'll need is a SummaryReport reference so that we can do work each time the project is booted up.
    //Then what we need is to create 3 arrays for the types of tickets we've got
    //Then we'll need to instantiate them in





}