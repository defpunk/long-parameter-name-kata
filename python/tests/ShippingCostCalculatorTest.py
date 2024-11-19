import unittest
from tdd.shipping_cost_calculator import ShippingCostCalculator

class ShippingCostCalculatorTest(unittest.TestCase):
    @staticmethod
    def create_book(title, author):
        class Book:
            def __init__(self, title, author):
                self.title = title
                self.author = author
        return Book(title, author)

    def test_shipping_should_be_1_99_when_order_country_is_uk_and_book_count_is_1(self):
        books = [self.create_book("Fly fishing", "J R Hartley")]
        shipping = ShippingCostCalculator.calculate_shipping("name", 1, books, "Line 1", "Line 2", None, "Liverpool", "UK")
        self.assertEqual(shipping, 1.99)


    def test_shipping_should_be_5_99_when_order_country_is_uk_and_book_count_is_over_5(self):
        books = [
            self.create_book("Clean Code: A Handbook of Agile Software Craftsmanship", "Robert C. Martin"),
            self.create_book("The Pragmatic Programmer: From Journeyman to Master", "David Thomas, Andrew Hunt"),
            self.create_book("Design Patterns: Elements of Reusable Object-Oriented Software", "Erich Gamma, Richard Helm, Ralph Johnson, John Vlissides"),
            self.create_book("Head First Design Patterns: A Brain-Friendly Guide", "Eric Freeman, Elisabeth Robson, Bert Bates, Kathy Sierra"),
            self.create_book("Refactoring: Improving the Design of Existing Code", "Martin Fowler"),
            self.create_book("Code Complete: A Practical Handbook of Software Construction", "Steve McConnell")
        ]

        shipping = ShippingCostCalculator.calculate_shipping("name", 1, books, "Line 1", "Line 2", None, "Liverpool", "UK")
        self.assertEqual(shipping, 5.99)


    def test_shipping_should_be_0_when_order_country_is_uk_and_book_count_is_over_10(self):
        books = [
            self.create_book("Getting Things Done: The Art of Stress-Free Productivity", "David Allen"),
            self.create_book("The 7 Habits of Highly Effective People", "Stephen R. Covey"),
            self.create_book("Atomic Habits: An Easy & Proven Way to Build Good Habits & Break Bad Ones", "James Clear"),
            self.create_book("The One Thing: The Surprisingly Simple Truth Behind Extraordinary Results", "Gary Keller"),
            self.create_book("Deep Work: Rules for Focused Success in a Distracted World", "Cal Newport"),
            self.create_book("Eat That Frog!: 21 Great Ways to Stop Procrastinating and Get More Done in Less Time", "Brian Tracy"),
            self.create_book("The Power of Less: The Fine Art of Limiting Yourself to the Essential", "Leo Babauta"),
            self.create_book("The Miracle Morning: The Not-So-Obvious Secret Guaranteed to Transform Your Life", "Hal Elrod"),
            self.create_book("The 4 Disciplines of Execution: Achieving Your Wildly Important Goals", "Chris McChesney, Sean Covey, Jim Huling"),
            self.create_book("Start with Why: How Great Leaders Inspire Everyone to Take Action", "Simon Sinek"),
            self.create_book("Extreme Ownership: How U.S. Navy SEALs Lead and Win", "Jocko Willink, Leif Babin")
        ]

        shipping = ShippingCostCalculator.calculate_shipping("name", 1, books, "Line 1", "Line 2", None, "Liverpool", "UK")
        self.assertEqual(shipping, 0)


    def test_shipping_should_be_15_99_when_order_country_is_not_uk(self):
        books = [
            self.create_book("Clean Code: A Handbook of Agile Software Craftsmanship", "Robert C. Martin"),
            self.create_book("The Pragmatic Programmer: From Journeyman to Master", "David Thomas, Andrew Hunt"),
            self.create_book("Design Patterns: Elements of Reusable Object-Oriented Software", "Erich Gamma, Richard Helm, Ralph Johnson, John Vlissides"),
            self.create_book("Head First Design Patterns: A Brain-Friendly Guide", "Eric Freeman, Elisabeth Robson, Bert Bates, Kathy Sierra"),
            self.create_book("Refactoring: Improving the Design of Existing Code", "Martin Fowler"),
            self.create_book("Code Complete: A Practical Handbook of Software Construction", "Steve McConnell")
        ]

        shipping = ShippingCostCalculator.calculate_shipping("name", 1, books, "Line 1", "Line 2", None, "Beach town", "Spain")
        self.assertEqual(shipping, 15.99)

