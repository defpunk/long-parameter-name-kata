import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;

class DiscountCalculatorTest {
    
    @Test
    void discount_should_be_10_percent_of_order_for_VIP_customers(){
        double discount = DiscountCalculator.calculateDiscount(100, "VIP");
        assertThat(discount, is(10d));
    }

    @Test
    void discount_should_be_0_for_standard_customer_when_order_under_100(){
        double discount = DiscountCalculator.calculateDiscount(99, "STANDARD");
        assertThat(discount, is(0d));
    }

    @Test
    void discount_should_be_5_for_standard_customer_when_order_is_100(){
        double discount = DiscountCalculator.calculateDiscount(100, "STANDARD");
        assertThat(discount, is(5d));
    }
}
