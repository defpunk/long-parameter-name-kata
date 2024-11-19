using FluentAssertions;
using Xunit;

public class ShippingCostCalculatorTest
{
    [Fact]
    public void Shipping_Should_Be_1_99_When_Order_Country_Is_UK_And_Book_Count_Is_1()
    {
        var books = new Book[] { new Book("Fly fishing", "J R Hartley") };
        var shipping = ShippingCostCalculator.CalculateShipping("name", 1, books, "Line 1", "Line 2", null, "Liverpool", "UK");
        shipping.Should().Be(1.99);
    }

    [Fact]
    public void Shipping_Should_Be_5_99_When_Order_Country_Is_UK_And_Book_Count_Is_Over_5()
    {
        var books = new Book[]
        {
            new Book("Clean Code: A Handbook of Agile Software Craftsmanship", "Robert C. Martin"),
            new Book("The Pragmatic Programmer: From Journeyman to Master", "David Thomas, Andrew Hunt"),
            new Book("Design Patterns: Elements of Reusable Object-Oriented Software", "Erich Gamma, Richard Helm, Ralph Johnson, John Vlissides"),
            new Book("Head First Design Patterns: A Brain-Friendly Guide", "Eric Freeman, Elisabeth Robson, Bert Bates, Kathy Sierra"),
            new Book("Refactoring: Improving the Design of Existing Code", "Martin Fowler"),
            new Book("Code Complete: A Practical Handbook of Software Construction", "Steve McConnell")
        };
        var shipping = ShippingCostCalculator.CalculateShipping("name", 1, books, "Line 1", "Line 2", null, "Liverpool", "UK");
        shipping.Should().Be(5.99);
    }

    [Fact]
    public void Shipping_Should_Be_0_When_Order_Country_Is_UK_And_Book_Count_Is_Over_10()
    {
        var books = new Book[]
        {
            new Book("Getting Things Done: The Art of Stress-Free Productivity", "David Allen"),
            new Book("The 7 Habits of Highly Effective People", "Stephen R. Covey"),
            new Book("Atomic Habits: An Easy & Proven Way to Build Good Habits & Break Bad Ones", "James Clear"),
            new Book("The One Thing: The Surprisingly Simple Truth Behind Extraordinary Results", "Gary Keller"),
            new Book("Deep Work: Rules for Focused Success in a Distracted World", "Cal Newport"),
            new Book("Eat That Frog!: 21 Great Ways to Stop Procrastinating and Get More Done in Less Time", "Brian Tracy"),
            new Book("The Power of Less: The Fine Art of Limiting Yourself to the Essential", "Leo Babauta"),
            new Book("The 4 Disciplines of Execution: Achieving Your Wildly Important Goals", "Chris McChesney, Sean Covey, Jim Huling"),
            new Book("Essentialism: The Disciplined Pursuit of Less", "Greg McKeown"),
            new Book("Smarter Faster Better: The Transformative Power of Real Productivity", "Charles Duhigg"),
            new Book("The 80/20 Principle: The Secret to Achieving More with Less", "Richard Koch")
        };
        var shipping = ShippingCostCalculator.CalculateShipping("name", 1, books, "Line 1", "Line 2", null, "Liverpool", "UK");
        shipping.Should().Be(0);
    }
}