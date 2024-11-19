using FluentAssertions;
using Xunit;

public class BookListingFormatterTest
{
    [Fact]
    public void ShouldDisplayTitleFollowedByAuthorWhenNoRatingsOrPrizes()
{
        var book = new Book("The Hobbit", "J. R. R. Tolkien");
        var listing = BookListingFormatter.CreateListingText(book, book.Author, null, null, null);
        listing.Should().Be("The Hobbit by J. R. R. Tolkien");
    }

    [Fact]
    public void ShouldDisplayTitleFollowedByAuthorAndRatingWhenNoPrizesAndRatingIs1()
{
        var book = new Book("The Hobbit", "J. R. R. Tolkien");
        var listing = BookListingFormatter.CreateListingText(book, book.Author, 1, null, null);
        listing.Should().Be("The Hobbit by J. R. R. Tolkien: 1 star");
    }

    [Fact]
    public void ShouldDisplayTitleFollowedByAuthorAndRatingWhenNoPrizesAndRatingIs5()
{
        var book = new Book("The Hobbit", "J. R. R. Tolkien");
        var listing = BookListingFormatter.CreateListingText(book, book.Author, 5, null, null);
        listing.Should().Be("The Hobbit by J. R. R. Tolkien: 5 stars");
    }

    [Fact]
    public void ShouldPrefixTitleWithPrizeWinningWhenBookSupplied()
{
        var book = new Book("The Hobbit", "J. R. R. Tolkien");
        var listing = BookListingFormatter.CreateListingText(book, book.Author, 5, "Fancy Prize", null);
        listing.Should().Be("Fancy Prize winner - The Hobbit by J. R. R. Tolkien: 5 stars");
    }

    [Fact]
    public void ShouldAppendWinnerOfAuthorPrizeWhenSupplied()
{
        var book = new Book("The Hobbit", "J. R. R. Tolkien");
        var listing = BookListingFormatter.CreateListingText(book, book.Author, 5, "Fancy Prize", "Awesome Award");
        listing.Should().Be("Fancy Prize winner - The Hobbit by J. R. R. Tolkien (Winner of Awesome Award): 5 stars");
    }
}
