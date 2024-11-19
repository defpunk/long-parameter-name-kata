using FluentAssertions;
using Xunit;

public class DiscountCalculatorTest
{
    [Fact]
    public void Discount_Should_Be_10_Percent_Of_Order_For_VIP_Customers()
{
        var discount = DiscountCalculator.CalculateDiscount(100, "VIP");
        discount.Should().Be(10d);
    }

    [Fact]
    public void Discount_Should_Be_0_For_Standard_Customer_When_Order_Under_100()
{
        var discount = DiscountCalculator.CalculateDiscount(99, "STANDARD");
        discount.Should().Be(0d);
    }

    [Fact]
    public void Discount_Should_Be_5_For_Standard_Customer_When_Order_Is_100()
{
        var discount = DiscountCalculator.CalculateDiscount(100, "STANDARD");
        discount.Should().Be(5d);
    }
}
