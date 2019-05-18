import java.util.Scanner;

/**
 * This class is instantiated via
 *
 * \\\\\\\\\\\\\\\\
 * SINGLETON DESIGN PATTERN
 * \\\\\\\\\\\\\\\\
 *
 * It is responsible for filtering through user input and executes the program holistically
 *
 * @author Eric Albor 2019
 * */

public class UserInterface {

    //User input
    protected Scanner keyboard = new Scanner(System.in);
     //TicketFactory Reference
    protected TicketFactory ticketFactory;
    //SummaryReport Reference
    protected SummaryReport srReference;
    //Ticket Reference
    protected Ticket ticketPlaceHolder;
    //TicketManager Reference
    protected TicketManager ticketManager;


    //SINGLETON COMPONENTS
    private static UserInterface firstInstance = null;

    /**
     * static method which retrieves the instance created by the
     * private constructor
     *
     * @return instance of the UserInterface class
     * */
    public static UserInterface getInstance()
    {
        if(firstInstance==null)
        {
            firstInstance = new UserInterface();
        }
        return firstInstance;
    }


    /**
     * The constructor of the class is private
     * but once instantiated, defines the composition
     * reference to the Receipt Report class
     * TicketFactory and TicketManager
     */
    private UserInterface() {
        srReference = new ReceiptReport();
        ticketFactory = new TicketFactory();
        ticketManager = new TicketManager();
    }


    /**
     * Generates the first user screen during program run time
     * Accepts user input
     * creates ticket as specified
     * returns a boolean value to exit while loop used on Main driver
     *
     * @return boolean value to exit while loop
     * */
    //This is one of the methods that will be run by the UI
    public Boolean optionsSetOne() {
        String optionSelected = "";
        boolean valid = true;

        while (valid) {
            try {
                System.out.println("Best Value Parking Garage\n");
                System.out.println("=========================");
                System.out.println("1 - Check In");                 //Option used for TicketFactory minMaxTicket
                System.out.println("2 - Special Event");                 //Option used for TicketFactory minMaxTicket
                System.out.println("3 - Close Garage");             //Option for Summary report
                System.out.println("=>");
                optionSelected = keyboard.nextLine();


                if (Integer.parseInt(optionSelected) == 1) {
                    ticketPlaceHolder = ticketFactory.createTicket("MinMax");       //Defining ticketPlaceHolder as MinMax type ticket
                    System.out.println();
                    System.out.println();//extra space on console
                    break;
                } else if (Integer.parseInt(optionSelected) == 2) {
                    ticketPlaceHolder =  ticketFactory.createTicket("Special");     //Defining ticketPlaceHolder as SpecialEvent type ticket
                    System.out.println();
                    System.out.println();//extra space on console
                    break;
                } else if (Integer.parseInt(optionSelected) == 3) {                             //Closing Garage

                    SummaryReport mm = new ReceiptReport(ticketManager.getStandardList());
                    SummaryReport se = new ReceiptReport(ticketManager.getSpecialList());
                    SummaryReport lt = new ReceiptReport(ticketManager.getLostList());

                    srReference.closeGarage(mm, se, lt);                          //uses the sumReports, args == sumReport type
                    System.out.println();
                    System.out.println(); //Extra space on console

                    return true;
                } else {
                    valid = false;
                    System.out.println("Choose one of the three options!\n");
                }

            } catch (Exception e) {
                System.out.println("An exception is being thrown! \n");
                //providing some breathing space
                System.out.println();
            }
        }
        return  false;

    }

    /**
     * Generates the second user screen during program run time
     * Accepts user input
     * creates the receipt for successfully checkout tickets
     * or
     * creates the receipt for lost tickets
     * also saves tickets to respective ArrayLists
     *
     * */

    public void optionsSetTwo() {
        String optionSelected = "";
        boolean invalid = true;


        while (invalid) {
            try {
                System.out.println("Best Value Parking Garage\n");
                System.out.println("=========================");
                System.out.println("1 - Check/Out");
                System.out.println("2 - Lost Ticket");
                System.out.println("=>");
                optionSelected = keyboard.nextLine();

                if (Integer.parseInt(optionSelected) == 1) {
                    srReference.checkOut(ticketPlaceHolder);
                        if(ticketPlaceHolder.getTicketType().equals("STANDARD"))
                        {
                            ticketManager.saveToStandardList(ticketPlaceHolder);
                        } else
                            {
                                ticketManager.saveToSpecialList(ticketPlaceHolder);
                            }
                    System.out.println();
                    System.out.println(); //extra space on console
                    break;

                } else if (Integer.parseInt(optionSelected) == 2) {
                  ticketPlaceHolder.setToLostTicket();                                //Convert to lost ticket
                  srReference.checkOut(ticketPlaceHolder);
                  ticketManager.saveToLostList(ticketPlaceHolder);//Add this to the lost array
                    System.out.println();
                    System.out.println(); //extra space on console.
                    break;
                } else {
                    System.out.println("Choose one of the two options!\n");
                }
            } catch (Exception e) {
                System.out.println("Be sure to choose one of the two options! \n");
                //providing some breathing space
                System.out.println();
            }
        }
    }


}
