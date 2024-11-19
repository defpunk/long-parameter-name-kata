import { DiscountCalculator } from './DiscountCalculator';

describe('DiscountCalculator', () => {
  test('discount should be 10 percent of order for VIP customers', () => {
    const discount = DiscountCalculator.calculateDiscount(100, 'VIP');
    expect(discount).toBe(10);
  });

  test('discount should be 0 for standard customer when order under 100', () => {
    const discount = DiscountCalculator.calculateDiscount(99, 'STANDARD');
    expect(discount).toBe(0);
  });

  test('discount should be 5 for standard customer when order is 100', () => {
    const discount = DiscountCalculator.calculateDiscount(100, 'STANDARD');
    expect(discount).toBe(5);
  });
});
