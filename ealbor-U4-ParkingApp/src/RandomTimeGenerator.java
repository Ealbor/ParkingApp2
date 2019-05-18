public class RandomTimeGenerator implements TimeGenerate {

    /**
     * This class implements the TimeGenerate Interface to practice the DIP
     *
     * As it is, it generates a random time
     *
     *
     * @author Eric Albor 2019
     * */



    /**
     * Method produces a random number between the two specified param
     * @param start start time
     * @param end end time
     * @return the randomized int
     * */
    public static int randBetween(int start, int end)
    { return start + (int)Math.round(Math.random() * (end - start)); }


    /**
     * Abstract method gained from the TimeGenerate Interface
     * responsible for generating the Entry time of a ticket
     * @return a random int between 7 and 12
     * */
    public int generateEntry()
    {
        int hour = randBetween(7, 12);
        //int minutes = randBetween(0, 59);

        return hour;
    }

    /**
     * Abstract method gained from the TimeGenerate Interface
     * responsible for generating the Exit time of a ticket
     * @return a random int between 13 and 23
     * */
    public int generateExit()
    {
        int hour = randBetween(13, 23);
        //int minutes = randBetween(0,59);

        return hour;
    }
}