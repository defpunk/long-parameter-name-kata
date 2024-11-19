import { Book, BookType } from "./Book";


export class SimpleBookPricer {
    public static calculatePrice(
        title: string,
        author: string,
        type: BookType,
        rrp: number,
        month: number
    ): number {
        if (type === BookType.PAPERBACK) {
            return rrp;
        }

        if (month > 6) {
            const discountedPrice = rrp / 2;
            return Math.round(discountedPrice);
        }

        let discount = 0;

        if (month === 0) {
            discount = 2;
        }

        return rrp - discount;
    }
}
