import unittest

from tdd.simple_book_pricer import calculate_price

class SimpleBookPricerTest(unittest.TestCase):

    def test_price_should_be_rrp_when_type_is_paperback(self):
        rrp = 4.99
        price = calculate_price("title", "Author", "PAPERBACK", rrp, 99)
        self.assertEqual(price, rrp)

    def test_price_should_be_rrp_minus_2_when_type_is_hardback_and_month_is_0(self):
        rrp = 16.99
        price = calculate_price("title", "Author", "HARDBACK", rrp, 0)
        self.assertAlmostEqual(price, 14.99, delta=0.001)

    def test_price_should_be_rrp_when_type_is_hardback_and_month_is_between_1_and_6(self):
        rrp = 16.99
        price = calculate_price("title", "Author", "HARDBACK", rrp, 6)
        self.assertAlmostEqual(price, rrp, delta=0.001)

    def test_price_should_be_50_percent_rrp_when_type_is_hardback_and_month_greater_than_6(self):
        rrp = 10
        price = calculate_price("title", "Author", "HARDBACK", rrp, 7)
        self.assertAlmostEqual(price, 5, delta=0.001)

if __name__ == "__main__":
    unittest.main()

