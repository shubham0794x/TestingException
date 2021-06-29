## ExceptionTesting

- Exception testing syntax in JUnit

JUnit provides an option of tracing the exception handling of code. You can test whether the code throws a desired exception or not. The expected parameter is used along with
  @Test annotation, assertThrows(IllegalArgumentException.class)


## Testing Object Equality

- All objects extend the Object class which has equals, hashCode, and toString methods
- We can override the equals and hashCode methods for deep equality or customized equality

Suppose we are building a Personal Book Inventory System for a service like Goodreads. The following Book class has overridden the equals, hashCode, and toString methods to facilitate custom equality checks. This is especially useful for testing.
Note that isbn is a unique identifier and is excluded from our definition of equality.

Object equality is super important when we want to test that an object being returned from the database looks the way we expect. In the case of testing database data, we will need a custom equality method to ignore the unique id.

The toString method helps us identify how our objects are different when an assertion fails, rather than being provided the memory address of the compared objects.
