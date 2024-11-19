class DiscountCalculator:
    @staticmethod
    def calculate_discount(order_total, customer_type):
        if customer_type == "VIP":
            return order_total * 0.1
        else:
            return 0 if order_total < 100 else order_total * 0.05
