public static class ShippingCostCalculator
{
    public static double CalculateShipping(Book[] books, string country)
    {
        if (country != "UK")
        {
            return 15.99;
        }

        if (books.Length > 10)
        {
            return 0;
        }
        else if (books.Length > 5)
        {
            return 5.99;
        }
        else
        {
            return 1.99;
        }
    }
}
