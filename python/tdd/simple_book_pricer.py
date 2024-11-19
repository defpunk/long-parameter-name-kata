def calculate_price(title, author, book_type, rrp, month):
    if book_type == "PAPERBACK":
        return rrp
    elif book_type == "HARDBACK":
        if month == 0:
            return rrp - 2
        elif month >= 1 and month <= 6:
            return rrp
        else:
            return rrp * 0.5
    else:
        raise ValueError("Invalid book type")
