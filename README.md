# PromotionEngine

This is simple Spring Boot App that provides swagger UI to add products to cart via REST API
Remove items from cart and calculate the final price of cart after applying promotion on all the products.

com.promotion.promotionrules package provides a single business rule that serves below 3 types of active promotions
* 3 of A's for 130,
* 2 of B's for 45,
* C & D for 30

We can add multiple promotion business logic in this package and expose via REST API

These APIs can interact with frontend and provide the final price of cart for the added products based on the promotion engine computation

This project can be enhanced by adding valid DAO layer for DB interaction and loggers wherever needed to trace errors.
If business rules are too complex and have to maintained by business users we can add all these rules in excel sheet
and use Drool Engine to apply promotions on products.

Excel sheets can be easily altered by business and no deployment would be required

localhost:8080/swagger-ui.html