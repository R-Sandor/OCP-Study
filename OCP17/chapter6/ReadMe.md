# Classes

## Constructors
### Final Variables 
  - A catch with final variables is that they must be set by exactly once by the constructor. 
Any calls to other constructors must set that field. 
  - In short every constructor must ensure that all the fields are set, and upon going to the next constructor it becomes that constructors duty to set all the fields.
