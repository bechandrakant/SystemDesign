# Builder Design Pattern

A type of creational design pattern.  

Steps:
1. Create a class with fields.
2. Create getter method for fields.
3. Make Constructor private
4. Create static inner class and copy the fields from outer class.
5. Create a static builder method which returns Inner class instance.
6. Create a build method that returns parent class instance with mapped fields
7. Create setter method for fields in inner class that returns InnerClass instance.