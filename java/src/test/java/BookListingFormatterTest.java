import static org.hamcrest.Matchers.equalTo;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;

class BookListingFormatterTest {

    @Test
    void shouldDisplayTitleFollowedByAuthorWhenNoRatingsOrPrizes(){
        Book book = new Book("The Hobbit", "J. R. R. Tolkien");
        String listing = BookListingFormatter.createListingText(book, book.getAuthor(), null, null, null);
        assertThat(listing, equalTo("The Hobbit by J. R. R. Tolkien"));
    }

    @Test
    void shouldDisplayTitleFollowedByAuthorAndRatingWhenNoPrizesAndRatingIs1(){
        Book book = new Book("The Hobbit", "J. R. R. Tolkien");
        String listing = BookListingFormatter.createListingText(book, book.getAuthor(), 1, null, null);
        assertThat(listing, equalTo("The Hobbit by J. R. R. Tolkien: 1 star"));
    }


    @Test
    void shouldDisplayTitleFollowedByAuthorAndRatingWhenNoPrizesAndRatingIs5(){
        Book book = new Book("The Hobbit", "J. R. R. Tolkien");
        String listing = BookListingFormatter.createListingText(book, book.getAuthor(), 5, null, null);
        assertThat(listing, equalTo("The Hobbit by J. R. R. Tolkien: 5 stars"));
    }

    @Test
    void shouldPrefixTitleWithPrizeWinningWhenBookSupplied(){
        Book book = new Book("The Hobbit", "J. R. R. Tolkien");
        String listing = BookListingFormatter.createListingText(book, book.getAuthor(), 5, "Fancy Prize", null);
        assertThat(listing, equalTo("Fancy Prize winner - The Hobbit by J. R. R. Tolkien: 5 stars"));
    }

    @Test
    void shouldAppendWinnerOfAuthorPrizeWhenSupplied(){
        Book book = new Book("The Hobbit", "J. R. R. Tolkien");
        String listing = BookListingFormatter.createListingText(book, book.getAuthor(), 5, "Fancy Prize", "Awesome Award");
        assertThat(listing, equalTo("Fancy Prize winner - The Hobbit by J. R. R. Tolkien (Winner of Awesome Award): 5 stars"));
    }
}
