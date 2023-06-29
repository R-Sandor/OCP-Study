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
## Scope
- Access to variables is not just determined by the classes themselves. For Example in Enclosing.Java the OutOfScope Object is created inside of the of the Enclosing class. And because of this the OutOfScope Object can access the private variables of the nested class, when it is call in its val() method, the object does not compile.

## Enums 
- Must have private constructor.
- Must have semicolon at the end of the enumerations. 
- Strangely can reference the enumerations in the enum class itself. 

## Sealed Classes
### Rules
- A sealed class permits which interfaces and classes may extend/implement the class. 
- All permited classes must extend the class at compile time. 
- Classes that extend the class must be marked sealed (with permits), final, or non-sealed. 

### Delcaration 
- acess_modifier seal_type class/interface class_name optional_permits { } 
  - Example: 
  ```
     public sealed Frog permits BullFrog {}
     public final class BullFrog extends Frog {}
  ```   
    
