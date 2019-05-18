public class RandomIdGenerator implements IdGenerate {

    /**
     * This class implements the IdGenerate Interface to practice the DIP
     *
     * As it is, it generates a random id
     *
     *
     * @author Eric Albor 2019
     * */

    /**
     * Basic randomizer
     *
     * @param start a starting time
     * @param end an end time
     * @return an int
     * */
    public static int randBetween(int start, int end)
    { return start + (int)Math.round(Math.random() * (end - start)); }


    /**
     * Abstract method gained from the IdGenerate Interface
     * responsible for generating the ID
     * @return a random int between 1 and 100
     * */
    @Override
    public int generateId() {
        return randBetween(1,100);
    }
}
