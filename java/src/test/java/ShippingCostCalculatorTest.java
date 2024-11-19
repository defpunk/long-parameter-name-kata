import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class ShippingCostCalculatorTest {

    @Test
    void hipping_should_be_1_99_when_order_country_is_uk_and_book_count_is_1(){
        Book[] books = new Book[]{new Book("Fly fishing", "J R Hartley")};
        double shipping = ShippingCostCalculator.calculateShipping("name", 1, books, "Line 1", "Line 2", null, "Liverpool", "UK"); 
        assertThat(shipping, is(1.99));
    }

    @Test
    void shipping_should_be_5_99_when_order_country_is_uk_and_book_count_is_over_5(){
        Book[] books = {
            new Book("Clean Code: A Handbook of Agile Software Craftsmanship", "Robert C. Martin"),
            new Book("The Pragmatic Programmer: From Journeyman to Master", "David Thomas, Andrew Hunt"),
            new Book("Design Patterns: Elements of Reusable Object-Oriented Software", "Erich Gamma, Richard Helm, Ralph Johnson, John Vlissides"),
            new Book("Head First Design Patterns: A Brain-Friendly Guide", "Eric Freeman, Elisabeth Robson, Bert Bates, Kathy Sierra"),
            new Book("Refactoring: Improving the Design of Existing Code", "Martin Fowler"),
            new Book("Code Complete: A Practical Handbook of Software Construction", "Steve McConnell")
        };
        
        double shipping = ShippingCostCalculator.calculateShipping("name", 1, books, "Line 1", "Line 2", null, "Liverpool", "UK"); 
        assertThat(shipping, is(5.99));
    }

    @Test
    void shipping_should_be__0_when_order_country_is_uk_and_book_count_is_over_10(){
        Book[] books = {
            new Book("Getting Things Done: The Art of Stress-Free Productivity", "David Allen"),
            new Book("The 7 Habits of Highly Effective People", "Stephen R. Covey"),
            new Book("Atomic Habits: An Easy & Proven Way to Build Good Habits & Break Bad Ones", "James Clear"),
            new Book("The One Thing: The Surprisingly Simple Truth Behind Extraordinary Results", "Gary Keller"),
            new Book("Deep Work: Rules for Focused Success in a Distracted World", "Cal Newport"),
            new Book("Eat That Frog!: 21 Great Ways to Stop Procrastinating and Get More Done in Less Time", "Brian Tracy"),
            new Book("The Power of Less: The Fine Art of Limiting Yourself to the Essential", "Leo Babauta"),
            new Book("The 4 Disciplines of Execution: Achieving Your Wildly Important Goals", "Chris McChesney, Sean Covey, Jim Huling"),
            new Book("Essentialism: The Disciplined Pursuit of Less", "Greg McKeown"),
            new Book("Smarter Faster Better: The Transformative Power of Real Productivity", "Charles Duhigg"),
            new Book("The 80/20 Principle: The Secret to Achieving More with Less", "Richard Koch")
        };
        
        
        double shipping = ShippingCostCalculator.calculateShipping("name", 1, books, "Line 1", "Line 2", null, "Liverpool", "UK"); 
        assertThat(shipping, is(0d));
    }


    @Test
    void shipping_should_be_15_99_when_order_country_is_not_uk(){
        Book[] books = {
            new Book("Clean Code: A Handbook of Agile Software Craftsmanship", "Robert C. Martin"),
            new Book("The Pragmatic Programmer: From Journeyman to Master", "David Thomas, Andrew Hunt"),
            new Book("Design Patterns: Elements of Reusable Object-Oriented Software", "Erich Gamma, Richard Helm, Ralph Johnson, John Vlissides"),
            new Book("Head First Design Patterns: A Brain-Friendly Guide", "Eric Freeman, Elisabeth Robson, Bert Bates, Kathy Sierra"),
            new Book("Refactoring: Improving the Design of Existing Code", "Martin Fowler"),
            new Book("Code Complete: A Practical Handbook of Software Construction", "Steve McConnell")
        };
        
        double shipping = ShippingCostCalculator.calculateShipping("name", 1, books, "Line 1", "Line 2", null, "Beach town", "Spain"); 
        assertThat(shipping, is(15.99));
    }
}
