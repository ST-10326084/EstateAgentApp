package propertyapp;

// class extends abrstract class
public class EstateAgentSales extends EstateAgent {

    public EstateAgentSales(String agentName, double propertyPrice) {
        super(agentName, propertyPrice); // (W3schools.com, 2023)
    }

    // this method is overridden to allow a user to recieve commsission
    @Override
    public double getAgentCommission() {
        return getPropertyPrice() * 0.20; // 20% commsission
    }

    // method to display report
    public void printPropertyReport() {
        System.out.println("ESTATE AGENT REPORT");
        System.out.println("********************");
        System.out.println("ESTATE AGENT NAME: " + getAgentName());
        System.out.println("PROPERTY PRICE: R " + getPropertyPrice());
        System.out.println("AGENT COMMISSION: R " + getAgentCommission());
    }
}

/** References
 * W3schools.com. (2023). Java super Keyword. [online] Available at: https://www.w3schools.com/java/ref_keyword_super.asp [Accessed 9 Oct. 2023].
 */