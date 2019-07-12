# Decorator Pattern
As part of learning Head First Design Patterns book's in DANA, here it is the Decorator Pattern.

"Design Eye for the Inheritence Guy".
Once we know the techniques of decorationg, we'll be able to give us (or someone else's) objects new responsibilities without making any code changes to the underlying classes. Decorator pattern defined as attaches additional responsibilities to an object dynamically;

### Starbuzz Coffee
Starbuzz Coffee is one of the most popular coffee shop. Their shops are already every corner in town. But now their scrambling  to update their ordering systems to match their beverage offerings. They designed their classes like this when they first went into bussiness.
![alt text](https://github.com/abrakitlaw/decorator-pattern-learning/blob/master/Screenshot%202019-07-12%20at%2014.04.04.png)

But after they try to design their system to support the requirement nowdays, here is their first approach.
![alt text](https://github.com/abrakitlaw/decorator-pattern-learning/blob/master/Screenshot%202019-07-12%20at%2014.32.40.png)

It is pretty obvious that Starbuzz has created a maintenance nightmare for themselves. What happens when the price of milk goes up? what do the do when they add a new caramel topping?

We can think of decorator objects as "wrappers"
