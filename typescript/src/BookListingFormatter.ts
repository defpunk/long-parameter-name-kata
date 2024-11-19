import { Book } from "./Book";

export class BookListingFormatter {
    public static createListingText(book: Book, author: string, starRating: number | null, bookPrize: string | null, authorPrize: string | null): string {
      let listing = '';
  
      if (bookPrize !== null && bookPrize.length > 0) {
        listing += `${bookPrize} winner - `;
      }
  
      listing += `${book.getTitle()} by ${author}`;
  
      if (authorPrize !== null && authorPrize.length > 0) {
        listing += ` (Winner of ${authorPrize})`;
      }
  
      if (starRating !== null) {
        if (starRating === 1) {
          listing += ': 1 star';
        } else {
          listing += `: ${starRating} stars`;
        }
      }
  
      return listing;
    }
  }
  