public interface Calculate {

  /**
   * Calculate Interface to enforce DIP
   *
   * It's important to have an interface incorporate the types of calculation for future
   * extension.
   *
   * There may be instances where a business would like to charge less or more for certain events.
   */


  /**
   * This method calculates the cost of a Ticket using its predetermined properties
   *
   * @param entry the time of entry
   * @param exit the timne of exit
   * @param type what type of Ticket object is using the method
   * */
    int calculateCost(int entry, int exit, String type);
}
