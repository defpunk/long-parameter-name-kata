import unittest
from tdd.book_listing_formatter import BookListingFormatter
from tdd.book import Book

class BookListingFormatterTest(unittest.TestCase):

    def test_should_display_title_followed_by_author_when_no_ratings_or_prizes(self):
        book = Book("The Hobbit", "J. R. R. Tolkien")
        listing = BookListingFormatter.create_listing_text(book, book.author, None, None, None)
        self.assertEqual(listing, "The Hobbit by J. R. R. Tolkien")

    def test_should_display_title_followed_by_author_and_rating_when_no_prizes_and_rating_is_1(self):
        book = Book("The Hobbit", "J. R. R. Tolkien")
        listing = BookListingFormatter.create_listing_text(book, book.author, 1, None, None)
        self.assertEqual(listing, "The Hobbit by J. R. R. Tolkien: 1 star")

    def test_should_display_title_followed_by_author_and_rating_when_no_prizes_and_rating_is_5(self):
        book = Book("The Hobbit", "J. R. R. Tolkien")
        listing = BookListingFormatter.create_listing_text(book, book.author, 5, None, None)
        self.assertEqual(listing, "The Hobbit by J. R. R. Tolkien: 5 stars")

    def test_should_prefix_title_with_prize_winning_when_book_supplied(self):
        book = Book("The Hobbit", "J. R. R. Tolkien")
        listing = BookListingFormatter.create_listing_text(book, book.author, 5, "Fancy Prize", None)
        self.assertEqual(listing, "Fancy Prize winner - The Hobbit by J. R. R. Tolkien: 5 stars")

    def test_should_append_winner_of_author_prize_when_supplied(self):
        book = Book("The Hobbit", "J. R. R. Tolkien")
        listing = BookListingFormatter.create_listing_text(book, book.author, 5, "Fancy Prize", "Awesome Award")
        self.assertEqual(listing, "Fancy Prize winner - The Hobbit by J. R. R. Tolkien (Winner of Awesome Award): 5 stars")

if __name__ == "__main__":
    unittest.main()
