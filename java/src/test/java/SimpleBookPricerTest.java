import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.closeTo;

import org.junit.jupiter.api.Test;


class SimpleBookPricerTest {

    @Test
    void price_should_be_rrp_when_type_is_paperback(){
        double rrp = 4.99;
        double price = SimpleBookPricer.calculatePrice("title", "Author", Book.Type.PAPERBACK, rrp, 99);
        assertThat(price, equalTo(rrp));
    }

    @Test
    void price_should_be_rrp_minus_2_when_type_is_hardback_and_month_is_0(){
        double rrp = 16.99;
        double price = SimpleBookPricer.calculatePrice("title", "Author", Book.Type.HARDBACK, rrp, 0);
        assertThat(price, closeTo(14.99, 0.001));
    }

    @Test
    void price_should_be_rrp_when_type_is_hardback_and_month_is_between_1_and_6(){
        double rrp = 16.99;
        double price = SimpleBookPricer.calculatePrice("title", "Author", Book.Type.HARDBACK, rrp, 6);
        assertThat(price, closeTo(rrp, 0.001));
    }

    @Test
    void price_should_be__50_percent_rrp_when_type_is_hardback_and_month_greater_than_6(){
        double rrp = 10;
        double price = SimpleBookPricer.calculatePrice("title", "Author", Book.Type.HARDBACK, rrp, 7);
        assertThat(price, closeTo(5, 0.001));
    }
}
