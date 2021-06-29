## ExceptionTesting

- Exception testing syntax in JUnit


## TestingObjectEquality

- all objects extend the Object class which has equals, hashCode, and toString methods
- We can override the equals and hashCode methods for deep equality or customized equality

Suppose we are building a Personal Book Inventory System for a service like Goodreads. The following Book class has overridden the equals, hashCode, and toString methods to facilitate custom equality checks. This is especially useful for testing.
Note that isbn is a unique identifier and is excluded from our definition of equality.
