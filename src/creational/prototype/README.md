## Prototype Pattern

When object creation takes time. We clone an object and change necessary fields.

If we want to decouple client code from our code.  

Steps:
1. Create a cloneable interface with clone method
2. Make subclasses that implements clone method.
3. Implement clone method
4. Create a prototype (A constructor without heavy field)
5. Create a no args constructor
5. Create Registry Class (Ideally singleton) with addPrototype and getPrototype methods.