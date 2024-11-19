public class Book {

    public enum Type {HARDBACK, PAPERBACK};
    
    private final String title;
    private final String author;
    private double recomendedRetailPrice;

    public double getRecomendedRetailPrice() {
        return recomendedRetailPrice;
    }
    public void setRecomendedRetailPrice(double recomendedRetailPrice) {
        this.recomendedRetailPrice = recomendedRetailPrice;
    }
    private Type type;
    private int monthsSincePublication;

    public Type getType() {
        return type;
    }
    public void setType(Type type) {
        this.type = type;
    }
    public int getMonthsSincePublication() {
        return monthsSincePublication;
    }
    public void setMonthsSincePublication(int monthsSincePublication) {
        this.monthsSincePublication = monthsSincePublication;
    }
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }

}
