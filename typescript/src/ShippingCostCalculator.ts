import { Book } from "./Book";

export class ShippingCostCalculator {
  public static calculateShipping(customerName: string, customerId: number, books: Book[], firstLineOfAddress: string, secondLineOfAddress: string, thirdLineOfAddress: string, forthLineOfAddress: string, country: string): number {
    if (country !== 'UK') {
      return 15.99;
    }

    if (books.length > 10) {
      return 0;
    } else if (books.length > 5) {
      return 5.99;
    } else {
      return 1.99;
    }
  }
}  