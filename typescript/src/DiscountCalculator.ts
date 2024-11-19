export class DiscountCalculator {
    public static calculateDiscount(orderTotal: number, customerType: string): number {
        if (customerType === 'VIP') {
            return orderTotal * 0.1;
        }

        return orderTotal < 100 ? 0 : orderTotal * 0.05;
    }
}
