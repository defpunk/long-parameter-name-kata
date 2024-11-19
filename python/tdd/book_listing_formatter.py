class BookListingFormatter:
    @staticmethod
    def create_listing_text(book, author, star_rating, book_prize, author_prize):
        listing_text = ""
        if book_prize is not None and len(book_prize) > 0:
            listing_text += book_prize + " winner - "
        listing_text += f"{book.title} by {author}"
        if author_prize is not None and len(author_prize) > 0:
            listing_text += f" (Winner of {author_prize})"
        if star_rating is not None:
            if star_rating == 1:
                listing_text += ": 1 star"
            else:
                listing_text += f": {star_rating} stars"
        return listing_text
