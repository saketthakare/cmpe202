# Alternate implementation for LAB 4

## Diagrams Inlcluded

## Class List

1. **Resturant** This class handles a customer list and manages table states
2. **TableFullState** State indicates that all the tables are full
3. **TableVacantState** State indicates that there's a table vacant and can accept customer
4. **Customer** This class recieves notification from Resturant and provides decision to accept/reject offer

## Explanation for choosing Observer and State Pattern

**Obeserver** 

Observer pattern seems more accurate since the customers are observing changes in resturant and also the resturant-customers is one to many relationship (one resturant to multiple customers).


**State Pattern**

In customer tracking system every event can be realted to a certain change in the state. Also using state provides easier addition of other functionality/support for future addition such as the 'table done with food ready to receive the bill'. 