using FluentAssertions;
using Xunit;

public class SimpleBookPricerTest
{
    [Fact]
    public void Price_Should_Be_Rrp_When_Type_Is_Paperback()
{
        var rrp = 4.99;
        var price = SimpleBookPricer.CalculatePrice("title", "Author", Book.Type.PAPERBACK, rrp, 99);
        price.Should().Be(rrp);
    }

    [Fact]
    public void Price_Should_Be_Rrp_Minus_2_When_Type_Is_Hardback_And_Month_Is_0()
{
        var rrp = 16.99;
        var price = SimpleBookPricer.CalculatePrice("title", "Author", Book.Type.HARDBACK, rrp, 0);
        price.Should().BeApproximately(14.99, 0.001);
    }

    [Fact]
    public void Price_Should_Be_Rrp_When_Type_Is_Hardback_And_Month_Is_Between_1_And_6()
{
        var rrp = 16.99;
        var price = SimpleBookPricer.CalculatePrice("title", "Author", Book.Type.HARDBACK, rrp, 6);
        price.Should().BeApproximately(rrp, 0.001);
    }

    [Fact]
    public void Price_Should_Be_50_Percent_Rrp_When_Type_Is_Hardback_And_Month_Greater_Than_6()
{
        var rrp = 10;
        var price = SimpleBookPricer.CalculatePrice("title", "Author", Book.Type.HARDBACK, rrp, 7);
        price.Should().BeApproximately(5, 0.001);
    }
}
