package propertyapp;
import java.util.Scanner;

// main method
public class RunApplication {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // (W3schools.com, 2023)

        // catch any wrong input and not crash program
        try { // (W3schools.com, 2023)
            // Get the estate agent name
            System.out.print("Enter the current estate agent name: ");
            String agentName = input.nextLine();

            // ask for property price
            System.out.print("Enter the property price: ");
            double propertyPrice = input.nextDouble();

            // Create an EstateAgentSales object.
            EstateAgentSales agent = new EstateAgentSales(agentName, propertyPrice);

            // print report
            agent.printPropertyReport();

            input.close();

        } catch (Exception e) {
            System.out.println("Wrong Input");
        }
    }
}


/**Reference List
 *  W3schools.com. (2023). Java Exceptions (Try...Catch). [online] Available at: https://www.w3schools.com/java/java_try_catch.asp [Accessed 9 Oct. 2023].
    W3schools.com. (2023). Java User Input (Scanner class). [online] Available at: https://www.w3schools.com/java/java_user_input.asp [Accessed 9 Oct. 2023].
 */