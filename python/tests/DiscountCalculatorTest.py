import unittest
from tdd.discount_calculator import DiscountCalculator

class DiscountCalculatorTest(unittest.TestCase):

    def test_discount_should_be_10_percent_of_order_for_VIP_customers(self):
        discount = DiscountCalculator.calculate_discount(100, "VIP")
        self.assertEqual(discount, 10)

    def test_discount_should_be_0_for_standard_customer_when_order_under_100(self):
        discount = DiscountCalculator.calculate_discount(99, "STANDARD")
        self.assertEqual(discount, 0)

    def test_discount_should_be_5_for_standard_customer_when_order_is_100(self):
        discount = DiscountCalculator.calculate_discount(100, "STANDARD")
        self.assertEqual(discount, 5)

if __name__ == "__main__":
    unittest.main()
