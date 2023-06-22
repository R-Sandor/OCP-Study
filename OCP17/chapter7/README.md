# Beyond Classes (Interfaces and Abstract Classes)

## Abstract Classes 

### Methods
Interface  methods delcared without a body in interfaces are implicitly abstract, it is not an in abstract class. 
Always declare abstract methods abstract in the declaration.

## Inner Classes 
https://stackoverflow.com/questions/663059/why-do-inner-classes-make-private-methods-accessible
```
...inner classes can access all members of the declaring class, even private members. In fact, the inner class itself is said to be a member of the class; therefore, following the rules of object-oriented engineering, it should have access to all members of the class.

And following from that, since both inner classes are really just part of the containing class, they should be able to access each others private members as well.
```

