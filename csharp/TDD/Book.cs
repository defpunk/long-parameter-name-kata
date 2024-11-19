public enum BookType { Hardback, Paperback };

public class Book
{
    public string Title { get; }
    public string Author { get; }
    public double RecommendedRetailPrice { get; set; }
    public BookType Type { get; set; }
    public int MonthsSincePublication { get; set; }

    public Book(string title, string author)
    {
        Title = title;
        Author = author;
    }
}
