using System;

public static class SimpleBookPricer
{
    public static double CalculatePrice(BookType type, double rrp, int monthsSincePublication)
    {
        if (type == BookType.Paperback)
        {
            return rrp;
        }

        if (monthsSincePublication > 6)
        {
            return Math.Round(rrp / 2.0);
        }

        double discount = 0;

        if (monthsSincePublication == 0)
        {
            discount = 2;
        }

        return rrp - discount;
    }
}
