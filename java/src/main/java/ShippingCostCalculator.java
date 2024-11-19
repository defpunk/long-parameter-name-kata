
public class ShippingCostCalculator {

    public static double calculateShipping(String customerName, int customerId, Book[] books, String firstLineOfAddress, 
    String secondLineOfAddress,
            String thirdLineOfAddress, String forthLineOfAddress, String country) {
      
                if(!"UK".equals(country)) {
                    return 15.99;
                }

                if (books.length > 10) {
                    return 0;
                } else if (books.length > 5) {
                    return 5.99;
                } else {
                    return 1.99;
                }
    }

}
