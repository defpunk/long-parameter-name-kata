class ShippingCostCalculator:
    @staticmethod
    def calculate_shipping(customer_name, customer_id, books, first_line_of_address, second_line_of_address, third_line_of_address, fourth_line_of_address, country):
        if country != "UK":
            return 15.99
        if len(books) > 10:
            return 0
        elif len(books) > 5:
            return 5.99
        else:
            return 1.99
