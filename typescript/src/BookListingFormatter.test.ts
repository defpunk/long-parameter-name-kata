import { Book } from './Book';

import { BookListingFormatter } from './BookListingFormatter';

describe('BookListingFormatter', () => {
  it('should display title followed by author when no ratings or prizes', () => {
    const book = new Book('The Hobbit', 'J. R. R. Tolkien');
    const listing = BookListingFormatter.createListingText(book, book.getAuthor(), null, null, null);
    expect(listing).toBe('The Hobbit by J. R. R. Tolkien');
  });

  it('should display title followed by author and rating when no prizes and rating is 1', () => {
    const book = new Book('The Hobbit', 'J. R. R. Tolkien');
    const listing = BookListingFormatter.createListingText(book, book.getAuthor(), 1, null, null);
    expect(listing).toBe('The Hobbit by J. R. R. Tolkien: 1 star');
  });

  it('should display title followed by author and rating when no prizes and rating is 5', () => {
    const book = new Book('The Hobbit', 'J. R. R. Tolkien');
    const listing = BookListingFormatter.createListingText(book, book.getAuthor(), 5, null, null);
    expect(listing).toBe('The Hobbit by J. R. R. Tolkien: 5 stars');
  });

  it('should prefix title with prize winning when book supplied', () => {
    const book = new Book('The Hobbit', 'J. R. R. Tolkien');
    const listing = BookListingFormatter.createListingText(book, book.getAuthor(), 5, 'Fancy Prize', null);
    expect(listing).toBe('Fancy Prize winner - The Hobbit by J. R. R. Tolkien: 5 stars');
  });

  it('should append winner of author prize when supplied', () => {
    const book = new Book('The Hobbit', 'J. R. R. Tolkien');
    const listing = BookListingFormatter.createListingText(book, book.getAuthor(), 5, 'Fancy Prize', 'Awesome Award');
    expect(listing).toBe('Fancy Prize winner - The Hobbit by J. R. R. Tolkien (Winner of Awesome Award): 5 stars');
  });
});
