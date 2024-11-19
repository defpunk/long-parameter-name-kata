using System.Text;

public static class BookListingFormatter
{
    public static string CreateListingText(Book book, string author, int? starRating, string bookPrize, string authorPrize)
    {
        StringBuilder stringBuilder = new StringBuilder();

        if (!string.IsNullOrEmpty(bookPrize))
        {
            stringBuilder.Append($"{bookPrize} winner - ");
        }

        stringBuilder.Append($"{book.Title} by {author}");

        if (!string.IsNullOrEmpty(authorPrize))
        {
            stringBuilder.Append($" (Winner of {authorPrize})");
        }

        if (starRating.HasValue)
        {
            stringBuilder.Append(starRating == 1 ? ": 1 star" : $": {starRating} stars");
        }

        return stringBuilder.ToString();
    }
}
