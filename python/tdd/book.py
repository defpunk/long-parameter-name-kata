import enum

class Type(enum.Enum):
    HARDBACK = 1
    PAPERBACK = 2

class Book:
    def __init__(self, title, author):
        self.title = title
        self.author = author
        self.recomended_retail_price = None
        self.type = None
        self.months_since_publication = None

    def get_recomended_retail_price(self):
        return self.recomended_retail_price

    def set_recomended_retail_price(self, recomended_retail_price):
        self.recomended_retail_price = recomended_retail_price

    def get_type(self):
        return self.type

    def set_type(self, type_):
        self.type = type_

    def get_months_since_publication(self):
        return self.months_since_publication

    def set_months_since_publication(self, months_since_publication):
        self.months_since_publication = months_since_publication