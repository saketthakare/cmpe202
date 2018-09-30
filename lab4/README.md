# CMPE-202 LAB 4

## Diagrams Included (CRC + State)

1. [CRCCustomer.png](CRCCustomer.png)
2. [CRCResturant.png](CRCResturant.png)
3. [CRCTableFullState.png](CRCTableFullState.png)
4. [CRCTableVacantState.png](CRCTableVacantState.png)
5. [ClassDiagram.jpg](ClassDiagram.jpg)


## Class List

1. **Resturant** This class handles a customer waitlist, manages table states and also notifies the eligible customers
2. **TableFullState** State indicates that all the tables are full (Note : no functionality added in TableFullState; Implemented for future addition)
3. **TableVacantState** State indicates that there's a table vacant and can accept customer
4. **Customer** This class informs the Resturant to add the customer into waitlist, receives notification from Resturant and provides a decision to accept/reject the vacancy offer

## Explanation for choosing Observer and State Pattern

**Observer Pattern** 

Observer pattern seems more accurate since the customers are observing changes in restaurant and also the restaurant-customers is one to many relationships (one restaurant to multiple customers).


**State Pattern**

In customer tracking system every event can be related to a certain change in the state. Also using state provides the easier addition of other functionality/support for a future addition such as the 'table done with food ready to receive the bill'.