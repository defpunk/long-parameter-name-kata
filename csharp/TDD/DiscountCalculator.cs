public static class DiscountCalculator
{
    public static double CalculateDiscount(double orderTotal, string customerType)
    {
        if (customerType == "VIP")
        {
            return orderTotal * 0.1;
        }

        return orderTotal < 100 ? 0 : orderTotal * 0.05;
    }
}
