# Generics and Collections

## Generics 
### Dealing with Wild Cards. 
- Important to note that the wildcards must match between class instances for example: 
  ` Packaging<Envelope> p1 = new Packaging<Bag>(); // Does not compile even if Envelope is a subclass`

### Extends 
- Objects can not be added to collection that extends because the compiler can not determine what the collection is of. 

### Super
- Objects can be added to Collections with super because everything can be cast to the super class. 
