import { BookType } from './Book';
import { SimpleBookPricer } from './SimpleBookPricer';

describe('SimpleBookPricer', () => {
  test('Price should be RRP when type is paperback', () => {
    const rrp = 4.99;
    const price = SimpleBookPricer.calculatePrice('title', 'Author', BookType.PAPERBACK, rrp, 99);
    expect(price).toBeCloseTo(rrp, 6);
  });

  test('Price should be RRP minus 2 when type is hardback and month is 0', () => {
    const rrp = 16.99;
    const price = SimpleBookPricer.calculatePrice('title', 'Author', BookType.HARDBACK, rrp, 0);
    expect(price).toBeCloseTo(14.99, 6);
  });

  test('Price should be RRP when type is hardback and month is between 1 and 6', () => {
    const rrp = 16.99;
    const price = SimpleBookPricer.calculatePrice('title', 'Author', BookType.HARDBACK, rrp, 6);
    expect(price).toBeCloseTo(rrp, 6);
  });

  test('Price should be 50 percent RRP when type is hardback and month greater than 6', () => {
    const rrp = 10;
    const price = SimpleBookPricer.calculatePrice('title', 'Author', BookType.HARDBACK, rrp, 7);
    expect(price).toBeCloseTo(5, 6);
  });
});
