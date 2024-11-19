import static java.lang.String.format;

public class BookListingFormatter {

    public static String createListingText(Book book, String author, Integer starRating, String bookPrize, String authorPrize) {
        StringBuilder stringBuilder = new StringBuilder();
        if(bookPrize != null && !bookPrize.isEmpty()){
            stringBuilder.append(bookPrize);
            stringBuilder.append(" winner - ");
        }
        stringBuilder.append(format("%s by %s", book.getTitle(), author));

        if(authorPrize != null && !authorPrize.isEmpty()){
            stringBuilder.append(" (Winner of ");
            stringBuilder.append(authorPrize);
            stringBuilder.append(")");
        }

        if(starRating != null){
            if(1 == starRating) { 
                stringBuilder.append(": 1 star");
            } else {
                stringBuilder.append(": ");
                stringBuilder.append(starRating);
                stringBuilder.append(" stars");
            }
        }
        return stringBuilder.toString();
    }

}
