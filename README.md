# PromotionEngine

This is simple Spring Boot App that provides swagger UI to add products to cart via REST API
Remove items from cart and calculate the final price of cart after applying promotion on all the products.

com.promotion.promotionrules package provides a single business rule that serves below two types of promotions
•	buy 'n' items of a SKU for a fixed price (3 A's for 130)
•	buy SKU 1 & SKU 2 for a fixed price ( C + D = 30 )

We can add multiple promotion business logic in this package and expose via REST API

These APIs can interact with frontend and provide the final price of cart for the added products based on the promotion engine computation

This project can be enhanced by adding valid DAO layer for DB interaction and loggers wherever needed to trace errors.
If business rules are too complex and have to maintained by business users we can add all these rules in excel sheet
and use Drool Engine to apply promotions on products.

Excel sheets can be easily altered by business and no deployment would be required