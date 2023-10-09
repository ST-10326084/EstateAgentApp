package propertyapp;

// abstract class that implents interface
// does this need to be called Staff???
public abstract class EstateAgent implements iEstateAgent { // (GeeksforGeeks, 2012)

    private String agentName;
    private double propertyPrice;

    // constructor to set variables
    public EstateAgent(String agentName, double propertyPrice) { // (GeeksforGeeks, 2017)
        this.agentName = agentName;
        this.propertyPrice = propertyPrice;
    }

    // get method
    @Override
    public String getAgentName() {
        return agentName;
    }

    // get method
    @Override
    public double getPropertyPrice() {
        return propertyPrice;
    }

    // get method
    @Override
    public abstract double getAgentCommission();
}


/** References
 * GeeksforGeeks. (2017). Java Constructors. [online] Available at: https://www.geeksforgeeks.org/constructors-in-java/ [Accessed 9 Oct. 2023].
 * GeeksforGeeks. (2012). Abstract Class in Java. [online] Available at: https://www.geeksforgeeks.org/abstract-classes-in-java/ [Accessed 9 Oct. 2023].
 */