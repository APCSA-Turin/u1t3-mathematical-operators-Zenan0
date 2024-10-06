public class Receipt {
    public static void main(String[] args) {
        final double KILOGRAMS_TO_POUNDS = 2.2;
        String customerName = "Stacey";
        double applePrice = 0.60;
        int apples = 12;
        double pineapplePrice = 3.59;
        int pineapples = 2;
        double ricePrice = 1.39 * KILOGRAMS_TO_POUNDS * 2;
        int riceBags = 3;
        int numberOfItems = apples + pineapples + riceBags;
        double totalCost = (applePrice * apples) + (pineapplePrice * pineapples) + (ricePrice * riceBags);
        double averageCost = totalCost / numberOfItems;
        int amountTendered = 40;
        double change = amountTendered - totalCost;

        System.out.println("------------------------------------");
        System.out.println("Customer: " + customerName);
        System.out.println("Number of Items: " + numberOfItems);
        System.out.println("Total Cost: $" + totalCost);
        System.out.println("Average Cost: $" + averageCost);
        System.out.println("------------------------------------");
        System.out.println("Cash Tendered: " + "$" + amountTendered);
        System.out.println("Change Received: $" + change);
        System.out.println("------------------------------------");
    }
}
