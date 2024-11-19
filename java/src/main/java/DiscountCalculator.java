
public class DiscountCalculator {

    public static double calculateDiscount(double orderTotal, String customerType) {
        if("VIP".equals(customerType)){
            return orderTotal * 0.1;
        }

        return orderTotal < 100 ? 0 : orderTotal * 0.05;
    }

}
